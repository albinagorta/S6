package com.montoya.appfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class FgtLista extends Fragment {
  ListView lstPer;
  List<Persona> data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.lyt_fragment_lista,container,false);
        return v;
    }

   
}
 @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lstPer=getView().findViewById(R.id.lstPer);
        data=new ArrayList<>();
        data.add(new Persona(1,"Dany Montoya","965874478",
                "danyjmn@gmail.com","Developer",R.drawable.foto1));
        data.add(new Persona(2,"Leonardo Montoya","999968665",
                "leoxmm@gmail.com","Developer",R.drawable.foto2));
        data.add(new Persona(3,"Juan Montoya","965874478",
                "jmontoya@gmail.com","Developer",R.drawable.foto3));
        data.add(new Persona(4,"Samuel Montoya","965874478",
                "samuelmonto@gmail.com","Developer",R.drawable.foto4));
       
        List<String> dataNom=new ArrayList<>();
        for(Persona p:data){
            dataNom.add(p.getNom());
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getActivity(),
                                   android.R.layout.simple_list_item_1,dataNom);
        lstPer.setAdapter(adapter);
        lstPer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ((IPersona)getActivity()).seleccionarPersona(data.get(position));
            }
        });
    }
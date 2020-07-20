package com.montoya.appfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FgtDetalle extends Fragment {
TextView  txvNom,txvTel,txvEma,txvGru;
ImageView imgFoto;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.lyt_fragment_detalle,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    txvNom=getView().findViewById(R.id.txvNom);
    txvTel=getView().findViewById(R.id.txvTel);
    txvEma=getView().findViewById(R.id.txvEma);
    txvGru=getView().findViewById(R.id.txvGru);
    imgFoto=getView().findViewById(R.id.imgFoto);
    }
    public  void mostrarDatos(Persona persona){
        txvNom.setText(persona.getNom());
        txvTel.setText(persona.getTel());
        txvEma.setText(persona.getEmail());
        txvGru.setText(persona.getGru());
        imgFoto.setImageResource(persona.getIdImg());
    }
}

package com.montoya.appfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements  IPersona{
    FgtLista fgtLista;
    FgtDetalle fgtDetalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_principal);
        asignarReferencias();
    }
    private void asignarReferencias() {
        fgtLista= (FgtLista) getSupportFragmentManager().findFragmentById(R.id.fgtLis);
        fgtDetalle= (FgtDetalle) getSupportFragmentManager().findFragmentById(R.id.fgtDet);
    }

    @Override
    public void seleccionarPersona(Persona persona) {
        fgtDetalle.mostrarDatos(persona);
    }
}
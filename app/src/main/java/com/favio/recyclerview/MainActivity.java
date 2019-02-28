package com.favio.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.favio.recyclerview.adaptadores.AdaptadorPersona;
import com.favio.recyclerview.modelos.Persona;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_lista;
    ArrayList<Persona> listaPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_lista=(RecyclerView) findViewById(R.id.rv_lista);

        listaPersonas = new ArrayList<Persona>();
        listaPersonas.add(new Persona(1,"Olga", "Robles",20));
        listaPersonas.add(new Persona(2,"María", "Hernández",16));
        listaPersonas.add(new Persona(3,"Fernando", "Castañeda",27));

        AdaptadorPersona adaptador=new AdaptadorPersona(listaPersonas);

        rv_lista.setLayoutManager(new LinearLayoutManager(this));
        rv_lista.setAdapter(adaptador);
    }
}

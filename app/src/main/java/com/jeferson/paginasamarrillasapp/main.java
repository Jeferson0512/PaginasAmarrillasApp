package com.jeferson.paginasamarrillasapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class main extends AppCompatActivity{

    private ArrayList<Restaurante> restaurantes;
    private ListView lvAnimales;
    private RestauranteAdapter  adapter;
    private TextView tvNombre, tvNumCelda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restaurantes = new ArrayList<Restaurante>();

        rellenarRestaurante();

        tvNombre = (TextView)findViewById(R.id.tvItemContent);
        tvNumCelda = (TextView)findViewById(R.id.tvItemField);

        adapter = new RestauranteAdapter(this, restaurantes);

        lvAnimales = (ListView) findViewById(R.id.lvItems);
        lvAnimales.setAdapter(adapter);

    }
    public void rellenarRestaurante(){
        restaurantes.add(new Restaurante("SANDWICH QBANO","C1 81 13-05 L-405 C.C. Atlantis plaza","(1) 6083932",R.mipmap.qbano));
        restaurantes.add(new Restaurante("JENO'S PIZZA","Domicilio 4259525","(1) 3451100",R.mipmap.jenos));
        restaurantes.add(new Restaurante("COMPAÑIA DEL SABOR","Tr93 53-48 Int 84","(1) 2242625",R.mipmap.compania));
        restaurantes.add(new Restaurante("PIZZAS PICCOLO","Av CI 26 62-47","(1) 4897490",R.mipmap.piccolo));
    }


}

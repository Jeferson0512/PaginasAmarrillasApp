package com.jeferson.paginasamarrillasapp;

import android.app.Dialog;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class BuscarActivity extends AppCompatActivity {

    private ListView lista = null;
    private ArrayList<Data> arrayData = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);
        showFirstFragment(null);
        setContentView(R.layout.activity_list_first_fragment);

         lista = (ListView)findViewById(R.id.Lista);

        arrayData = new ArrayList<>();

        Bundle datos = getIntent().getExtras();
        String dato = datos.getString("buscado");

        if(dato.equalsIgnoreCase("Restaurante")){
            ListaRestaurant();
        }

    }

    public void ListaRestaurant(){
        arrayData.add(new Data("SANDWICH QBANO","C1 81 13-05 L-405 C.C. Atlantis plaza","(1) 6083932",R.mipmap.qbano));
        arrayData.add(new Data("JENO'S PIZZA","Domicilio 4259525","(1) 3451100",R.mipmap.jenos));
        arrayData.add(new Data("COMPAÑIA DEL SABOR","Tr93 53-48 Int 84","(1) 2242625",R.mipmap.compania));
        arrayData.add(new Data("PIZZAS PICCOLO","Av CI 26 62-47","(1) 4897490",R.mipmap.piccolo));

        ArrayAdapter adaptador = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayData);
        lista.setAdapter(adaptador);

    }

    public void showFirstFragment(View view){
        // Get FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Create FirstFragment
        Fragment fragment = new ListFirstFragment();

        // Replace content
        fragmentManager.beginTransaction().replace(R.id.content, fragment).addToBackStack("tag").commit();
    }

    public void showSecondFragment(View view){
        // Get FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Create FirstFragment
        Fragment fragment = new ViewSecondFragment();

        // Send 'param1' argument to Fragment
        Bundle args = new Bundle();
        args.putString("param1", "Hello Fragment!");
        fragment.setArguments(args);

        // Replace content
        fragmentManager.beginTransaction().replace(R.id.content, fragment).addToBackStack("tag").commit();
    }

}

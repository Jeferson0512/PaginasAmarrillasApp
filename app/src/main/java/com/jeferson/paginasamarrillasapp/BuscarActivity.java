package com.jeferson.paginasamarrillasapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BuscarActivity extends AppCompatActivity {

    private ListView lista;
    private RestauranteAdapter adapter;
    private ArrayList<Restaurante> restaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        lista = (ListView)findViewById(R.id.lista_fragment);

        restaurantes = new ArrayList<Restaurante>();

        Bundle datos = getIntent().getExtras();
        String dato = datos.getString("buscado");



        if(dato.equalsIgnoreCase("Restaurante")){
            rellenarRestaurante();
            Toast.makeText(this, "Se encuentra  en " + dato, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"No se encontro ninngun dato",Toast.LENGTH_SHORT).show();
        }

    }

    public void rellenarRestaurante(){
        restaurantes.add(new Restaurante("SANDWICH QBANO","C1 81 13-05 L-405 C.C. Atlantis plaza","(1) 6083932",R.mipmap.qbano));
        restaurantes.add(new Restaurante("JENO'S PIZZA","Domicilio 4259525","(1) 3451100",R.mipmap.jenos));
        restaurantes.add(new Restaurante("COMPAÑIA DEL SABOR","Tr93 53-48 Int 84","(1) 2242625",R.mipmap.compania));
        restaurantes.add(new Restaurante("PIZZAS PICCOLO","Av CI 26 62-47","(1) 4897490",R.mipmap.piccolo));

        adapter = new RestauranteAdapter(this, restaurantes);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String id = String.valueOf(i);
                Intent intent = new Intent(BuscarActivity.this,Informacion.class);
                intent.putExtra("informacion",id);
                startActivity(intent);
            }
        });
    }

}

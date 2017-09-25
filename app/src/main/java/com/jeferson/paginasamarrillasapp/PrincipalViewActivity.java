package com.jeferson.paginasamarrillasapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class PrincipalViewActivity extends AppCompatActivity {

    private AutoCompleteTextView searchView;
    String [] viewBuscador = {"Restaurante","Colegios","Institutos"};
    ArrayAdapter<String> adapter;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_view);

        searchView = (AutoCompleteTextView) findViewById(R.id.buscador);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,viewBuscador);
        searchView.setAdapter(adapter);

        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrincipalViewActivity.this, BuscarActivity.class);
                intent.putExtra("buscado",searchView.getText().toString());
                startActivity(intent);

            }
        });


        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_buscar:
                        Toast.makeText(PrincipalViewActivity.this, "Ingresando al Buscador...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_localizar:
                        Toast.makeText(PrincipalViewActivity.this, "Localizando...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_ajustes:
                        Toast.makeText(PrincipalViewActivity.this, "Ingresando a Ajustes...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_rAumentada:
                        Toast.makeText(PrincipalViewActivity.this, "Ingresando a R. Aumentada...", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

    }

}

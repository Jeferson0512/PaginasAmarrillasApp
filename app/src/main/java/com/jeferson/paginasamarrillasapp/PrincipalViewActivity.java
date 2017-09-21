package com.jeferson.paginasamarrillasapp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class PrincipalViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_view);

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

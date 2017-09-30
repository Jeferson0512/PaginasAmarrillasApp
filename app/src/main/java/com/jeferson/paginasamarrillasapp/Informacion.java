package com.jeferson.paginasamarrillasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Informacion extends AppCompatActivity {

    private TextView informacion, titulo, direccion, telefono;
    private ImageView imagen;
    private ArrayList<Restaurante> restaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        informacion = (TextView)findViewById(R.id.informacion);
        titulo = (TextView)findViewById(R.id.inf_titulo);
        direccion =(TextView)findViewById(R.id.inf_direccion);
        telefono = (TextView)findViewById(R.id.inf_telefono);
        imagen = (ImageView)findViewById(R.id.inf_imagen);

        Bundle datos = getIntent().getExtras();
        String dato = datos.getString("informacion");

        if(dato.equals("0")){
            titulo.setText("SANDWICH QBANO");
            direccion.setText("C1 81 13-05 L-405 C.C. Atlantis plaza");
            telefono.setText("(1) 6083932");
            imagen.setImageResource(R.mipmap.qbano);
            informacion.setText("Jeno's Pizza es fundada en 1973 por Alfredo Gracia y Hernando Soto, estableciendo el primer punto de venta en el barrio el Lago de Bogotá. En 1976 abre un segundo establecimiento y en 1978 ya cuenta con cinco puntos de venta. Entre los años 80 y 90 Jeno’s Pizza entra en un proceso de expansión que lo lleva a crecer hasta los 60 puntos de venta. A principios de los años 90, también se crea la planta de producción y se estructura la empresa con sus gerencias.\n" +
                    "\n" +
                    "Originalmente la cadena de restaurantes estaba dirigida a atender a niños y familias, por lo que la demanda del mercado infantil lleva a la cadena a crear el 11 de diciembre de 1992 el Jeno's Club, puntos de venta con salas recreativas para niños.2\u200B En el año 2005 se decide renovar la marca modificando la identidad corporativa de la compañía y el material publicitario.");
            Toast.makeText(this, "Usted se encuentra en "+titulo.getText().toString(), Toast.LENGTH_SHORT).show();

        }else if(dato.equals("1")){
            titulo.setText("JENO'S PIZZA");
            direccion.setText("Domicilio 4259525");
            telefono.setText("(1) 3451100");
            imagen.setImageResource(R.mipmap.jenos);
            informacion.setText("Empresa dedicada a la comercialización de productos derivados del cerdo ibérico, a través de Internet, con la posibilidad de ir ampliando progresivamente la gama de productos agroalimentarios disponibles, siguiendo siempre la más estricta línea de calidad de nuestros productos (vinos, aceite, queso, miel, productos ecológicos...)\n" +
                    "\n" +
                    "    Comprar directamente y sin salir de su propia casa empieza a ser cada vez más extendida y al alcance de nuestra mano. Y nunca mejor dicho porque un ordenador personal un módem y una conexión a Internet son los únicos requisitos para que con un solo dedo podamos realizar nuestras compras de forma cómoda, rápida y sin movernos del sillón. La desventaja que tenemos los españoles es que la inmensa mayoría de los comercios virtuales se encuentran en Estados Unidos.");
            Toast.makeText(this, "Usted se encuentra en "+titulo.getText().toString(), Toast.LENGTH_SHORT).show();

        }else if(dato.equals("2")){
            titulo.setText("COMPAÑIA DEL SABOR");
            direccion.setText("Tr93 53-48 Int 84");
            telefono.setText("(1) 2242625");
            imagen.setImageResource(R.mipmap.compania);
            informacion.setText("Empresa dedicada a la comercialización de productos derivados del cerdo ibérico, a través de Internet, con la posibilidad de ir ampliando progresivamente la gama de productos agroalimentarios disponibles, siguiendo siempre la más estricta línea de calidad de nuestros productos (vinos, aceite, queso, miel, productos ecológicos...)\n" +
                    "\n" +
                    "    Comprar directamente y sin salir de su propia casa empieza a ser cada vez más extendida y al alcance de nuestra mano. Y nunca mejor dicho porque un ordenador personal un módem y una conexión a Internet son los únicos requisitos para que con un solo dedo podamos realizar nuestras compras de forma cómoda, rápida y sin movernos del sillón. La desventaja que tenemos los españoles es que la inmensa mayoría de los comercios virtuales se encuentran en Estados Unidos.");
            Toast.makeText(this, "Usted se encuentra en "+titulo.getText().toString(), Toast.LENGTH_SHORT).show();

        }else{
            titulo.setText("PIZZAS PICCOLO");
            direccion.setText("Av CI 26 62-47");
            telefono.setText("(1) 4897490");
            imagen.setImageResource(R.mipmap.piccolo);
            informacion.setText("Empresa dedicada a la comercialización de productos derivados del cerdo ibérico, a través de Internet, con la posibilidad de ir ampliando progresivamente la gama de productos agroalimentarios disponibles, siguiendo siempre la más estricta línea de calidad de nuestros productos (vinos, aceite, queso, miel, productos ecológicos...)\n" +
                    "\n" +
                    "    Comprar directamente y sin salir de su propia casa empieza a ser cada vez más extendida y al alcance de nuestra mano. Y nunca mejor dicho porque un ordenador personal un módem y una conexión a Internet son los únicos requisitos para que con un solo dedo podamos realizar nuestras compras de forma cómoda, rápida y sin movernos del sillón. La desventaja que tenemos los españoles es que la inmensa mayoría de los comercios virtuales se encuentran en Estados Unidos.");
            Toast.makeText(this, "Usted se encuentra en "+titulo.getText().toString(), Toast.LENGTH_SHORT).show();

        }

    }
}

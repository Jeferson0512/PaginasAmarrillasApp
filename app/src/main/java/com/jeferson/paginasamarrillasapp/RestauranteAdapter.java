package com.jeferson.paginasamarrillasapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Usuario on 28/09/2017.
 */

public class RestauranteAdapter extends ArrayAdapter<Restaurante>{

    private Context context;
    private ArrayList<Restaurante> restaurantes;

    public RestauranteAdapter(Context context, ArrayList<Restaurante> restaurantes) {
        super (context,R.layout.listview_item,restaurantes);
        this.context = context;
        this.restaurantes = restaurantes;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View item = LayoutInflater.from(context).inflate(R.layout.listview_item, null);

        ImageView imagen = (ImageView) item.findViewById(R.id.imgAnimal);
        imagen.setImageResource(restaurantes.get(position).getImagen());

        // Recogemos el TextView para mostrar el nombre y establecemos el
        // nombre.
        TextView nombre = (TextView) item.findViewById(R.id.tvContent);
        nombre.setText(restaurantes.get(position).getTelefono());

        // Recogemos el TextView para mostrar el n�mero de celda y lo
        // establecemos.
        TextView numCelda = (TextView) item.findViewById(R.id.tvField);
        numCelda.setText(restaurantes.get(position).getTitutlo());
        //String.valueOf(position)

        TextView direccion = (TextView)item.findViewById(R.id.direccion);
        direccion.setText(restaurantes.get(position).getDireccion());
        return item;
    }
}

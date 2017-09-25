package com.jeferson.paginasamarrillasapp;

/**
 * Created by Usuario on 25/09/2017.
 */

public class Data {

    private String titulo, direccion, telefono;
    private int imagen;

    public Data(String titulo, String direccion, String telefono, int imagen) {
        this.titulo = titulo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}

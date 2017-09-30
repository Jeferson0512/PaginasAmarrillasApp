package com.jeferson.paginasamarrillasapp;

/**
 * Created by Usuario on 28/09/2017.
 */

public class Restaurante {
    private String titutlo, direccion, telefono;
    private int imagen;

    public Restaurante(String titutlo, String direccion, String telefono, int imagen) {
        this.titutlo = titutlo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.imagen = imagen;
    }

    public String getTitutlo() {
        return titutlo;
    }

    public void setTitutlo(String titutlo) {
        this.titutlo = titutlo;
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

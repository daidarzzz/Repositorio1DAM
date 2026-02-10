package org.example.TEMA6.RedesSociales;

import java.util.ArrayList;

public class Influencer extends Usuario{

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nombreUsuario, int seguidores) {
        super(nombre, edad, nombreUsuario, seguidores);
        colaboraciones = new ArrayList<>();
    }

    public ArrayList<String> getColaboraciones() {
        return colaboraciones;
    }

    public void setColaboraciones(ArrayList<String> colaboraciones) {
        this.colaboraciones = colaboraciones;
    }

    public void insertarColaboracion(String colaboracion) {
        this.colaboraciones.add(colaboracion);
    }

    @Override
    public void mostrarInfo() {

        super.mostrarInfo();
        System.out.println("Lista de colaboraciones de " + super.getNombre() + ": ");
        for (String colaboracion : colaboraciones) {
            System.out.println("[*] " + colaboracion);
        }

    }

    @Override
    public String toString() {
        return "Influencer{" +
                "colaboraciones=" + colaboraciones +
                '}';
    }
}

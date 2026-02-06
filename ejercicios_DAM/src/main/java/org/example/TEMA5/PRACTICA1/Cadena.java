package org.example.TEMA5.PRACTICA1;

import java.util.ArrayList;

public class Cadena {

    //Variables de la clase
    private String nombre;
    private ArrayList<Programa> listaProgramas; //Creamos un arraylist llamado listaProgramas, contiene todos los programas de la cadena

    //Constructor -> recibe el nombre
    public Cadena (String nombre) {
        //Asignamos el nombre
        this.nombre = nombre;
        //La lista de programas se inicializa
        listaProgramas = new ArrayList<>();

    }

    //Método para añadir programas (recibe el programa como parámetro)
    public void añadirPrograma(Programa programa) {
        //Añade el programa si no estaba ya
        if(!listaProgramas.contains(programa)) {
            listaProgramas.add(programa);
            programa.setCadena(this);
        } else {
            System.out.println("El programa " + programa + " ya pertenece a la cadena.");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    //No hay setListaProgramas, para esto tenemos un método.

    //ToString sin cambios.
    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }
}

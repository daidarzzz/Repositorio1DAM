package org.example.TEMA5.PRACTICA1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Invitado {

    private static Scanner read = new Scanner(System.in);


    //Variables de la clase Invitado
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita; //LocalDate almacena una fecha
    private int temporada;


    //Constructor -> Recibe todo menos la fecha de visita.
    public Invitado (String nombre, String profesion, int temporada) {

        //Asignamos los parámetros como valor de las variables
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
        fecha_visita = setFecha_visita(); //Llamamos al setFecha_visita para que nos devuelva la fecha

    }


    //GETTER Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    //Aquí aplicamos la lógica para asignar una fecha
    public LocalDate setFecha_visita() {

        //inicializamos las variables para dia mes y año
        int dia = 0;
        int mes = 0;
        int anyo = 0;

        //Pedimos los valores llamando a un método pedirEntero
        anyo = pedirEntero("Introduce el año en el que acudirá el invitado " + this.nombre + ": ");
        mes = pedirEntero("Introduce el mes: ");
        dia = pedirEntero("Introduce el dia: ");

        //Asignamos los valores a "fecha"
        LocalDate fecha = LocalDate.of(anyo, mes, dia);

        return fecha; //Devolvemos la fecha

    }



    //Método que comprueba que el entero introducido es válido (Sacado del tema 4 -> Prefabs)
    public static int pedirEntero(String texto) {
        int num = 0;
        boolean seguir = true;

        do {
            System.out.print(texto);
            try {
                num = read.nextInt();
                read.nextLine();
                seguir = false;
            } catch (InputMismatchException e) {
                System.out.println("Error. Debes introducir un número entero");
                read.nextLine();
            }
        } while (seguir);

        return num;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }


    //ToString básico
    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}

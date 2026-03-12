package org.example.TEMA7.Colecciones.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {
    static Scanner read = new Scanner(System.in);
    static HashMap<String,Double> mapa = new HashMap<>();

    static void main(String[] args) {

        System.out.println("*** REGISTRO DE TEMPERATURAS ***");

        while(true) {
            System.out.print("Elige una opción [insertar, actualizar, consultar, ver todas, salir]:");

            String opcion = read.nextLine().toLowerCase();

            switch (opcion) {
                case "insertar":
                    insertar();
                    break;
                case "actualizar":
                    actualizar();
                    break;
                case "consultar":
                    consultar();
                    break;
                case "ver todas":
                    verTodas();
                    break;
                case "salir":
                    break;
                default:
                    System.out.println("No existe. Elige otra.");

            }

            System.out.println();
        }



    }

    public static void insertar() {
        System.out.println("Introduce los nuevos datos (ciudad-temperatura): ");
        String[] ciudad = read.nextLine().split("@");
        //San Juan@-15

        mapa.put(ciudad[0], Double.valueOf(ciudad[1]));


    }

    public static void actualizar() {

        System.out.println("Introduce los nuevos datos (ciudad-temperatura): ");
        String[] ciudad = read.nextLine().split("@");

        if (mapa.containsKey(ciudad[0]))  {
            mapa.put(ciudad[0], Double.valueOf(ciudad[1]));
        }
        else System.out.println("No existe la ciudad");

    }

    public static void consultar() {
        System.out.println("Introduce la ciudad a consultar: ");
        String ciudad = read.nextLine();
        System.out.println("Temperatura en "+ ciudad + ": " + mapa.get(ciudad) + "의");
    }

    public static void verTodas() {
        System.out.println("Registro de temperaturas:");
        for (Map.Entry<String, Double> mapita : mapa.entrySet()) {

            System.out.println(mapita.getKey() + ": " + mapita.getValue() +"의");

        }
    }
}

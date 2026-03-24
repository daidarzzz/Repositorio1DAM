package org.example.TEMA7.Colecciones.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperatura {
    static HashMap<String,Double> mapa = new HashMap<>();
    static Scanner teclado = new Scanner(System.in);
    static void main(String[] args) {
        System.out.println("*** REGISTRO DE TEMPERATURAS ***");

        while (true) {
            System.out.print("Elige una opcion [INSERTAR, ACTUALIZAR, CONSULTAR, VER TODAS, SALIR]: ");
            String op = teclado.nextLine().toUpperCase();
            switch (op){
                case "INSERTAR":
                    insertar();
                    break;
                case"ACTUALIZAR":
                    actualizar();
                    break;
                case  "VER TODAS":
                    verTodas();
                    break;
                case "CONSULTAR":
                    consultar();
                    break;
                case "SALIR":
                    return;
                default:
                    System.out.println("No existe esa opcion....");
            }
        }
    }
    public static void insertar(){
        System.out.print("Introduce los datos de la temperatura (ciudad-temperatura): ");
        String ciudad[] = teclado.nextLine().split("/");
        mapa.put(ciudad[0],Double.valueOf(ciudad[1]));

    }
    public static void actualizar() {
        System.out.print("Que ciudad quieres actualizar: ");
        String ciudad[] = teclado.nextLine().split("/");
        if (mapa.containsKey(ciudad[0])){
            mapa.put(ciudad[0], Double.valueOf(ciudad[1]));
        }else {
            System.out.println("La ciudad no esta en la lista");
        }
    }
    public static void consultar(){
        System.out.print("Introduce la ciudad a consultar: ");
        String ciudad = teclado.nextLine();
        System.out.println("Temperatura en "+ ciudad +": " + mapa.get(ciudad));

    }
    public static void verTodas(){
        for (Map.Entry<String,Double> mapita : mapa.entrySet()){
            System.out.println(mapita.getKey() + " - " + mapita.getValue());
        }
    }
}

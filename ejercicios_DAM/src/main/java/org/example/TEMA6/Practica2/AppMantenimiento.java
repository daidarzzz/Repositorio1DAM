package org.example.TEMA6.Practica2;

import java.util.Scanner;

public class AppMantenimiento {
    static Scanner read = new Scanner(System.in);
    static String[] categoriasDisponibles = {"BENJAMIN", "ALEVIN", "INFANTIL", "CADETE", "JUVENIL", "SENIOR"};
    static void main() {
        boolean seguir = true;
        do {
            menu();
            System.out.print("Selecciona una opción --> ");
            char opcion = read.next().charAt(0);
            seguir = switchMenu(opcion);
        } while (seguir);

    }

    public static void menu() {
        System.out.println("=== APP DE MANTENIMIENTO DEL FC BARCELONA ===");
        System.out.println();
        System.out.println("[1]. Mantenimiento de jugadores");
        System.out.println("[2]. Consultar equipos");
        System.out.println("[X]. Salir");
        System.out.println();
        System.out.println("=============================================");
        System.out.println();
    }

    public static boolean switchMenu(char opcion) {

        switch (opcion) {
            case '1':
                mantenerEntrenador();
                break;
            case '2':
                for (int i = 1; i < categoriasDisponibles.length; i++) {
                    System.out.println(i + ". " + categoriasDisponibles[i]);
                }
                System.out.print("Escribe la categoría que quieres ver: ");
                Equipos equipo = Equipos.valueOf(read.next().toUpperCase());
                System.out.println("Lista de jugadores de la categoría " + equipo);
                for (Jugador jugador : Jugador.listaJugadores) {
                    if (jugador.getCategoria() == equipo) {
                        System.out.println("- " + jugador);
                    }
                }
                break;
            case 'X':
            case 'x':
                System.out.println("ADIOS!!!");
                return false;
            default:
                System.out.println("Opción no contemplada");
                break;
        }
        return true;

    }


    public static void mantenerEntrenador() {
        System.out.println(" === MANTENIMIENTO DE JUGADORES ===");
        System.out.println();
        System.out.println("[1]. Añadir nuevo jugador");
        System.out.println("[2]. Modificar datos de jugador");
        System.out.println("[3]. Crear acompañantes (sólo seniors)");
        System.out.println("[X]. Volver al menú principales");

        System.out.println();
        System.out.print("Selecciona una opción --> ");
        char opcion = read.next().charAt(0);

        switch (opcion) {
            case '1':
                System.out.println(" === MANTENIMIENTO DE JUGADORES (Añadir nuevo jugador) ===");
                System.out.println();
                System.out.println("Introduce los siguientes datos con el mismo formato indicado [nombre,edad,categoria,dorsal,posicion]: ");
                String[] datosJugador = read.next().split(",");
                Jugador nuevo = new Jugador(datosJugador[0], Integer.parseInt(datosJugador[1]), datosJugador[2], Integer.parseInt(datosJugador[3]), datosJugador[4]);
                if (nuevo.getDorsal() >= 1) System.out.println("Jugador creado con éxito!!!");
                break;
            case '2':
                break;
            case '3':
                break;
            case 'x':
            case 'X':
                System.out.println("ADIOS!!!");
                return;
        }
    }


}

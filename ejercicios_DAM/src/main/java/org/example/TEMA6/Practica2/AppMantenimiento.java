package org.example.TEMA6.Practica2;

import java.util.Scanner;

public class AppMantenimiento {
    static Scanner read = new Scanner(System.in);
    static Equipos[] categoriasDisponibles = Equipos.values();
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
                mantenerJugador();
                break;
            case '2':
                for (int i = 0; i < categoriasDisponibles.length; i++) {
                    System.out.println((i+1) + ". " + categoriasDisponibles[i]);
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


    public static void mantenerJugador() {
        System.out.println(" === MANTENIMIENTO DE JUGADORES ===");
        System.out.println();
        System.out.println("[1]. Añadir nuevo jugador");
        System.out.println("[2]. Modificar datos de jugador");
        System.out.println("[3]. Crear acompañantes (sólo seniors)");
        System.out.println("[X]. Volver al menú principal");

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
                if (Jugador.listaJugadores.contains(nuevo)) System.out.println("Jugador creado con éxito!!!");
                break;
            case '2':
                System.out.println(" === MANTENIMIENTO DE JUGADORES (Modificar datos de jugador existente) ===");
                System.out.println();
                System.out.println("¿De qué jugador quieres hacer cambios?");
                Jugador.mostrarListaJugadores();
                System.out.println("====================================");
                System.out.print("Selecciona una opción --> ");
                int escogido = read.nextInt()-1;
                Jugador jugador = Jugador.listaJugadores.get(escogido);
                System.out.println("Modificando jugador: " + jugador);
                System.out.println("¿Qué quieres modificar? [nombre,edad,categoria,dorsal,posicion]:");
                System.out.println("====================================");
                System.out.print("Selecciona una opción --> ");
                String opcionModificar = read.next();
                System.out.println("====================================");
                modificarJugadorSwitch(opcionModificar, jugador);

                break;
            case '3':
                System.out.println(" === MANTENIMIENTO DE JUGADORES (Crear Acompañante (Sólo senior) ===");
                boolean haySeniors = false;
                for (BarcelonaFC senior : BarcelonaFC.listaPersonas) {
                    if (senior instanceof Jugador) {
                        if (((Jugador) senior).getCategoria().equals(Equipos.SENIOR)) {
                            haySeniors = true;
                            break;
                        }
                    }
                }
                if (haySeniors) {
                    System.out.print("Introduce el nombre del acompañante: ");
                    String nombre = read.next();
                    System.out.print("Introduce su edad: ");
                    int edad = read.nextInt();
                    System.out.println("Selecciona el jugador al que quiera acompañar:");
                    Jugador.mostrarListaJugadores(Equipos.SENIOR);
                    System.out.print("Selecciona una opción --> ");
                    int opcionJugador = read.nextInt() -1;
                    read.nextLine();
                    System.out.print("Introduce el parentesco: ");
                    String parentesco = read.nextLine();
                    Acompanyante acompanyante = new Acompanyante(nombre, edad, Jugador.listaJugadores.get(opcionJugador), parentesco);
                    System.out.println("Acompañante creado con éxito!!!");
                } else {
                    System.out.println("No puedes crear un acompañante porque no hay ningún senior en el club.");
                }

                break;
            case 'x':
            case 'X':
                System.out.println("ADIOS!!!");
                return;
        }
    }

    public static void modificarJugadorSwitch(String opcion, Jugador jugador) {

        switch (opcion.toLowerCase()) {
            case "nombre":
                System.out.print("Nuevo nombre -->");
                String nombre = read.next();
                jugador.setNombre(nombre);
                System.out.println("Nombre cambiado con éxito!!!");
                break;
            case "dorsal":
                System.out.print("Nuevo dorsal -->");
                int dorsal = read.nextInt();
                int dorsalAntiguo = jugador.getDorsal();
                jugador.setDorsal(dorsal);
                if (dorsalAntiguo != jugador.getDorsal()) System.out.println("Dorsal cambiado con éxito!!!");
                break;
            case "edad":
                System.out.print("Nueva edad -->");
                int edad = read.nextInt();
                jugador.setEdad(edad);
                System.out.println("Edad cambiada con éxito!!!");
                break;
            case "categoria":
                System.out.print("Nueva categoría -->");
                String categoria = read.next();
                try {
                    jugador.setCategoria(Equipos.valueOf(categoria));
                } catch (IllegalArgumentException e) {
                    System.out.println("Has introducido un equipo no contemplado");
                    break;
                }
                System.out.println("Categoría cambiada con éxito!!!");
                break;
            case "posicion":
                System.out.print("Nueva posición -->");
                String posicion = read.next();
                try {
                    jugador.setCategoria(Equipos.valueOf(posicion));
                } catch (IllegalArgumentException e) {
                    System.out.println("Has introducido una posición no contemplada");
                    break;
                }
                System.out.println("Posición cambiada con éxito!!!");
                break;
        }

    }


}

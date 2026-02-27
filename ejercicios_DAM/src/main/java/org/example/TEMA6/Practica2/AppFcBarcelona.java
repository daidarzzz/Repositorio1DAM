package org.example.TEMA6.Practica2;

import org.example.TEMA5.Persona;

public class AppFcBarcelona {
    static void main(String[] args) {

        System.out.println();
        System.out.println();
        Jugador joa = new Jugador("Joaquín", 18, "juvenil", 24, "delantero");

        System.out.println(joa);

        Jugador jacobo = new Jugador("Jacobo", 82, "juvenil", 23, "portero");
        System.out.println(jacobo);

        Entrenador carlos = new Entrenador("Carlos", 22, "JUVENIL", "3-5-2");
        System.out.println(carlos);
        Entrenador manuel = new Entrenador("Manuel", 18, "senior", "4-3-3-1");
        System.out.println(manuel);
        Acompanyante david = new Acompanyante("David", 12, jacobo, "bisabuelo");
        System.out.println(david);
        Masajista pepe = new Masajista("Pepe", 44, "Grado en masajista", 20);
        System.out.println(pepe);
        Masajista juan = new Masajista("juan", 45, "Grado en dinero", 39);
        System.out.println(juan);

        System.out.println("=== JUGADORES ACTUALES ===");
        Jugador.mostrarListaJugadores();
        System.out.println();

        System.out.println("=== Equipo concentrandose ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            persona.concentrarse();
        }
        System.out.println();
        System.out.println("=== Equipo entrenando ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            if (persona instanceof AccionesDeportivas) {
                ((AccionesDeportivas) persona).entrenar();
            }
        }
        System.out.println();
        pepe.darMasaje(jacobo);
        System.out.println();
        System.out.println("=== Equipo viajando a Madrid ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            if (persona instanceof AccionesDeportivas) {
                persona.viajar("Madrid");
            }
        }
        System.out.println();
        System.out.println("=== Entrenadores van a planificar el entrenamiento ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            if (persona instanceof Entrenador) {
                ((Entrenador) persona).planificarEntrenamiento();
            }
        }
        System.out.println();
        System.out.println("=== Equipo entrenando ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            if (persona instanceof AccionesDeportivas) {
                ((AccionesDeportivas) persona).entrenar();
            }
        }
        System.out.println();
        System.out.println("=== Equipo descansando ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            if (persona instanceof Jugador) {
                ((Jugador) persona).descansar();
            }
        }
        System.out.println();
        System.out.println("=== Equipo descansando ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            if (persona instanceof Jugador) {
                ((Jugador) persona).descansar();
            }
        }
        System.out.println();
        System.out.println("=== Equipo calentando ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            if (persona instanceof Jugador) {
                ((Jugador) persona).calentar();
            }
        }
        System.out.println();
        System.out.println("=== Equipo va a jugar el partido ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            if (persona instanceof AccionesDeportivas) {
                ((AccionesDeportivas) persona).jugarPartido("Real Madrid");
            }
        }
        System.out.println();
        System.out.println("=== Acompañantes animando a sus equipos ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            if (persona instanceof Acompanyante) {
                ((Acompanyante) persona).animarEquipo();
            }
        }

        System.out.println();
        System.out.println("=== Entrenadores van a realizar cambios ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            if (persona instanceof Entrenador) {
                ((Entrenador) persona).hacerCambios();
            }
        }
        System.out.println();
        System.out.println("=== Jugadores metiendo golazos ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            if (persona instanceof Jugador) {
                ((Jugador) persona).marcarGol();
            }
        }
        System.out.println();
        System.out.println("=== Equipos celebrando golazos ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            persona.celebrarGol();
        }
        System.out.println();
        System.out.println("=== Realizando masajes a jugadores con masajista "+ pepe.nombre + " ===");
        for (Jugador jugador : Jugador.listaJugadores) {

            pepe.darMasaje(jugador);

        }
        System.out.println();
        System.out.println("=== Equipo viaja a Barcelona de vuelta ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            persona.viajar("Barcelona");
        }
        System.out.println();
        System.out.println("=== Equipo viaja a Barcelona de vuelta ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            persona.viajar("Barcelona");
        }
        System.out.println();
        System.out.println("=== Equipo descansando ===");
        for (BarcelonaFC persona : BarcelonaFC.listaPersonas) {
            if (persona instanceof Jugador) {
                ((Jugador) persona).descansar();
            }
        }
        System.out.println();
        System.out.println();
        AppMantenimiento.main();


    }
}

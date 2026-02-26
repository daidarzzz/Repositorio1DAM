package org.example.TEMA6.Practica2;

public class AppFcBarcelona {
    static void main(String[] args) {

        Jugador joa = new Jugador("Joaquín", 18, "juvenil", 24, "delantero");

        System.out.println(joa);

        Jugador jacobo = new Jugador("Jacobo", 82, "juvenil", 23, "portero");
        System.out.println(jacobo);

        Entrenador iris = new Entrenador("Iris", 22, "JUVENIL", "3-5-2");
        System.out.println(iris);
        Entrenador manuel = new Entrenador("Manuel", 18, "senior", "4-3-3-1");
        System.out.println(manuel);
        Acompanyante david = new Acompanyante("David", 12, jacobo, "bisabuelo");
        System.out.println(david);

        Jugador.mostrarListaJugadores();
        jacobo.viajar("madrid");
        AppMantenimiento.main();
    }
}

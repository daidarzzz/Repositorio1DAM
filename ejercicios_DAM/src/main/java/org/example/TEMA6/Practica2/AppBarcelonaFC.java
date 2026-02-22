package org.example.TEMA6.Practica2;

public class AppBarcelonaFC {
    static void main(String[] args) {

        Jugador joa = new Jugador("Joaquín", 18, "senior", 24, "delantero");

        System.out.println(joa);

        Jugador jacobo = new Jugador("Jacobo", 82, "juvenil", 24, "portero");
        System.out.println(jacobo);

        Entrenador iris = new Entrenador("Iris", 22, "JUVENIL", "3-5-2");
        System.out.println(iris);
    }
}

package org.example.TEMA5.TENIS;

public class TenisApp {

    static void main(String[] args) {

//        Jugador joaquin = new Jugador("Joaquin", 5);
//        Jugador david = new Jugador("David", 1);
//        Partido carbon = new Partido(david, joaquin);
//        System.out.println( "Rival de David: " + david.getRival());
//        System.out.println("Rival de Joaquín: " + joaquin.getRival());
//        System.out.println(carbon.getListaSets());
//        carbon.insertarSet(5, 6);
//        System.out.println(carbon.getListaSets());
//        System.out.println(carbon);

        Jugador david = new Jugador("David", 1);
        Jugador joaquin = new Jugador("Joaquin", 2);
        Partido copaLeche = new Partido(david, joaquin);

        System.out.println("Partido creado entre " + copaLeche.getJugador1().getNombre() + " y " + copaLeche.getJugador2().getNombre());

        copaLeche.insertarSet(7,5);
        copaLeche.insertarSet(3,6);

        int contadorSet = 0;

        for (int i = 0; i < copaLeche.getListaSets().size(); i++) {

            System.out.println("Set " + (i+1) + ": " + copaLeche.getListaSets().get(i).getPuntosJ1() + " - " + copaLeche.getListaSets().get(i).getPuntosJ2());
            contadorSet++;

        }

        System.out.println("Total de sets jugados: " + contadorSet);
    }



}

package org.example.TEMA6.Interfaces.Prueba;

import java.util.ArrayList;

public class VoladoresApp {

    static void main(String[] args) {

        Superman jacobo = new Superman();
        Pajaro piolin = new Pajaro();

        jacobo.volar();
        piolin.volar();
        jacobo.alientoHielo();
        jacobo.rayoLaser();

        Spiderman joaquin = new Spiderman();

        ArrayList<Superheore> listaSuperheroes = new ArrayList<>();

        listaSuperheroes.add(jacobo);
        listaSuperheroes.add(joaquin);

        for (Superheore heroe : listaSuperheroes) {

            if (heroe instanceof Superman) {
                ((Superman) heroe).alientoHielo();
                ((Superman) heroe).rayoLaser();
            }
            else if (heroe instanceof Spiderman){
                ((Spiderman) heroe).volar();
            }

        }


    }

}

package org.example.TEMA7.Comparable;

import java.util.Comparator;

public class OrdenarPorNombreEdadNombreHora implements Comparator<Invitado> {
    @Override
    public int compare(Invitado invitado1, Invitado invitado2) {

        int comparar = invitado1.getEdad().compareTo(invitado2.getEdad());
        if (comparar != 0) {
            return comparar;
        }

        return invitado1.getNombre().compareTo(invitado2.getNombre());


    }
}

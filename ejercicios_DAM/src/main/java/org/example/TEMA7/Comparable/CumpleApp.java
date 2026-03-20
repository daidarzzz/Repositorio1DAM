package org.example.TEMA7.Comparable;

import java.util.*;

public class CumpleApp {

    static void main(String[] args) {
        List<Invitado> invitados = new ArrayList<>();

        invitados.add(new Invitado(15, "Jacobo"));
        invitados.add(new Invitado(12, "David"));
        invitados.add(new Invitado(12, "Joaquin"));
        invitados.add(new Invitado(13, "Iris"));

        //Collections.sort(invitados, Collections.reverseOrder());
        //Collections.sort(invitados);
        Collections.sort(invitados, new OrdenarPorNombreEdadNombreHora());
        //Collections.sort(invitados, new OrdenarPorNombreEdadNombreHora().reversed());

        System.out.println(invitados);

        //TreeMap<Invitado, String> mapa = new TreeMap<>(Collections.reverseOrder());

        TreeMap<Invitado, String> mapaInvitados = new TreeMap<>(Comparator.reverseOrder());

        mapaInvitados.put(new Invitado(15, "Jacobo"), "Raqueta");
        mapaInvitados.put(new Invitado(12, "David"), "500€");
        mapaInvitados.put(new Invitado(12, "Joaquín"), "Charla con Milei");

        List<Map.Entry<Invitado, String>> listaMapa = new ArrayList<>(mapaInvitados.entrySet());

        listaMapa.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<Invitado, String> mapita : listaMapa) {
            System.out.println(mapita.getKey() + " " + mapita.getValue());
        }

    }


}

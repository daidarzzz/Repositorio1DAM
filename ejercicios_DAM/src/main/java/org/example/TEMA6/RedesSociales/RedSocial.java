package org.example.TEMA6.RedesSociales;

public class RedSocial {

    static void main(String[] args) {

        Usuario joaquin = new Usuario("Joaquin", 18, "@jovialmagnoli", 924122);
        Influencer paradox = new Influencer("Paradox Kaiser", 18, "@paradoxkaiser", 3);
        paradox.insertarColaboracion("Carrefour");
        paradox.insertarColaboracion("Instant Gaming");
        Streamer manuel = new Streamer("Manuel", 10, "@manuelpro", 10424, 12, 42);
        Basico npc = new Basico("NPC", 19, "@npcelpc", 5);

        joaquin.mostrarInfo();
        System.out.println();
        paradox.mostrarInfo();
        System.out.println();
        manuel.mostrarInfo();
        System.out.println();
        npc.mostrarInfo();



    }

}

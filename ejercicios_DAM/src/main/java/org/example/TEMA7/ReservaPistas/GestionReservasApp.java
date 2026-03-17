package org.example.TEMA7.ReservaPistas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestionReservasApp {

    static Map<Usuario, ArrayList<Reserva>> mapaReservas = new HashMap<>();

    static void main(String[] args) {

        Usuario joa = new Usuario("Joa");
        Pista pista1 = new Padel("indoor", "cemento");
        LocalDateTime hora = LocalDateTime.of(2026, 4, 1, 19, 50);



    }



}

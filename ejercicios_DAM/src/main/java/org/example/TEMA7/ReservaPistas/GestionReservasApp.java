package org.example.TEMA7.ReservaPistas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GestionReservasApp {

    static Map<Usuario, ArrayList<Reserva>> mapaReservas = new HashMap<>();

    static void main(String[] args) {

        Usuario joa = new Usuario("Joa");
        Usuario jacobo = new Usuario("Jacobo");
        Pista pista1 = new Padel("indoor", "cemento");
        Pista pista2 = new Padel("abierto", "cristal");
        LocalDateTime hora = LocalDateTime.of(2026, 4, 1, 19, 50);
        LocalDateTime hora2 = LocalDateTime.of(2025, 4, 1, 19, 50);


        Reserva.crearReserva(mapaReservas, joa, pista1, hora);
        Reserva.crearReserva(mapaReservas, joa, pista1, hora2);



        ArrayList listaReservas = new ArrayList();

        listaReservas = Reserva.reservasUsuario(joa, mapaReservas);

        System.out.println(listaReservas);

        Reserva.borrarReservas(mapaReservas, "padel");
        listaReservas = Reserva.reservasUsuario(joa, mapaReservas);
        System.out.println(listaReservas);

        Reserva.crearReserva(mapaReservas, joa, pista1, hora);
        listaReservas = Reserva.reservasUsuario(joa, mapaReservas);
        System.out.println(listaReservas);
        Reserva.crearReserva(mapaReservas, jacobo, pista1, hora);


    }



}

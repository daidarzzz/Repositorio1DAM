package org.example.TEMA7.ReservaPistas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestionReservasApp {

    static Map<Usuario, ArrayList<Reservaa>> mapaReservas = new HashMap<>();

    static void main(String[] args) {

        Usuario joa = new Usuario("Joa");
        Usuario jacobo = new Usuario("Jacobo");
        Pista pista1 = new Padel("indoor", "cemento");
        Pista pista2 = new Padel("abierto", "cristal");
        LocalDateTime hora = LocalDateTime.of(2026, 4, 1, 19, 50);
        LocalDateTime hora2 = LocalDateTime.of(2025, 4, 1, 19, 50);


        Reservaa.crearReserva(mapaReservas, joa, pista1, hora);
        Reservaa.crearReserva(mapaReservas, joa, pista1, hora2);



        ArrayList listaReservas = new ArrayList();

        listaReservas = Reservaa.reservasUsuario(joa, mapaReservas);

        System.out.println(listaReservas);

        Reservaa.borrarReservas(mapaReservas, "padel");
        listaReservas = Reservaa.reservasUsuario(joa, mapaReservas);
        System.out.println(listaReservas);

        Reservaa.crearReserva(mapaReservas, joa, pista1, hora);
        listaReservas = Reservaa.reservasUsuario(joa, mapaReservas);
        System.out.println(listaReservas);
        try {
            Reservaa.crearReserva(mapaReservas, jacobo, pista1, hora);
        } catch (HoraReservaException e) {
            System.out.println(e.getMessage());
        }


    }



}

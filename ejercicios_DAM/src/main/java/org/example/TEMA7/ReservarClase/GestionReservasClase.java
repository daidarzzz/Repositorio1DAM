package org.example.TEMA7.ReservarClase;

import org.example.TEMA7.ReservaPistas.Padel;
import org.example.TEMA7.ReservaPistas.Reservaa;
import org.example.TEMA7.ReservaPistas.Tenis;

import java.util.*;

public class GestionReservasClase {
    static HashMap<Usuario, HashSet<Reserva>> mapita = new HashMap<>();
    static Scanner read = new Scanner(System.in);
    static void main(String[] args) {

    }

    public static void eliminar(HashSet<Reservaa> listaReservaa) {
        System.out.print("Introduce el tipo de pista a eliminar: ");
        String pista = read.next();
        Iterator<Reservaa> it = listaReservaa.iterator();
        while (it.hasNext()) {
            Reservaa reservaa = it.next();
            if (reservaa.getPista() instanceof Tenis && pista.equalsIgnoreCase("tenis")) {
                it.remove();
            } else if (reservaa.getPista() instanceof Padel && pista.equalsIgnoreCase("padel")) {
                it.remove();
            }
        }
    }

    public static HashSet<Reserva> listaReserva(Usuario usuario) {

        return mapita.get(usuario);

    }

    public static void crearReserva(Usuario usuario, Pista pista) {

        Reserva reserva = new Reserva(usuario, pista);

        HashSet<Reserva> lista = listaReserva(usuario);

        if (lista.contains(reserva)) {
            throw new HoraReservaException("Ya hay una pista reservada");
        } else {
            lista.add(reserva);
            mapita.put(usuario, lista);
        }

    }


}

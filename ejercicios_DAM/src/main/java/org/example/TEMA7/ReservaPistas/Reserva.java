package org.example.TEMA7.ReservaPistas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Reserva {

    private Usuario usuario;
    private Pista pista;
    private LocalDateTime fecha;

    public Reserva(Usuario usuario, Pista pista, LocalDateTime fecha) {
        this.usuario = usuario;
        this.pista = pista;
        this.fecha = fecha;
    }

    public static void borrarReservas(ArrayList<Reserva> lista, String tipo) {

        Iterator<Reserva> it = lista.iterator();
        while (it.hasNext()) {
            Reserva reserva = it.next();
            if (tipo.equalsIgnoreCase("padel") && reserva.getPista() instanceof Padel) {
                it.remove();
            }
            else if (tipo.equalsIgnoreCase("tenis") && reserva.getPista() instanceof Tenis) {
                it.remove();
            }
        }

    }

    public static ArrayList reservasUsuario(Usuario usuario, Map<Usuario, ArrayList<Reserva>> mapa) {
        ArrayList<Reserva> listaReservas = new ArrayList<>();

        listaReservas = mapa.get(usuario);

        return listaReservas;

    }


    public static void crearReserva(Map<Usuario, ArrayList<Reserva>> mapa, Usuario usuario, Pista pista, LocalDateTime hora) {
        Reserva reserva  = new Reserva(usuario, pista, hora);
        ArrayList<Reserva> lista = reservasUsuario(usuario, mapa);
        lista.add(reserva);
        mapa.put(usuario, lista);
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(pista, reserva.pista) && Objects.equals(fecha, reserva.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pista, fecha);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "usuario=" + usuario +
                ", pista=" + pista +
                ", fecha=" + fecha +
                '}';
    }
}

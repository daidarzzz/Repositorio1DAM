package org.example.TEMA7.ReservaPistas;

import java.time.LocalDateTime;
import java.util.*;

public class Reservaa {

    private Usuario usuario;
    private Pista pista;
    private LocalDateTime fecha;

    public Reservaa(Usuario usuario, Pista pista, LocalDateTime fecha) {
        this.usuario = usuario;
        this.pista = pista;
        this.fecha = fecha;
    }

    public static void borrarReservas(Map<Usuario, ArrayList<Reservaa>> mapa, String tipo) {

        for (Map.Entry<Usuario, ArrayList<Reservaa>> mapita : mapa.entrySet()) {
            Iterator<Reservaa> it = mapita.getValue().iterator();
            while (it.hasNext()) {
                Reservaa reservaa = it.next();
                if (tipo.equalsIgnoreCase("padel") && reservaa.getPista() instanceof Padel) {
                    it.remove();
                }
                else if (tipo.equalsIgnoreCase("tenis") && reservaa.getPista() instanceof Tenis) {
                    it.remove();
                }
            }

        }


    }

    public static ArrayList reservasUsuario(Usuario usuario, Map<Usuario, ArrayList<Reservaa>> mapa) {
        ArrayList<Reservaa> listaReservaas = mapa.get(usuario);

        if (listaReservaas == null) {
            listaReservaas = new ArrayList<>();
        }

        return listaReservaas;

    }


    public static void crearReserva(Map<Usuario, ArrayList<Reservaa>> mapa, Usuario usuario, Pista pista, LocalDateTime hora) {
        Reservaa reservaa = new Reservaa(usuario, pista, hora);
        ArrayList<Reservaa> lista = reservasUsuario(usuario, mapa);
        for (Map.Entry<Usuario, ArrayList<Reservaa>> mapita : mapa.entrySet()) {

            if (mapita.getValue().contains(reservaa)) throw new HoraReservaException("La pista " + pista.getId() + " ya está ocupada a esta hora ( " + hora.toString() + ")");

        }

        lista.add(reservaa);
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
        Reservaa reservaa = (Reservaa) o;
        return Objects.equals(pista, reservaa.pista) && Objects.equals(fecha, reservaa.fecha);
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

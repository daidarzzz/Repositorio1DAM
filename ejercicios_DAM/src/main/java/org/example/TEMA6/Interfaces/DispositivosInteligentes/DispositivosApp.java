package org.example.TEMA6.Interfaces.DispositivosInteligentes;

import java.util.ArrayList;

public class DispositivosApp {

    static void main(String[] args) {

        Televisor tv = new Televisor("Teñe", false);
        AireAcondicionado aire = new AireAcondicionado("Aire", false);
        ParlanteInteligente parlante = new ParlanteInteligente("Colo colo", false);

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(tv);
        listaDispositivos.add(aire);
        listaDispositivos.add(parlante);

        Dispositivo proyector = new Dispositivo("Optoma borroso", false) {
            @Override
            public void encender() {
                if (estado) {
                    System.out.println("El proyector ya está encendido");
                } else {
                    System.out.println(nombre +  " encendiendo proyector con ajuste automático de brillo");
                    estado = true;
                }
            }
        };

        proyector.encender();
        proyector.encender();


        ControlRemoto proyector_sinc = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto...");
            }
        };

        proyector_sinc.sincronizar();

        Dispositivo horno_ia = new Dispositivo("Horno LG", false) {
            @Override
            public void encender() {
                if (estado) {
                    System.out.println("El horno ya está encendido");
                } else {
                    System.out.println("Calentando temperatura del horno...");
                    estado = true;
                }
            }
        };

        horno_ia.encender();
        horno_ia.encender();

        listaDispositivos.add(proyector);
        listaDispositivos.add(horno_ia);

        for (Dispositivo dispositivo : listaDispositivos) {

            dispositivo.encender();
            dispositivo.encender();
            if (dispositivo instanceof ControlRemoto) {
                ((ControlRemoto) dispositivo).sincronizar();
            } else if (dispositivo.nombre.equals("Octoma Borroso")) {
                proyector_sinc.sincronizar();
            }
            dispositivo.mostrarEstado();
            dispositivo.apagar();
            dispositivo.apagar();

        }

    }



}

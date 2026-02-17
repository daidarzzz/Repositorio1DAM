package org.example.TEMA6.Interfaces.DispositivosInteligentes;

public class Televisor extends Dispositivo implements ControlRemoto{


    public Televisor(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }

    @Override
    public void encender() {

        if (super.isEstado()) {
            System.out.println("El televisor ya está encendido.");
        } else {
            System.out.println("Encendiendo televisor...");
            super.setEstado(true);
        }

    }
}

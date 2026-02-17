package org.example.TEMA6.Interfaces.DispositivosInteligentes;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{
    public AireAcondicionado(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void sincronizar() {

    }

    @Override
    public void encender() {

        if (super.isEstado()) {
            System.out.println("El aire acondicionado ya está encendido");
        } else {
            System.out.println("Encendiendo aire acondicionado...");
            super.setEstado(true);
        }

    }
}

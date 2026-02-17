package org.example.TEMA6.Interfaces.DispositivosInteligentes;

public class ParlanteInteligente extends Dispositivo{
    public ParlanteInteligente(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void encender() {
        if (super.isEstado()) {
            System.out.println("El parlante ya está encendido");
        } else {

            System.out.println("Activando parlante con comando de voz...");
            super.setEstado(true);

        }
    }
}

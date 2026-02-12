package org.example.TEMA6.PolimorfismoEj2;

public class Desarrollador extends Empleado{

    public Desarrollador() {

    }

    @Override
    public void realizarTarea() {
        System.out.println("Escribiendo código y solucionando bugs.");
    }

}

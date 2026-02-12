package org.example.TEMA6.PolimorfismoEj2;

public class Gerente extends Empleado{

    public Gerente() {

    }

    @Override
    public void realizarTarea() {
        System.out.println("Supervisando el proyecto y organizando reuniones.");
    }

}

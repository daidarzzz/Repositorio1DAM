package org.example.TEMA6.PolimorfismoEj2;

import java.util.ArrayList;

public class EmpleadosApp {

    static void main(String[] args) {

        Diseñador joaquin = new Diseñador();
        Desarrollador david = new Desarrollador();
        Gerente jacobo = new Gerente();

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(joaquin);
        listaEmpleados.add(david);
        listaEmpleados.add(jacobo);

        for (Empleado empleado : listaEmpleados) {

            empleado.realizarTarea();

        }

        asignarTarea(david);

        Empleado carlos = new Gerente();
        Empleado iris = new Desarrollador();

        asignarTarea(carlos);
        asignarTarea(iris);

    }


    public static void asignarTarea(Empleado empleado) {

        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();

    }
}

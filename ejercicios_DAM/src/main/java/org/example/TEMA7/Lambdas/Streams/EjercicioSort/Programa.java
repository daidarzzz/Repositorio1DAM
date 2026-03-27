package org.example.TEMA7.Lambdas.Streams.EjercicioSort;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa {

    static void main(String[] args) {

        List<Empleado> empleadoList = new ArrayList<>();

        Empleado empleado1 = new Empleado("Manu", 300.0, LocalDate.of(2023, 2, 13));
        Empleado empleado2 = new Empleado("Jacobo", 1200.0, LocalDate.now());
        Empleado empleado3 = new Empleado("Joaquin", 5000.0, LocalDate.now());

        empleadoList.add(empleado1);
        empleadoList.add(empleado2);
        empleadoList.add(empleado3);

        Collections.sort(empleadoList, (a, b) -> a.getNombre().compareTo(b.getNombre()));

        System.out.println("a) Ordenar por nombre alfabéticamente.");
        System.out.println(empleadoList);

        Collections.sort(empleadoList, (a, b) -> a.getSalario().compareTo(b.getSalario()));

        System.out.println("b) Ordenar por salario de menor a mayor.");
        System.out.println(empleadoList);


        Collections.sort(empleadoList, (a, b) -> b.getFecha().compareTo(a.getFecha()));

        System.out.println("c) Ordenar por fecha de contratación, con los más antiguos primero. Usa el método reverse().");
        System.out.println(empleadoList.reversed());

        empleadoList.sort(
                Comparator.comparing(Empleado::getSalario)
                        .thenComparing(Empleado::getNombre)
        );

        System.out.println("d) Ordenar por salario (de mayor a menor) y luego por nombre alfabéticamente.");
        System.out.println(empleadoList);
    }

}

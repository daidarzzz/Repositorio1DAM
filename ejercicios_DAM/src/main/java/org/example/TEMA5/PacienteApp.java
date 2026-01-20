package org.example.TEMA5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PacienteApp {

    static Scanner read = new Scanner(System.in);
    static void main(String[] args) {

        System.out.println("Introduce tu nombre: ");
        String nombre = read.next();
        System.out.println("Introduce tu edad: ");
        int edad = read.nextInt();
        System.out.println("Introduce tu sexo: ");
        char sexo = read.next().charAt(0);
        System.out.println("Introduce tu peso: ");
        double peso = read.nextDouble();
        System.out.println("Introduce tu altura: ");
        int altura = read.nextInt();

        Paciente jacobo = new Paciente(nombre, edad, sexo, peso, altura);
        jacobo.imprimirPaciente();
        System.out.println(jacobo.calcularIMC());
        System.out.println(jacobo.esMayorDeEdad());

        System.out.println();



        Paciente iris = new Paciente(nombre, edad, sexo, 0, 0);
        iris.imprimirPaciente();
        System.out.println(iris.calcularIMC());
        System.out.println(iris.esMayorDeEdad());

        System.out.println();

        Paciente joaquin = new Paciente();

        joaquin.setNombre(nombre);
        joaquin.setEdad(edad);
        joaquin.setSexo(sexo);
        joaquin.setPeso(peso);
        joaquin.setAltura(altura);
        joaquin.imprimirPaciente();
        System.out.println(joaquin.calcularIMC());
        System.out.println(joaquin.esMayorDeEdad());
    }

}

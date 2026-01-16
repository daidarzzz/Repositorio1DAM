package org.example.TEMA5;

public class PacienteApp {

    static void main(String[] args) {
        Paciente jacobo = new Paciente("Jacobo", 20, 'M', 120, 179);
        jacobo.imprimirPaciente();
        System.out.println(jacobo.calcularIMC());
    }

}

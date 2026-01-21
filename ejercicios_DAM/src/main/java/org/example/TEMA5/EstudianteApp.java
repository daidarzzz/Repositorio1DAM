package org.example.TEMA5;

public class EstudianteApp {

    static void main(String[] args) {

        Estudiante joa = new Estudiante("Joa", "1DAM", "joa@iesmutxamel.com");
        System.out.println(joa.getNia());
        System.out.println(joa);

        Estudiante jacobo = new Estudiante("Jacobo");
        System.out.println(jacobo.getNia());
        System.out.println(jacobo);

        Estudiante iris = new Estudiante("Iris", "4DAM", "arroba@arroba.arroba");
        System.out.println(iris.getNia());
        System.out.println(iris);

        System.out.println("Hay " + Estudiante.obtenerTotalEstudiantes() + " estudiantes");

        System.out.println(Estudiante.validarCorreo("patri@mutxamel.com"));
        System.out.println(Estudiante.validarCorreo("davandrod2@alu.edu.gva.es"));
    }

}

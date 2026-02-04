package org.example.TEMA5.Insti;

public class InstitutoApp {

    static void main(String[] args) {
//        Curso dam = new Curso("1DAM", 970);
//        Instituto instituto = new Instituto();
//        Instituto mariablasco = new Instituto(null, "SAN VICENTE");
////        mariablasco.setNombre(null);
//        mariablasco.setListaCursos(dam);
//        mariablasco.setListaCursos(dam);
//        System.out.println(instituto);
//        System.out.println(mariablasco);

        Instituto instituto = new Instituto("IES MUTXAMEL");
//crear cursos
        Curso cursoJava = new Curso("Java", 100);
        Curso cursoPython = new Curso("Python", 70);
        instituto.agregarCurso(cursoJava);
        instituto.agregarCurso(cursoPython);
        //crear estudiantes
        try {
            Estudiante estudiante1 = new Estudiante("Carlos", 20, cursoJava);
            Estudiante estudiante2 = new Estudiante("Ana", 22, cursoPython);
            instituto.agregarEstudiante(estudiante1);
            instituto.agregarEstudiante(estudiante2);
//intento de crear un estudiante con nombre nulo (esto lanzaNullPointerException)
            Estudiante estudianteErroneo = new Estudiante(null);
        } catch (NullPointerException e) {
            System.out.println("Error: No se puede crear un estudiante con nombre nulo.");
        }
//intento de añadir un estudiante nulo en la lista de estudiantes
        instituto.agregarEstudiante(null);
//intento de añadir un curso nulo en la lista de cursos
        instituto.agregarCurso(null);
//mostrar cursos
        System.out.println("Cursos disponibles:");
        System.out.println(instituto.getListaCursos());
//mostrar estudiantes
        System.out.println("Estudiantes registrados:");
        System.out.println(instituto.getListaEstudiantes());
        System.out.println(instituto);
    }

}

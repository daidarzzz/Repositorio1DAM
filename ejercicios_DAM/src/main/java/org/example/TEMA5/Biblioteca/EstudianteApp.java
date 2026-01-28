package org.example.TEMA5.Biblioteca;

public class EstudianteApp {

    static void main(String[] args) {

////        Estudiante joa = new Estudiante("Joa", "1DAM", "joa@iesmutxamel.com");
////        System.out.println(joa.getNia());
////        System.out.println(joa);
//
//        Estudiante jacobo = new Estudiante("Jacobo");
//        System.out.println(jacobo.getNia());
////        System.out.println(jacobo);
//
////        Estudiante iris = new Estudiante("Iris", "4DAM", "arroba@arroba.arroba");
////        System.out.println(iris.getNia());
////        System.out.println(iris);
//
////        System.out.println("Hay " + Estudiante.obtenerTotalEstudiantes() + " estudiantes");
////
////        System.out.println(Estudiante.validarCorreo("patri@mutxamel.com"));
////        System.out.println(Estudiante.validarCorreo("davandrod2@alu.edu.gva.es"));
//
//        Editorial millenium = new Editorial("Millenium", "España");
//
//        Libro divina_comedia = new Libro("Divina Comedia", "Cristiano Ronaldo", millenium);
//        Libro pro = new Libro("C", "X", millenium);
//        System.out.println(divina_comedia.toString());
//        System.out.println(divina_comedia.estaDisponible());
//
//        Prestamo p1 = divina_comedia.prestar(jacobo);
//
//        System.out.println("Fecha del préstamo: " + p1.getFecha());
//        System.out.println(jacobo.getListaLibros());
//
//        System.out.println(divina_comedia);
//        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());
//
//        System.out.println(divina_comedia.estaDisponible());
//        divina_comedia.prestar(jacobo);
//
//
//        System.out.println(divina_comedia);
//        pro.prestar(jacobo);
//
//        System.out.println(jacobo.getListaLibros());
//
//        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());
//        System.out.println("Libros totales: " + Libro.getTotalLibros());
        Editorial joaquin = new Editorial("JOAQUIN", "ESPAÑA");
        Libro jacobo = new Libro("Jacobo - El Dormilón", "Manuel", joaquin);

        System.out.println(joaquin);
        Libro biblia = new Libro("La Biblia", "DIOS");
        joaquin.insertarLibro(biblia);

        System.out.println(joaquin);
        joaquin.borrarLibro(jacobo);
        System.out.println(joaquin);
    }

}

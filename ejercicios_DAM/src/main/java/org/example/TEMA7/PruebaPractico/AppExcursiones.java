package org.example.TEMA7.PruebaPractico;

public class AppExcursiones {

    public static void main(String[] args) {
        System.out.println("******* APP EXCURSIONES *******");
        Excursion terra_mitica = new Excursion("Terra Mítica","Benidorm",30.0);
        terra_mitica.insertarProfesor();
        terra_mitica.inscribirAsistente();
        terra_mitica.inscribirAsistente();
        terra_mitica.inscribirAsistente();
        terra_mitica.inscribirAsistente();
        terra_mitica.verAsistentes();
        terra_mitica.eliminarAsistentesPorEdad(16);
        System.out.println("\nDespués de eliminar a los menores de 16 años: ");
        terra_mitica.verAsistentes();
        System.out.println("\nImporte a ingresar para la actividad "
                + terra_mitica.getNombre_actividad() + " en " + terra_mitica.getLocalidad() + ": " + terra_mitica.calcularImporteIngreso()  + "€.");
    }

}

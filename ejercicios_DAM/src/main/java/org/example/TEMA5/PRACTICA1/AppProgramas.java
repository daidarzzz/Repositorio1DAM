package org.example.TEMA5.PRACTICA1;

public class AppProgramas {

    static void main(String[] args) {

        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
//creamos un programa
        Programa el_hormiguero = new Programa("El Hormiguero",antena3,"Joaquín");
        System.out.println(el_hormiguero);
        System.out.println(antena3);
//insertamos empleados en el programa
        el_hormiguero.insertarEmpleado("Pablo Motos", "presentador");
        System.out.println(el_hormiguero);
//ver empleados del programa
        el_hormiguero.insertarEmpleado("Joaquín", "colaborador");
        System.out.println(el_hormiguero.getListaEmpleados());
        System.out.println(el_hormiguero.getDirector());
        System.out.println(el_hormiguero.getCadena());
////insertamos invitados en el programa
        el_hormiguero.insertarInvitado("Aitana","cantante",1);
        el_hormiguero.insertarInvitado("ParadoxKaiser","streamer",1);
        el_hormiguero.insertarInvitado("ParadoxKaiser","streamer",3);

////ver invitados del programa
        System.out.println(el_hormiguero.getListaInvitados());

        el_hormiguero.invitadosTemporada(1);

        el_hormiguero.rastrearInvitado("ParadoxKaiser");

        Programa casaGemelos = new Programa("Casa de los Gemelos", antena3, "David");

        casaGemelos.insertarInvitado("ParadoxKaiser", "streamer", 5);

        el_hormiguero.invitadoAntes("ParadoxKaiser", casaGemelos);

    }

}

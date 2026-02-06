package org.example.TEMA5.PRACTICA1;

import java.sql.SQLOutput;

public class AppProgramas {

    static void main(String[] args) {

        Cadena radioTV = new Cadena("Radio TV");
        Programa pepitoTV = new Programa("Pepito TV", radioTV, "Jacobo SixSeven");
        Programa joaquinTartas = new Programa("JOAQUIN TARTAS", radioTV, "Manuel");
        joaquinTartas.insertarEmpleado("Jorge", "tecnico");
        pepitoTV.insertarEmpleado("Marcos", "Profesor");
        joaquinTartas.insertarInvitado("Pepe", "Pepedor", 3);
        joaquinTartas.insertarInvitado("Pepe", "Pepedor", 4);
        pepitoTV.insertarInvitado("Pepe", "Pepedor", 1);
        pepitoTV.insertarInvitado("Juan", "Papeador", 4);

        System.out.println("CADENA:");
        System.out.println(radioTV);
        System.out.println("PROGRAMA");
        System.out.println(joaquinTartas);
        System.out.println("VECES QUE FUE PEPE A JOAQUINTARTAS: " + joaquinTartas.vecesInvitado("pepe"));

        System.out.println("LISTA DE INVITADOS DE " + joaquinTartas.getNombre());
        System.out.println(joaquinTartas.getListaInvitados());



//        //creamos una cadena de tv
//        Cadena antena3 = new Cadena("Antena 3");
//        System.out.println(antena3);
//
//        //creamos un programa
//        Programa el_hormiguero = new Programa("El Hormiguero",antena3,"Director1");
//        System.out.println(el_hormiguero);
//        System.out.println(antena3);
//
//        //insertamos empleados en el programa
//        el_hormiguero.insertarEmpleado("Pablo Motos","presentador");
//        System.out.println(el_hormiguero);
//
//        //ver empleados del programa
//        System.out.println(el_hormiguero.getListaEmpleados());
//
//        //insertamos invitados en el programa
//        el_hormiguero.insertarInvitado("Aitana","cantante",1);
//
//        //ver invitados del programa
//        System.out.println(el_hormiguero.getListaInvitados());






    }

}

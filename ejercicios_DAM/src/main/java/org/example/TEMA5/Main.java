package org.example.TEMA5;

public class Main {
    static void main(String[] args) {

        Bocadillo pepito = new Bocadillo("Pepito", "integral", "bacon", "bigmac", 10.5);

//        System.out.println(pepito);

        pepito.imprimirInfoBocata();

        System.out.println(pepito.getNombre() + " " + pepito.getPrecio() + " " + "€" );


        Bocadillo vacio = new Bocadillo();

//        System.out.println(vacio.precio);

        vacio.setNombre("chivito");

        vacio.imprimirInfoBocata();
    }
}

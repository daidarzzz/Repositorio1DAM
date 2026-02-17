package org.example.TEMA6.Practica1;

public class AppEcommerce {

    static void main(String[] args) {

        Bizum bi = new Bizum("666666666");
        System.out.println(bi.getPin());
        Tienda.iniciarPago();


    }

}

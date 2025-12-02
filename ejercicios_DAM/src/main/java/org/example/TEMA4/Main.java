package org.example.TEMA4;

public class Main {

    public static void main(String[] args) {

        int num = 10;

        int numero = funcion(num);

        System.out.println(numero);

        procedimiento("David");

        System.out.println("He vuelto del procedimiento");

        for (String texto : args) {
            System.out.print(texto + " ");
        }

        System.out.println();

        pintar_nombres("patri", "david", "iris", "joaquin", "jacobo");
    }

    public static int funcion(int numero) { //Si en vez  de void pones un tipo de valor, devolverá ese tipo de valor.

        numero += 20;

        return numero*10;

    }

    public static void procedimiento(String nombre) { //Procedimiento no devuelve nada
        System.out.println("Hola " +  nombre +  " soy un procedimiento y hago mis cosas y no devuelvo nada.");
    }


    public static void pintar_nombres(String... nombres) { //Valor que puede ser variable

        for (String nombre : nombres) {
            System.out.print(nombre + " ");
        }

    }

}

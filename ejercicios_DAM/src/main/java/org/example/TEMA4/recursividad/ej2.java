package org.example.TEMA4.recursividad;

public class ej2 {
    static int limite = 9999;

    static void main(String[] args) {


        System.gc(); //Limpia lo que pueda antes de medir

        long inicioEjecucion = System.nanoTime();
        long memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

// PROGRAMA A REALIZAR
        numeros(1);
        long finEjecucion = System.nanoTime();
        long memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("Tiempo: " + (finEjecucion - inicioEjecucion) + " ns");
        System.out.println("Memoria consumida: " + (memoriaDespues - memoriaAntes) + " bytes");

        System.gc(); //Limpia lo que pueda antes de medir

         inicioEjecucion = System.nanoTime();
        memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        imprimirBucle();
// PROGRAMA A REALIZAR
        numeros(1);
         finEjecucion = System.nanoTime();
         memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("Tiempo: " + (finEjecucion - inicioEjecucion) + " ns");
        System.out.println("Memoria consumida: " + (memoriaDespues - memoriaAntes) + " bytes");


    }

    public static void numeros(int num) {
        if (num > limite) return;
        //System.out.println(num);
        numeros(num+1);
    }


    public static void imprimirBucle() {
        for (int i = 1; i < 9999; i++) {
            System.out.println(i);
        }
    }
}

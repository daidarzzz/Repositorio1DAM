package org.example.TEMA3.BuclesAnidados;

public class ForAnidados {
    static void main() {
        externo:
        for (int i = 0 ; i < 9 ; i++) {
            System.out.println("Soy el externo con  i = " + i);
            interno:
            for (int j = 10 ; j >= 0 ; j--) {
                System.out.println("Soy el interno con  j = " + j);
                if (j == 5) {
                    continue externo;
                }
                System.out.println(j+i + "hola");

            }
        }
    }
}

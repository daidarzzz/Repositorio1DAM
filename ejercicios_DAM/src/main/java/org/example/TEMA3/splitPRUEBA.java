package org.example.TEMA3;

import java.util.Arrays;

public class splitPRUEBA {
    static void main() {

        String cadena = "patri;liberto;fabian;silvia;angel;manuela;teacher(vero)";
        String numeros = "15;23;242;24124;1;6;924";
        String profesores[] = numeros.split(";");
        System.out.println(Arrays.toString(profesores));

        int vector[] = new int[profesores.length];

        for (int i = 0 ; i < profesores.length ; i++) {
            vector[i] = Integer.parseInt(profesores[i]);
        } //da error


    }
}

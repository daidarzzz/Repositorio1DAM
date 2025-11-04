package org.example.TEMA2.randomEjercicios;

import java.util.Random;

public class rangoRANDOMrecomendado {
    static void main() {
        Random aleatorio = new Random();
        //de 500 a 100.000
        int recomendado = aleatorio.nextInt(100000 - 500 +1) + 500;
        //int recomendado = aleatorio.nextInt(max - min + 1) + min;
    }
}

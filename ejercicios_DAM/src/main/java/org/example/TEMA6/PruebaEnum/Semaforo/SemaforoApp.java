package org.example.TEMA6.PruebaEnum.Semaforo;

public class SemaforoApp {

    static void main(String[] args) {
        Semaforo actual = Semaforo.ROJO;

        for (int i = 0; i < 10; i++) {
            System.out.println(actual.name());

            actual = actual.siguiente();

        }

    }

}

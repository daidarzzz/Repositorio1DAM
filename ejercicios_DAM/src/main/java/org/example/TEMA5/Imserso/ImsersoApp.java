package org.example.TEMA5.Imserso;

public class ImsersoApp {

    static void main(String[] args) {

        Abuelo antonio = new Abuelo("antonio", 80);
        Abuelo pepe = new Abuelo("pepe", 67);
        Abuelo marisa = new Abuelo("marisa", 75);
        Abuelo euge = new Abuelo("euge", 68);

        Autobus alsa = new Autobus("1234KKK", "CANARIAS");

        alsa.insertarAbuelo(antonio);
        alsa.insertarAbuelo(pepe);
        alsa.insertarAbuelo(marisa);
        alsa.insertarAbuelo(euge);


        System.out.println(alsa.getListaAbuelos());

        alsa.borrarAbuelo(euge);

        System.out.println(alsa.getListaAbuelos());

        alsa.mostrarAbuelos();

        alsa.mostrarMayores(75);
    }

}

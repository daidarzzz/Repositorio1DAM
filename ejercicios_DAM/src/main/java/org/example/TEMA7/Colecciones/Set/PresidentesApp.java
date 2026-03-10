package org.example.TEMA7.Colecciones.Set;

public class PresidentesApp {

    static void main(String[] args) {

        Presidente trump = new Presidente("Donald Trump", "USA");
        System.out.println(trump.hashCode());
        Presidente milei = new Presidente("Donald Trump", "USA");
        System.out.println(milei.hashCode());
        if (trump.equals(milei)) System.out.println("Iguales");
        else System.out.println("Son distintos");

    }

}

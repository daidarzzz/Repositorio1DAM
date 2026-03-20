package org.example.TEMA7.StringBuilder;

import java.util.Random;

public class Bus {
    static Random aleatorio = new Random();
    public static final int TAM = 97;

    public static void main(String[] args) throws InterruptedException {

        int a = 0; // POSICIÓN INICIAL DEL AUTOBÚS
        int b = 0;
        int c = 0;
        int d = 0;
        int numAleatorio = 0;
        System.out.println("\n<<<<<<<<<< AUTOBUSITO >>>>>>>>>>");
        Thread.sleep(3000);

        while (a < TAM && b < TAM && c < TAM &&d < TAM) {
            limpiarPantalla();


            numAleatorio = numAleatorio = aleatorio.nextInt(0,10);
            if (numAleatorio == 6)  a++; // avanzamos
            else if (numAleatorio == 3) b++;
            else if (numAleatorio == 5) c++;
            else if (numAleatorio == 9) d++;


            System.out.println(dibujarCarrera(a, b, c, d));
            Thread.sleep(70);



        }
        String ganador = "";
        if (a > b && a > c && a > d) ganador = "SAN JACOBO";
        if (b > a && b > c && b > d) ganador = "DAVID PRO";
        if (c > a && c > b && c > d) ganador = "JOAQUIN PRO";
        if (d > a && d > c && d > b) ganador = "iris cañizares garcía";

        System.out.println("\033[35m" + "EL AUTOBUSITO "+ ganador + " HA LLEGADO A SU DESTINO!!" + "\033[0m");

    }

    public static String dibujarCarrera(int n1, int n2, int n3, int n4) {

        StringBuilder sb = new StringBuilder();



        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("________________    ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|   SAN JACOBOS   |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append("_".repeat(117)).append("\n");

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n2)).append("________________    ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|   DAVID PRO     |)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append("_".repeat(117)).append("\n");
        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n3)).append("________________    ").append(" ".repeat(TAM - n3)).append("|\n");
        sb.append(" ".repeat(n3)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n3)).append("|\n");
        sb.append(" ".repeat(n3)).append("|   JOAQUIN PRO   |)").append(" ".repeat(TAM - n3)).append("|\n");
        sb.append(" ".repeat(n3)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n3)).append("|\n");
        sb.append("_".repeat(117)).append("\n");
        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n4)).append("________________    ").append(" ".repeat(TAM - n4)).append("|\n");
        sb.append(" ".repeat(n4)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n4)).append("|\n");
        sb.append(" ".repeat(n4)).append("|       IRIS      |)").append(" ".repeat(TAM - n4)).append("|\n");
        sb.append(" ".repeat(n4)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n4)).append("|\n");
        sb.append("_".repeat(117));

        return sb.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }


}

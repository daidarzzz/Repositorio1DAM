package org.example.TEMA2.pruebaExamen;

import java.util.Random;
import java.util.Scanner;

public class piedra_papel_tijera {
    static void main() {
        Random aleatorio = new Random();
        Scanner read = new Scanner(System.in);
        boolean ganador = false;
            int eleccion_ia = aleatorio.nextInt(1,4);
            int puntos_ia = 0;
            int puntos_user = 0;
            int ronda = 1;
        do {
            System.out.println("Ronda " + ronda);
            System.out.print("Elige (p/a/t): ");
            System.out.println("Marcador actual (PC - USUARIO): " + puntos_ia + "-" + puntos_user);
            char eleccion_user_char = read.next().charAt(0);
            int eleccion_user = eleccion_user_char == 'p' ? 1 : eleccion_user_char == 'a' ? 2 : 3;
            System.out.println(eleccion_user);


                switch (eleccion_user) {
                    case 1:
                        if (eleccion_ia == 2) {
                            System.out.println("El ordenador ha elegido: PAPEL");
                            System.out.println("HAS PERDIDO!!!");
                            puntos_ia++;
                            ronda++;
                        } else if (eleccion_ia == 3) {
                            System.out.println("El ordenador ha elegido: TIJERA");
                            System.out.println("HAS GANADO!!!");
                            puntos_user++;
                            ronda++;
                        } else {
                            System.out.println("El ordenador ha elegido: Piedra");
                            System.out.println("EMPATE!!!");
                        }
                        break;
                    case 2:
                        if (eleccion_ia == 1) {
                            System.out.println("El ordenador ha elegido: PIEDRA");
                            System.out.println("HAS GANADO!!!");
                            puntos_user++;
                            ronda++;
                        } else if (eleccion_ia == 3) {
                            System.out.println("El ordenador ha elegido: TIJERA");
                            System.out.println("HAS PERDIDO!!!");
                            puntos_ia++;
                            ronda++;
                        } else {
                            System.out.println("El ordenador ha elegido: PAPEL");
                            System.out.println("EMPATE!!!");
                        }
                        break;
                    case 3:
                        if (eleccion_ia == 1) {
                            System.out.println("El ordenador ha elegido: PIEDRA");
                            System.out.println("HAS PERDIDO!!!");
                            puntos_ia++;
                            ronda++;
                        } else if (eleccion_ia == 2) {
                            System.out.println("El ordenador ha elegido: PAPEL");
                            System.out.println("HAS GANADO!!!");
                            puntos_user++;
                            ronda++;
                        } else {
                            System.out.println("El ordenador ha elegido: TIJERA");
                            System.out.println("EMPATE!!!");
                        }
                        break;
                    default:
                        System.out.println("NO ELEGISTE NINGUNO DE LOS 3.");
                        return;
                }
        } while (ronda <= 3);
        if (puntos_ia > puntos_user) {
            System.out.println("GANÓ LA IA");
        } else {
            System.out.println("GANASTE");
        }

    }
}

package org.example.TEMA3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class laRULE {
    static void main() {
        Random aleatorio = new Random();
        Scanner read = new Scanner(System.in);
        Integer numeros_validos[] = new Integer[37];
        final String COLORES[] = {"rojo", "negro"};
        final String PAR_IMPAR[] = {"par", "impar"};
        for (int i = 0 ; i < numeros_validos.length ; i++) {
            numeros_validos[i] = i;
        }
        System.out.print("INTRODUCE TU APUESTA (€): ");
        double apuesta = read.nextDouble();
        do {
            System.out.println("DINERO ACTUAL: " + apuesta + "€");


            System.out.print("Introduce tu número de apuesta (0-36): ");
            int numero_apuesta = read.nextInt();

            if (!Arrays.asList(numeros_validos).contains(numero_apuesta)) {
                System.out.println("ERROR. NO SABES APOSTAR BRO");
                return;
            }
            String color_apuesta = "";
            String par_impar_apuesta = "";
            if (numero_apuesta != 0) {
                System.out.print("Introduce el color de tu apuesta (rojo-negro): ");
                color_apuesta = read.next().toLowerCase();

                if (!Arrays.asList(COLORES).contains(color_apuesta)) {
                    System.out.println("ERROR, el color no es válido (rojo-negro).");
                    return;
                }

                System.out.print("Introduce apuesta (par-impar): ");
                par_impar_apuesta = read.next().toLowerCase();

                if (!Arrays.asList(PAR_IMPAR).contains(par_impar_apuesta)) {
                    System.out.println("ERROR, la apuesta no es válida (par-impar).");
                    return;
                }
            }

            String color_sorteo = COLORES[aleatorio.nextInt(2)];
            int numero_sorteo = numeros_validos[aleatorio.nextInt(37)];

            String par_impar_sorteo = numero_sorteo % 2 == 0 ? "par" : "impar";

            System.out.println("Ha salido " + numero_sorteo + " " + color_sorteo + " " + par_impar_sorteo);

            if (numero_sorteo == numero_apuesta && color_sorteo.equals(color_apuesta) && par_impar_sorteo.equals(par_impar_apuesta)) {
                System.out.println("¡¡HAS GANADO!!");
                System.out.println("Recibes " + (apuesta * 2) + "€ y un beso de joaquín" );
                apuesta += apuesta*2;
                System.out.println("Dinero total: " + (apuesta));
            } else if (numero_sorteo == numero_apuesta) {
                System.out.println("has acertado el número");
                System.out.println("Recibes " + (apuesta * 0.5));
                apuesta += apuesta*0.5;
                System.out.println("Dinero total: " + (apuesta));
            } else if (color_sorteo.equals(color_apuesta)) {
                System.out.println("has acertado el color " + color_apuesta);
                System.out.println("Recibes " + (apuesta * 0.5));
                apuesta += apuesta*0.5;
                System.out.println("Dinero total: " + (apuesta));

            } else if (par_impar_apuesta.equals(par_impar_sorteo)) {
                System.out.println("has acertado  " + par_impar_sorteo);
                System.out.println("Recibes " + (apuesta * 0.5));
                apuesta += apuesta*0.5;
                System.out.println("Dinero total: " + (apuesta));

            } else {
                System.out.println("Has perdido " + (apuesta*0.5) + "€ 🙀");
                apuesta = apuesta * 0.5;
            }
            System.out.println("Quieres continuar? (S/N)");
            char opcion = read.next().toLowerCase().charAt(0);
            if (apuesta < 1) System.out.println("TE QUEDA MENOS DE 1€ fuera de aquí");
            switch (opcion) {
                case 's':
                    System.out.println("SEGUIMOS!!!");
                break;
                case 'n':
                    System.out.println("ADIOS :(");
                    break;
                default:
                    System.out.println("SEGUIMOS!!");
                    break;
            }
        } while (apuesta > 1);
    }
}

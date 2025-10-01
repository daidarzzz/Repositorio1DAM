package org.example.practicas;

import java.util.Scanner;

public class practica3 {
    static void main() {
        Scanner read = new Scanner(System.in);

        //Declaración de las constantes --> Todas las constantes serán números enteros en este caso.
        final int PESO_MAXIMO = 120;
        final int ALTURA_MAXIMA = 230;
        final int ALTURA_MINIMA = 140;


        //Declaración de las variables
        int altura = 0; //Declaro la altura como número entero
        double peso = 0; //Declaro el peso como número decimal

        System.out.println("***¡BIENVENIDO AL RATÓN JUGUETÓN!***"); //Mensaje de Bienvenida

        //Darle un valor a la variable altura
        try {
            System.out.println("Introduce tu altura (cm): ");
            altura = read.nextInt(); //Leemos lo que escribe el usuario por teclado, y asignamos ese valor a altura.
        } catch (Exception e) { //Cazamos cualquier excepción
            System.out.println("El formato introducido no es válido."); //En caso de que se introduzca un dato a altura imprevisto (Un string) Mostrará este mensaje.
            return; //Este comando acaba el programa.
        }

        if (altura < 0 || altura > ALTURA_MAXIMA) { //Si la altura es negativa o es mayor a la altura máxima, hacer...
            System.out.println("ERROR EN LA BÁSCULA, VUELVE A SUBIR DE NUEVO.");
        }
        else if (altura < ALTURA_MINIMA) { //Si la altura es menor que la altura mínima, hacer...
            int cm_restantes = ALTURA_MINIMA - altura; //Declaramos una variable entera para hacer la operación ALTURA MÍNIMA - altura.
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan " + cm_restantes + " cm de altura.");
            //Te manda un mensaje diciendo que no puedes entrar, y añade el valor de la variable cm_restantes
        }
        else { //Lo que se ejecuta si ninguna de las condiciones anteriores se cumple
            //Darle un valor a la variable peso
            try {
                System.out.println("Introduce tu peso (kg): ");
                peso = read.nextDouble(); //Leemos lo que escribe el usuario por teclado, y asignamos ese valor a peso.
            }catch (Exception e) {
                System.out.println("El formato introducido no es válido."); //Mensaje de error por formato no válido.
                return;

            }

            double peso_minimo = (altura * 2.0 / 8) ; //fórmula utilizada para calcular el peso mínimo a partir de la altura introducida.

            if (peso > PESO_MAXIMO) { //Si el peso es mayor que el peso máximo, hacer...
                System.out.println("LO SIENTO. Sobrepasas " + (peso - PESO_MAXIMO) + " kg el límite de la atracción. (" + PESO_MAXIMO + "kg)");
                System.out.println("¡¡FUERA DE LA ATRACCIÓN!!");
            }
            else if (peso < peso_minimo) { //Si el peso es menor que el peso mínimo, hacer...
                System.out.println("Pesas " + peso + " kg. Peso mínimo calculado: " + peso_minimo + " kg.");
                System.out.println("LO SIENTO. Pesas " + (peso_minimo - peso) + " kg menos del peso mínimo.");
                System.out.println("¡¡FUERA DE LA ATRACCIÓN!!");
            }
            else { //Lo que se ejecuta si ninguna de las condiciones anteriores se cumple
                System.out.println("Pesas " + peso + " kg. Peso mínimo calculado: " + peso_minimo + " kg.");
                System.out.println("¡¡SUBE A LA ATRACCIÓN!!");
            }
        }
    }
}

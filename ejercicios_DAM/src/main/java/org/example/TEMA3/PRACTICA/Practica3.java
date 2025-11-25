package org.example.TEMA3.PRACTICA;

import java.util.Arrays;
import java.util.Formattable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {
    static void main() {
        Scanner read = new Scanner(System.in);

        //Menú del ZX SPECTRUM
        System.out.println("****** VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM ******");
        System.out.println("Introduce la resolución de tu pantalla (ancho x alto)...");

        //Declaramos el alto y el ancho de la matriz
        int ancho = 0;
        int alto = 0;

        //Booleano que comprueba que la altura y anchura introducida esté entre las posibilidades (múltiplo de 8 y no mayor de 48)
        boolean ancho_alto_correctos = false;

        //Bucle para introducir el alto y el ancho, no parará de pedirlo hasta que los 2 valores sean correctos
        do { //Hacer mientras...
            try { //Intenta hacer esto . . .
                System.out.println("Ancho:");
                ancho = read.nextInt();
                System.out.println("Alto:");
                alto = read.nextInt();
                if (ancho % 8 != 0 || alto % 8 != 0) {
                    System.out.println("El alto y el ancho deben ser múltiplos de 8.");
                } else if (ancho > 48 || alto > 48) {
                    System.out.println("El alto y ancho no pueden ser mayores de 48.");
                } else {
                    ancho_alto_correctos = true;
                }
            }
            catch (InputMismatchException e) { //Si da IME (Excepción) haz esto . . .
                System.out.println("Error, debes de introducir un número entero válido."); //Te indica el error
                read.nextLine(); //Limpia el buffer
            }
        } while (!ancho_alto_correctos); //Repetir el bucle mientras el alto y ancho no sean correctos

        String pixeles[][] = new String[alto][ancho]; //Creamos la matriz "pixeles", donde introduciremos todos los colores. Usamos las variables alto y ancho para su altura y anchura.

        System.out.println("Introduce (linea a linea) los colores de tu imagen para cada píxel:");
        externo: //Bucle externo
        //En este for anidado se recorrerá todas las filas y columnas para introducir fila a fila los colores de cada pixel.
        for (int i = 0; i < pixeles.length; i++) { //i = 0, mientras que i sea menor que la longitud de la matriz pixeles, i se sumará en 1
            String fila[] = read.next().split(""); //Creamos un vector para cada fila, el usuario introduce unos colores, y se hace un split en el que separas cada letra de forma individual. Ese split será el vector
            if (fila.length != ancho) { //Si la longitud de la fila no es igual al ancho (osea, que si introduces menos/más valores de los que mide el ancho . . .
                System.out.println("Error. Cada fila debe de medir " + ancho + " de ancho."); //Te indica el error
                read.nextLine(); //Se limpia el buffer
                i--; //Se resta en 1 "i", así, al hacer el continue y "reiniciar", volverá al que dio error para repetirlo y hacerlo bien
                continue externo; //Vuelves a "externo" con un continue, que es el for padre
            }
            for (int j = 0; j < pixeles[i].length; j++) { //j = 0, mientras que j sea menor que la longitud de la matriz pixeles, j se sumará en 1
                //Se recorren todos los valores (columnas) de cada fila
                if (!fila[j].matches("[a-oA-O]")) {  //Si hay algún valor que no esté entre a-o . . .
                    System.out.println("Has introducido un valor de píxel incorrecto (A-O)"); //Te indica el error
                    //El mismo proceso para volver al externo que se hizo antes.
                    i--;
                    continue externo;
                }
                pixeles[i][j] = fila[j]; //Si no hay errores, en cada iteración de este for se va añadiendo los valores a la matrix "pixeles", para rellenar fila por fila la matriz
            }
        }

        //For each para recorrer los valores de la matriz (no las posiciones) y mostrar la matriz.
        for (String filas[] : pixeles ) { //Saca los vectores (filas) de la matriz
            System.out.println();
            for (String valor : filas) { //Saca cada valor de cada fila
                System.out.print(valor + " "); //Muestra el valor
            }
        }

        System.out.println();


        int contador_colores = 0; //Contador de cuantos colores hay en un bloque
        boolean colores_validos = true; //booleano que indica si en el bloque actual los colores son válidos (por defecto es true)


        //Inicializar variables necesarias para comprobar los colores por bloques
        int bloque_fila = 0;  //Indicará hasta que fila se recorre cada bloque
        int bloque_columna = 0; //Indicará hasta que columna se recorre cada bloque
        int num_bloque = 0; //Contador de por qué bloque vas
        int bloques_vertical = alto / 8; //Entero que te dice cuantos bloques se van a realizar


        inicio_bucle: //Inicio del bucle
        do { //Hacer . . .
            String[] colores = new String[2]; //Se crea un vector "colores", donde solo podrán ir 2 colores, cada vez que se va a un nuevo bloque se reinicia el vector


            //For anidado para recorrer cada bloque
            //Empezamos con i valiendo lo que vale bloque_fila (0), y hasta que no llegue a bloque fila + 8, se sumará en 1

            contador_colores = 0; //Con cada bloque el contador de colores se restablece

            for (int i = bloque_fila; i < bloque_fila + 8; i++) {

                //En el for interno se recorre j (columnas, la condición del for es la misma que el externo pero con columnas
                for (int j = bloque_columna; j < bloque_columna + 8 ; j++) {

                    String pixel = pixeles[i][j].toUpperCase(); //Recogemos el valor de la iteración en mayúsculas

                    if (!Arrays.asList(colores).contains(pixel) && contador_colores == 2) { //Si el pixel no está en el array de colores y ya hay 2 colores . . .
                        colores_validos = false; //Los colores no serán válidos, por lo que el spectrum no será compatible y se acabará todo el bucle.
                        break inicio_bucle; //Se acaba el inicio_bucle
                    }  else if (!Arrays.asList(colores).contains(pixel)) {  //De lo contrario, si el pixel no está en el array . . .
                        colores[contador_colores] = pixel; //Se añade el pixel al array de colores
                        contador_colores++; //El contador de cuantos colores hay se suma en 1
                    }

                }

                System.out.println();
            }

            bloque_fila += 8; //Al acabar el bloque, las filas se suman en 8 (pasa al siguiente bloque)
            num_bloque++; //El bloque pasa al siguiente (+1)
            if (num_bloque == bloques_vertical) { //Si el número del bloque es igual a los bloques que deben de haber en vertical . . .
                bloque_fila = 0; //vuelves a la primera fila
                bloque_columna += 8; //pero las columnas se incrementan en 8
            }

        } while (bloque_fila != alto && bloque_columna != ancho); //Mientras que el bloque de fila y de columna no hayan llegado al final . . .


        //Ternaria que evalúa si los colores son validos, si es así, te dice que el spectrum es compatible, de lo contrario, que no lo es.
        System.out.println((colores_validos ? "Es compatible con un ZX Spectrum" : "No es compatible con un ZX Spectrum"));


    }
}

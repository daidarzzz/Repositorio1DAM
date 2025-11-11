package org.example.TEMA3.PRACTICA;
import java.util.Random;
import java.util.Scanner;

public class practica1 {
    static void main() {
        Scanner read = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean inicio_correcto = false; //Este booleano indica si el primer equipo se ha realizado correctamente (Que el vector del equipo 1 haya sido creado sin errores)
        boolean mayor_menor = false; //Este booleano indicará si una potencia de samurai es mayor a 24 o menor a 1
        final int POTENCIA_REQUERIDA = 30; //Declaro como constante la potencia que requiere cada equipo de samurais
        System.out.println("*** BATALLA DE SAMURAIS ***");
        //Se declara el array de equipo 1 y 2
        int[] vector_equipo1 = new int[7];
        int[] vector_equipo2 = new int[7];
        //Se declara el array general, que será utilizado para clonarse a equipo 1 y 2
        int[] vector_general = new int[7];
        int sumatorio = 0; //Sumatorio total de la potencia de cada equipo de samurais
        int valor_equipo = 1; //Esta variable indica que equipo se está creando en el momento

        do { //Hacer . . .
            mayor_menor = false; //Se reinicia el booleano para que no de error infinitamente con cada vuelta del bucle
            sumatorio = 0; //Se restablece el contador con cada vuelta al bucle
            if (inicio_correcto) valor_equipo = 2; //Si el inicio ha sido correcto, ahora el equipo valdrá 2
            System.out.println("Equipo " + valor_equipo); //Te dice el equipo actual
            System.out.print("Introduce la potencia de los samurais: ");
            String equipo_string = read.nextLine(); //lee las potencias de los samurais
            String[] equipo = equipo_string.split(" "); //divide por espacios (" ") cada potencia, para poder después meterla en el array general
            vector_general = new int[equipo.length]; //El vector general tendrá los mismos parámetros que tenía el String "equipo"

            for (int i = 0; i < equipo.length; i++) { //i = 0, mientras que i sea menor que la longitud de equipo, i se sumará en 1
                vector_general[i] = Integer.parseInt(equipo[i]); //
                if (vector_general[i] < 1 || vector_general[i] > 24) {
                    mayor_menor = true;
                }
                sumatorio += vector_general[i];
            }
            //Con cada error a continuación hará que se tenga que volver a empezar el bucle (pero si ya tienes un equipo creado no se vuelven a introducir los datos de ese equipo)
            if (mayor_menor) System.out.println("El valor de potencia del samurai debe de estar entre 1 y 24."); //Si mayor_menor es true te indicará el error
            else if (sumatorio != POTENCIA_REQUERIDA) System.out.println("La potencia total no suma 30."); //Si el sumatorio de potencias de samurais no da 30 dará error
            else if (vector_general.length != 7) System.out.println("El equipo debe de tener 7 samurais"); //Si el array general no mide 7 dará error
            else if (!inicio_correcto) { //Si el inicio no es correcto (no se ha creado aún el array de equipo 1) . . .
                vector_equipo1 = vector_general.clone(); //El array de equipo 1 clona el array general
                inicio_correcto = true; //Al haber clonado correctamente el array general en el equipo 1, inicio_correcto será true, permitiendo acceder a equipo 2
            } else { //De lo contrario . . .
                vector_equipo2 = vector_general.clone(); //El array del equipo 2 clonará el array general
                break; //al acabar ambos equipos correctamente, se acaba el bucle de creación de equipos
            }
        } while (true); //Mientras que no haya un break, el bucle seguirá.

        int quien_empieza = aleatorio.nextInt(7); //Número aleatorio entre 0 y 6
        System.out.println("¡Empieza la batalla!");
        System.out.println("La batalla inicia con el samurai " + (quien_empieza+1)); //Te indica qué samurai empieza (Siempre se suma 1 para que empiece en 1 y no en 0)
        //Contador de puntos de equipo 1 y 2
        int contador_equipo1 = 0;
        int contador_equipo2 = 0;
        for (int i = quien_empieza ; i < vector_general.length ; i++) { //i es igual a "quien_empieza", mientras que i sea menor a la longitud del vector general, i se sumará en 1
            System.out.print("Samurai " + (i+1) + ". ");
            if (vector_equipo1[i] > vector_equipo2[i]) { //Si el samurai del equipo 1 tiene una potencia mayor que el del equipo 2 . . .
                System.out.println("Gana equipo 1. " + vector_equipo1[i] + " vs " + vector_equipo2[i]);
                contador_equipo1++; //+1 punto para equipo 1 (cada punto para un equipo es una baja para el equipo contrario)
            } else if (vector_equipo1[i] < vector_equipo2[i]) { //De lo contrario, si el samurai del equipo 2 tiene una potencia mayor que el del equipo 1 . . .
                System.out.println("Gana equipo 2. " + vector_equipo1[i] + " vs " + vector_equipo2[i]);
                contador_equipo2++;
            } else { //Si ambos samurais tienen la misma potencia . . .
                System.out.println("EMPATE. " + vector_equipo1[i] + " vs " + vector_equipo2[i]);
                //Nadie consigue puntos
            }
        }

        //En caso de que el número aleatorio fuese 0, la batalla comenzaría directamente con este for. En caso contrario, este for se ejecutará después del anterior, para continuar la batalla con los samurais que faltan hasta llegar al que inició el combate.

        for (int i = 0 ; i < quien_empieza ; i++) {
            System.out.print("Samurai " + (i+1) + ". ");
            if (vector_equipo1[i] > vector_equipo2[i]) {
                System.out.println("Gana equipo 1. " + vector_equipo1[i] + " vs " + vector_equipo2[i]);
                contador_equipo1++;
            } else if (vector_equipo1[i] < vector_equipo2[i]) {
                System.out.println("Gana equipo 2. " + vector_equipo1[i] + " vs " + vector_equipo2[i]);
                contador_equipo2++;
            } else {
                System.out.println("EMPATE. " + vector_equipo1[i] + " vs " + vector_equipo2[i]);
            }
        }

        if (contador_equipo1 > contador_equipo2) System.out.println("GANÓ EL EQUIPO 1. EQUIPO 2 HA TENIDO " + contador_equipo1 + " BAJAS."); //Si el equipo 1 tiene más puntos . . .
        else if (contador_equipo1 < contador_equipo2) System.out.println("GANÓ EL EQUIPO 2. EQUIPO 1 HA TENIDO " + contador_equipo2 + " BAJAS."); //Si el equipo 2 tiene más puntos . . .
        else System.out.println("EMPATE ENTRE LOS DOS EQUIPOS."); // Si tienen los mismos puntos . . .

        //System.out.println("PUNTUACIÓN: EQUIPO 1 (" + contador_equipo1 + ") EQUIPO 2 (" + contador_equipo2 + ")");
    }
}

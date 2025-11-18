package org.example.TEMA3.PRACTICA;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practica2 {
    static void main() {
        Scanner read = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("*** BIENVENIDO A LA PRIMITIVA ***");
        System.out.println("Introduce los datos de tu boleto: ");
        String boleto_usuario_sucio = read.nextLine(); //El usuario introduce su boleto en formato string
        boolean formato = boleto_usuario_sucio.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}"); //Se crea un booleano que será true en caso de que el formato del boleto sea correcto.

        if (formato) { //Si el formato es correcto . . .
            String[] boleto_usuario_vector = boleto_usuario_sucio.split("[-/]"); //Convertimos la variable del boleto del usuario a un vector utilizando split para separar cada valor por - y por /
            Integer[] boleto_usuario_vector_entero = new Integer[boleto_usuario_vector.length]; //Creamos un nuevo vector del boleto del usuario, pero como Integer, que medirá lo mismo que el vector original

            //Bucle para crear el vector de enteros
            for (int i = 0; i < boleto_usuario_vector.length; i++) { //i = 0, mientras que i sea menor a la longitud del boleto del usuario, i se sumará en 1
                boleto_usuario_vector_entero[i] = Integer.parseInt(boleto_usuario_vector[i]); //Se va añadiendo los valores del vector original pero convertidos a enteros
            }

            //Evaluar que todos los números del boleto cumplan con su rango (1-49)
            for (int i = 0 ; i < boleto_usuario_vector_entero.length - 1 ; i++) {
                if (boleto_usuario_vector_entero[i] < 1 || boleto_usuario_vector_entero[i] > 49) { //Si el número no está en el rango . . .
                    System.out.println("Has introducido un número fuera del rango (1-49)");
                    return; //Finaliza el programa.
                }
            }


            Integer[] boleto_ganador = new Integer[boleto_usuario_vector.length - 1]; //Se crea el array del boleto ganador, midiendo uno menos que el del usuario (este array no cuenta con el reintegro, irá aparte)

            boolean valor_repetido = true; //Booleano inicializado en true, que indicará si hay valores repetidos en el boleto ganador

            //Crear el boleto ganador
            for (int i = 0; i < boleto_ganador.length; i++) { //i = 0, mientras que i sea menor a la longitud del boleto ganador, i se sumará en 1
                boleto_ganador[i] = aleatorio.nextInt(1, 50); //Se crean 6 valores aleatorios entre el 1 y el 50 (pueden repetirse los valores) para el boleto ganador
            }

            //Bucle para quitar posibles repetidos
            do { //Hacer . . .
                valor_repetido = false; //Empezamos sin tener ningún valor repetido


                //Recorrer el boleto para evaluar posibles repetidos
                for (int i = 0; i < boleto_ganador.length - 1; i++) {
                    Arrays.sort(boleto_ganador); //Ordenamos el boleto ganador de menor a mayor
                    if (boleto_ganador[i].equals(boleto_ganador[i + 1])) { //Si el valor de la posición i es igual al de la posición i + 1
                        boleto_ganador[i] = aleatorio.nextInt(1, 50); //El valor i se recalculará por otro valor aleatorio
                        valor_repetido = true; //El booleano indicará que hay valores repetidos
                    }
                }

            } while (valor_repetido); //Mientras que valor_repetido sea true (por lo que como mínimo hay un valor repetido)




            int complementario = 0; //Inicializamos el complementario como entero
            int reintegro = aleatorio.nextInt(0, 10);  //El reintegro es un valor aleatorio entre el 0 y el 9
            boolean reintegro_acertado = false; //Creamos un booleano que indique si has acertado el reintegro
            boolean complementario_acertado = false; //Creamos un booleano que indique si has acertado el complementario

            if (boleto_usuario_vector_entero[boleto_usuario_vector_entero.length - 1] == reintegro) //Si el último valor del boleto del usuario (reintegro) es igual al reintegro . . .
                reintegro_acertado = true; //Has acertado el reintegro (Se pone true el booleano)!!!!!!!!!!!!!!!!!

            do { //Hacer . . .
                complementario = aleatorio.nextInt(1, 50); //Dar al complementario un valor aleatorio entre el 1 y el 49
            } while (Arrays.asList(boleto_ganador).contains(complementario)); //Mientras que el boleto ganador contenga el mismo número que el complementario (así conseguimos que el complementario sea distinto al boleto)
            if (Arrays.asList(boleto_usuario_vector_entero).contains(complementario)) complementario_acertado = true; //Si el usuario tiene el valor del complemenatario, ha acertado y es true

            System.out.println("BOLETO GANADOR: " + Arrays.toString(boleto_ganador)); //Te indica cual es el boleto ganador
            System.out.println("Complementario: " + complementario);//Te indica el complementario
            System.out.println("Reintegro: " + reintegro); //Te indica el reintegro
            int contador_numeros_ganadores = 0; //Contador que indica cuantos aciertos has tenido (de los 6 valores del boleto)

            //Bucle para buscar aciertos
            for (int i = 0; i < boleto_ganador.length; i++) { //i = 0, mientras que i sea menor al boleto ganador, i se sumará
                if (Arrays.asList(boleto_ganador).contains(boleto_usuario_vector_entero[i])) { //Si el boleto ganador contiene el valor que se está evaluando del usuario (i) . . .
                    contador_numeros_ganadores++; //Se suma 1 acierto
                }
            }

            //Mostrar resultado
            System.out.println();
            System.out.println("RESULTADOS:");
            System.out.println(contador_numeros_ganadores + (contador_numeros_ganadores == 1 ? " acierto." : " aciertos.")); //Mostrar aciertos
            if (reintegro_acertado) System.out.println("Reintegro."); //Si has acertado el reintegro, te lo indica
            System.out.println();
            System.out.println("--------------");
            System.out.println();
            if (contador_numeros_ganadores >= 3) { //Si tienes más de 3 aciertos, te indicará a qué categoría perteneces (has sido premiado)
                //Ternaria para indicar la categoría . . .
                System.out.print("Perteneces a la " + (contador_numeros_ganadores == 6 && reintegro_acertado ? "Categoría especial" : //Si aciertas todos y el reintegro . . .
                        contador_numeros_ganadores == 6 ? "1ª Categoría" : //Si aciertas todos . . .
                                contador_numeros_ganadores == 5 && complementario_acertado ? "2ª Categoría" : //Si aciertas 5 y el complementario . . .
                                        contador_numeros_ganadores == 5 ? "3ª Categoría" : //Si aciertas 5 . . .
                                                contador_numeros_ganadores == 4 ? "4ª Categoría" : "5ª Categoría")); //Si aciertas 4 . . .

            } else { //De lo contrario . . .
                System.out.println(reintegro_acertado ? "Acertaste el número del reintegro" : "No has sido premiado."); //Si acertaste el reintegro te lo indicará, sino, te dirá que no has sido premiado
            }

        } else { //Si el formato no es correcto . . .
            System.out.println("Formato incorrecto. (N-N-N-N-N-N/R)"); //Te avisa de ello y acaba el programa
        }

    }
}

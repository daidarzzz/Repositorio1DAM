package org.example.TEMA2.PRACTICAS;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class practica3 {
    static void main() {
        Scanner read = new Scanner(System.in);
        int resultado = 0; //Declaramos el resultado de la operación que se realizará al ISBN como entero
        String isbn = ""; //Declaramos el ISBN como string (por si se utiliza una X al final)
        int contador = 10; //Declaramos un contador como entero empezando en 10, que será el que realice las multiplicaciones a cada dígito del ISBN
        int contador_duda = 0; //Cuenta cuantos "?" se han introducido
        boolean realizar_proceso = false; //Este booleano indicará si el for que realizará la validación de ISBN se ejecuta o no
        int posicion_duda = 0; //Indica la posición del "?"
        int valor_duda = 0; //Es el valor que se asignará a "?" hasta obtener el correcto
        int multiplicacion = 0; //Declaramos como entero la multiplicación que se realizará a valor_duda ("?")
        //Imprimimos el menú
        System.out.println("*** VALIDADOR DE ISBN ***");
        System.out.println("[1] - Validar ISBN");
        System.out.println("[2] - Reparar ISBN");
        System.out.println("[x] - SALIR");
        System.out.print("Selecciona una opción: "); //Te pide seleccionar la opción a realizar
        String opcion = read.next().toLowerCase(); //Se guardará la opción introducida como un String en minúscula

        if (opcion.equals("1") || opcion.equals("2")) { //Si la opción escogida es la 1/2 . . .
            realizar_proceso = true; //Entonces el proceso de validación de ISBN se realizará
            System.out.print("Introduce el ISBN:"); //Te pedirá introducir el ISBN
            isbn = read.next(); //Leerá el ISBN que introduzca el usuario como String
            int longitud_isbn = isbn.length(); //Creamos la variable entera de longitud del ISBN
            if (longitud_isbn != 10) { //Si la longitud del ISBN no es 10 . . .
                System.out.println("El ISBN no cuenta con 10 dígitos."); //Te indicará un error: El ISBN no cuenta con 10 dígitos.
                return; //Saldrá del programa
            }
        }

        if (realizar_proceso) { //si el booleano realizar_proceso es true . . .
            for (int i = 0 ; i < 10; i++) { //i = 0, mientras que i sea menor que 10, i será i + 1
                char character = isbn.toLowerCase().charAt(i); //Recogemos el dígito correspondiente del ISBN, que será i (comienza en el índice 0, y se sumará hasta llegar a 9)
                if (i == 9 && character == 'x') { //Si i es igual a 9 y el carácter que ha introducido el usuario es x . . .
                    resultado = resultado + contador * 10; //El resultado será resultado + contador (multiplicación) * 10
                } else if ( character == '?' ) { //sino, si el carácter es "?" . . .
                    if (!opcion.equals("2")) { //Si la opción escogida no es equivalente a "2" . . .
                        System.out.println("No pueden haber un valor desconocido en una validación."); //Te dirá que no puede haber valores desconocidos ("?") en una validación
                        return; //saldrá del programa
                    }

                    contador_duda++; //El contador de duda se sumará (por ejemplo, indicando que ahora hay un valor con duda.)
                    posicion_duda = i; //la posición de la duda será i
                    multiplicacion = 10 - i; //la multiplicación a realizar será 10 menos i
                }
                else { //si no se cumplieron las anteriores . . .
                    try { //Intenta hacer lo siguiente
                        resultado = resultado + contador * Integer.parseInt(String.valueOf(character)); //Resultado será el resultado más contador * character convertido a entero (que antes de convertirlo a entero, se convirtió a string, porque al principio era un carácter)
                    } catch (NumberFormatException e) { //Si no se consigue hacer la operación . . .
                        System.out.println("ERROR AL CALCULAR EL ISBN"); //te indicará que hubo un error al calcular el ISBN
                        return; //saldrá del programa
                    }
                }
                contador--; //el contador se restará en 1, para multiplicar el siguiente número de forma correcta
            }
        }

        switch (opcion) { //se evaluarán los posibles casos de opción
            case "1": //en caso de que opción sea equivalente a "1" . . .
                if (resultado % 11 == 0) { //Si el resultado es múltiplo de 11 . . .
                    System.out.println("El ISBN es válido"); //el ISBN será válido
                } else { //De lo contrario
                    System.out.println("El ISBN es inválido"); //El ISBN será inválido
                }
                break; //Se rompe el switch (se sale de este)
            case "2": //en caso de que opción sea equivalente a "2" . . .

                if (contador_duda != 1) { //si hay menos/más de una duda . . .
                    System.out.println("No puede haber menos/más de un número desconocido."); //Te indica que solo puede haber un número desconocido
                    return; //te echa del programa
                }

                for (valor_duda = 0 ; valor_duda <= 10 ; valor_duda++) { //el valor de duda empezará en 0, mientras que valor_duda sea menor o igual a 10, este valor se sumará en 1
                    int prueba = valor_duda * multiplicacion + resultado;  //declaramos una prueba que servirá para comprobar si el valor_duda es el correcto, multiplicamos el valor_duda por multiplicación y lo sumamos a resultado
                    if (prueba % 11 == 0) { //en caso de que prueba sea múltiplo de 11, se romperá el switch, y se habrá encontrado ya el valor de "?" correcto. (El valor_duda actual es el valor correcto.)
                        break;
                    }
                }

                if (posicion_duda == 9 && valor_duda == 10) { //Si la posición del "?" es la última y su valor es 10 . . .
                    System.out.println("El número para reparar el ISBN es X (10)"); //El número a reparar será X (10)
                    System.out.println("ISBN reparado: " + isbn.replace("?", "X")); //Te mostrará el ISBN reemplazando el "?" por un "X"
                } else { //De lo contrario . . .
                    System.out.println("El número para reparar el ISBN es " + valor_duda); //Te muestra el valor de duda, que es el número para reparar el ISBN
                    System.out.println("ISBN reparado: " + isbn.replace("?", Integer.toString(valor_duda))); //Reemplaza el "?" por el valor de duda convertido a string
                }
                break; //Adiós al switch


            case "x": //en caso de que se haya introducido "x" . . .
                System.out.println("¡HASTA LUEGO!"); //Se despide tristemente de ti :(
                break; //termina el switch
            default: //en caso de que opción tenga cualquier otro valor
                System.out.println("Opción no contemplada."); //Te indicará que esa opción no está contemplada.
                break;
        }
    }
}

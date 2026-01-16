package org.example.TEMA4.recursividad;

import java.util.Scanner;

public class Bateria {
    public static Scanner read = new Scanner(System.in);
    static void main(String[] args) {
        menu();
    }

    public static String valorBinario = "";
    public static void menu(){
        System.out.println("**BATERIA DE EJERCICIOS DE RECURSIVIDAD**");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("\t 1 - Dígitos");
        System.out.println("\t 2 - Potencias");
        System.out.println("\t 3 - Del Revés");
        System.out.println("\t 4 - Binario");
        System.out.println("\t 5 - A binario");
        System.out.println("\t 6 - Orden alfabético");
        System.out.println("\t 7 - Mostrar suma");
        System.out.print("> ");
        int opcion = read.nextInt();
        switchCases(opcion);
    }

    public static void switchCases(int opcion) {
        switch (opcion) {
            case 1:
                System.out.print("Elige el número: ");
                int num = read.nextInt();
                System.out.println(digitos(num));
                break;
            case 2:
                System.out.println("Introduce la base y exponente: ");
                int base = read.nextInt();
                int exponente = read.nextInt();
                System.out.println(potencias(base, exponente));

                break;
            case 3:
                System.out.println("Elige el modo: ");
                int modo = read.nextInt();
                read.nextLine();
                if (modo == 1) {
                    System.out.print("Introduce el número: ");
                    int n = read.nextInt();
                    delReves(n);
                } else if (modo == 2) {
                    System.out.print("Introduce la frase: ");
                    String frase = read.nextLine();
                    char[] frase_char = frase.toCharArray();
                    del_reves_char(frase_char.length -1, frase_char);
                } else if (modo == 3) {
                    System.out.print("Introduce la frase: ");
                    String frase = read.nextLine();
                    del_reves_char_sin_vector(frase.length()-1, frase);
                }

                break;
            case 4:
                System.out.print("introduce el numero: ");
                String frase = read.next();
                System.out.print(binario(frase, frase.length() -1));
                break;
            case 5:

                System.out.print("Introduce un número: ");
                num = read.nextInt();
                System.out.println(pasarBinario(num));

                break;
            case 6:
                break;
            case 7:
                break;
        }


    }


    public static int digitos(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1+digitos(n/10);
        }
    }

    public static int potencias(int base, int exponente) {

        if (exponente == 1) {
            return base;
        } else {
            return base * potencias(base, exponente-1);
        }

    }

    public static void delReves(int num) {
        if (num < 10) {
            System.out.print(num);
        }
        else {
            System.out.print(num%10 + " ");
            delReves(num/10);
        }
    }

    public static void del_reves_char(int posicion, char[] frase) {
        if (posicion >= 0) {
            System.out.print(frase[posicion]);
            del_reves_char(posicion -1, frase);
        }
    }

    public static void del_reves_char_sin_vector(int posicion, String frase) {
        if (posicion >= 0) {
            System.out.print(frase.charAt(posicion));
            del_reves_char_sin_vector(posicion -1, frase);
        }
    }

    public static boolean binario (String num, int posicion) {
        if (posicion >= 0) {
            if (num.charAt(posicion) == '0' || num.charAt(posicion) == '1') {
                return binario(num, posicion -1);

            }
            else {
                return false;
            }
        }
        return true;
    }



    public static String pasarBinario(int num) {

        if (num <= 1) {
            return valorBinario = "1" + valorBinario;
        } else {

           valorBinario = (num % 2) + valorBinario;
           return pasarBinario(num/2);
        }

    }



    public static void mostrarSuma (int limite) {

    }
//    public static boolean binario (int num) {
//
//        if (num >= 10) {
//
//            if (num % 10 == 0 || num % 10 == 1) {
//                binario(num/10);
//            } else {
//                return false;
//            }
//
//        } else if (num == 0 || num == 1) {
//            return true;
//        }
//        return false;
//
//
//    }
}

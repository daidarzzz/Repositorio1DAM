package org.example.TEMA3;

import java.util.Scanner;

public class ejercicio9 {
    static void main() {
        Scanner read = new Scanner(System.in);
        String[] array = {"hola", "mundo", "palabramuylarga", "arroz", "joaquincalvo"};
        int palabra_lenght = -1;
        String palabra = "";
        for (int i = 0; i < array.length ; i++){
            if (array[i].length() > palabra_lenght) {
                palabra_lenght = array[i].length();
                palabra = array[i];
            }
        }
        System.out.println("La palabra más larga es " + palabra);


    }
}

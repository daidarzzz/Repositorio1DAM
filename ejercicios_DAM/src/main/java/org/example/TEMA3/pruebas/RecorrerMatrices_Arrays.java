package org.example.TEMA3.pruebas;

public class RecorrerMatrices_Arrays {
    static void main() {

        //Array
        int[] numeros = {10, 20, 30, 40, 50};

        //Con for
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        //Con for each
        for (int num : numeros) {
            System.out.print(num +  " ");
        }

        System.out.println();

        //Matriz

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        //For anidado
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //For each
        for (int fila[] : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Por columnas
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        //En diagonal
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();

        //Diagonal al reves
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + " ");
        }

    }
}

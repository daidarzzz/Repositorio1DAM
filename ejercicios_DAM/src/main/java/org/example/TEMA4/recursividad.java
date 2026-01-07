package org.example.TEMA4;

public class recursividad {

    static int limite = 10;

    static void main(String[] args) {



        numeros(1);


    }

    public static void numeros(int num) {
        if (num > limite) return;
        System.out.println(num);
        numeros(num+1);
    }

}

package org.example.TEMA4.recursividad;

public class ej1 {


    static void main(String[] args) {
        System.out.println(sumatorio(10));
    }


    public static int sumatorio(int num) {
        if (num == 0) {
            return num;
        } else {
            return num+sumatorio(num - 1);
        }
    }
}

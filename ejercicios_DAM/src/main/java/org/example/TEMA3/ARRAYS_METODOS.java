package org.example.TEMA3;

import org.example.TEMA1.Main;

import java.util.Arrays;

public class ARRAYS_METODOS {
    static void main() {
        int array[] = {1, 2 ,3};
        Arrays.toString(array);
        Integer arraypro[] = {1, 2 ,3};
        //no va porque es un dato primitivo, si fuese INTEGER en vez de int si que va.
        if (Arrays.asList(array).contains(3)) {
            System.out.println("LO TIENE");
        } else System.out.println("NO LO TIENE");


        //Este si que funciona porque no es primitivo, por ejemplo String también funcionaría porque empieza por mayúscula
        if (Arrays.asList(arraypro).contains(3)) {
            System.out.println("LO TIENE");
        } else System.out.println("NO LO TIENE");


        //ORDENAR ARRAY SIN ROMPER EL ORIGINAL
        Integer[] array_sort = arraypro.clone();
        Arrays.sort(array_sort);

    }
}

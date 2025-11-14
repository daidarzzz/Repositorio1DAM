package org.example.TEMA3;

import org.example.TEMA1.Main;

import java.util.Arrays;
import java.util.Collections;

public class ARRAYS_METODOS {
    static void main() {
        int array[] = {1, 2 ,3, 5 ,4};
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

        //ORDENAR DESCENDENTE
        Integer[] array_sort2 = arraypro.clone();
        Arrays.sort(array_sort, Collections.reverseOrder());

        System.out.println(Arrays.toString(array_sort));
        System.out.println(Arrays.toString(array_sort2));


        //BUSQUEDA BINARIA DE POSICIÓN DE UN NÚMERO
        //SI EL NÚMERO Q SE BUSCA NO ESTÁ DEVOLVERÁ UN NÚMERO NEGAIVO ALEATORIO

        int posicion = Arrays.binarySearch(array, 5); //puedes poner un array ordenado o desordenado, lo ordena el.
        System.out.println(posicion);

        //Si no funciona, es probable que sea porque debe de ser integer / debe de ser int el array, prueba



        //ELIMINAR DUPLICADOS
        int numeritos[] = {1, 2, 2, 2, 2, 3, 4, 5, 5, 5, 6, 6, 7};

        int numeritos_limpio[] = Arrays.stream(numeritos).distinct().toArray();

        System.out.println(Arrays.toString(numeritos_limpio));
    }
}

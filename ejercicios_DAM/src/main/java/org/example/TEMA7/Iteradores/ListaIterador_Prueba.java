package org.example.TEMA7.Iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListaIterador_Prueba {

    static void main(String[] args) {
        ArrayList<String> chatis = new ArrayList<>(Arrays.asList("ChatGPT", "DeepSeek", "Copilot", "Gemini", "Perplexiti"));

        //ListIterator<String> it = chatis.listIterator(chatis.size());
        ListIterator<String> it = chatis.listIterator();
//        it.next();
//        it.next();
        while (it.hasNext()) {
            //ESTUDIARSE COMO FUNCIONA EL nextINDEX
            System.out.println(it.nextIndex());
            String ia = it.next();
            System.out.println(it.nextIndex());

            System.out.println(ia);


        }
        //Cuando acabe este primer bucle, el iterador estará su posicion al final
        while (it.hasPrevious()) {

            System.out.println(it.previousIndex());
            String ia = it.previous();
            if (ia.equalsIgnoreCase("deepseek")) {
                it.add("claude");
            }
            System.out.println(it.previousIndex());
            System.out.println(ia);


        }
    }


}

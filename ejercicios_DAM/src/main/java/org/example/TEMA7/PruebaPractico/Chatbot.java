package org.example.TEMA7.PruebaPractico;

import java.util.HashMap;
import java.util.Scanner;

public class Chatbot {
    static HashMap<String, String> mapita = new HashMap<>();
    static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        precarga();
        String clave = "";
        System.out.println("Chatbot: Bienvenido! Escribe <salir> cuando quieras acabar la conversación...");
        do {

            System.out.print("Tú: ");
            clave = read.nextLine().toLowerCase();

            String respuesta = mapita.get(clave);

            if (respuesta == null) System.out.println("Chatbot: No te entiendo :(");
            else System.out.println("Chatbot: " + respuesta);


        } while (!clave.equalsIgnoreCase("salir"));

    }

    public static void precarga() {

        mapita.put("hola", "Hola, ¿En qué te puedo ayudar?");
        mapita.put("¿cómo estás?", "¡Estoy listo para ayudarte!!?");
        mapita.put("adiós", "¡Hasta luego!");
        mapita.put("gracias", "¡De nada! Que tengas un buen día.");
        mapita.put("salir", "¡Adiós!");

    }

}

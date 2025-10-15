package org.example.TEMA2;

public class StringsTema2 {
    static void main() {
        String frase = "Al palo JuanFran del Atleti palo";

        int tam = frase.length();

        System.out.println(tam);

        System.out.println(frase.charAt(8));

        String trozo = frase.substring(8,16);
        System.out.println(trozo);

        String trozo_final = frase.substring(17);
        System.out.println(trozo_final);

        int posicion = frase.indexOf("palo");
        System.out.println(posicion);

        int posicion2 = frase.indexOf("palo", 10);
        System.out.println(posicion2);

        int posicion_ultimo = frase.lastIndexOf("palo");
        System.out.println(posicion_ultimo);

        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);

        String frase_minusculas = frase.toLowerCase();
        System.out.println(frase_minusculas);

        String base_datos = "Raúl                          ";
        System.out.println(base_datos.trim() + " - " + base_datos + "#");

        boolean igual = base_datos.trim().equals("Raúl");
        System.out.println(igual);

        boolean igual_sin_mayusculas = "Raúl".equalsIgnoreCase("raúl"); //ignora si es mayuscula o minuscula
        System.out.println(igual_sin_mayusculas);

        String frase_reemplazos = frase.replace("palo", "Florentino");
        System.out.println(frase_reemplazos);
        String ultimo = frase.replaceFirst("palo", "Florentino");
        System.out.println(ultimo);
    }
}

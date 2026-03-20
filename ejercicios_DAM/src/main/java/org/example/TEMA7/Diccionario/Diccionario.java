package org.example.TEMA7.Diccionario;

import java.util.*;

public class Diccionario {

    static Scanner read = new Scanner(System.in);
    static Random aleatorio = new Random();

    static HashMap<String, String> mapa = new HashMap<>();
    static Set<String> listaIndices = new HashSet<>();
    static ArrayList<String> listaIndicesFinal;
    static void main(String[] args) {
        precarga();

        System.out.println("Bienvenido al diccionario de  español a inglés.");
        String opcion = "";
        int preguntas = 0;
        int aciertos = 0;
        while (true) {

            String palabra = palabraAleatoria();

            System.out.println(palabra + ": " + primeraLetraTraduccion(palabra) + "...");
            System.out.print("Indique la respuesta: ");
            opcion = read.nextLine().toLowerCase();

            if (opcion.equals("salir")) {
                System.out.println("FIN DEL PROGRAMA");
                System.out.println("Total de preguntas: " + preguntas);
                System.out.println("Total de aciertos: " + aciertos);
                System.out.println("Total de fallos: " + (preguntas - aciertos));
                System.out.println("Aciertos: " + ((aciertos * 100) / preguntas) + "%");
                break;
            }
            if (mapa.get(palabra).equals(opcion)) {
                System.out.println("¡CORRECTO!");
                System.out.println();
                aciertos++;
            } else {
                System.out.println("NO. La respuesta es " + mapa.get(palabra));
            }

            preguntas++;

        }

    }

    public static void precarga() {

        nuevoPar("hola@hello");
        nuevoPar("adios@goodbye");
        nuevoPar("gracias@thank you");
        nuevoPar("por favor@please");
        nuevoPar("si@yes");
        nuevoPar("no@no");

        nuevoPar("casa@house");
        nuevoPar("coche@car");
        nuevoPar("puerta@door");
        nuevoPar("ventana@window");
        nuevoPar("mesa@table");
        nuevoPar("silla@chair");
        nuevoPar("cama@bed");
        nuevoPar("cocina@kitchen");
        nuevoPar("baño@bathroom");

        nuevoPar("perro@dog");
        nuevoPar("gato@cat");
        nuevoPar("pajaro@bird");
        nuevoPar("pez@fish");
        nuevoPar("caballo@horse");

        nuevoPar("comer@eat");
        nuevoPar("beber@drink");
        nuevoPar("dormir@sleep");
        nuevoPar("correr@run");
        nuevoPar("caminar@walk");
        nuevoPar("hablar@speak");
        nuevoPar("leer@read");
        nuevoPar("escribir@write");

        nuevoPar("agua@water");
        nuevoPar("pan@bread");
        nuevoPar("leche@milk");
        nuevoPar("queso@cheese");
        nuevoPar("carne@meat");
        nuevoPar("pescado@fish");
        nuevoPar("arroz@rice");
        nuevoPar("huevo@egg");
        nuevoPar("fruta@fruit");

        nuevoPar("rojo@red");
        nuevoPar("azul@blue");
        nuevoPar("verde@green");
        nuevoPar("amarillo@yellow");
        nuevoPar("negro@black");
        nuevoPar("blanco@white");

        nuevoPar("grande@big");
        nuevoPar("pequeño@small");
        nuevoPar("alto@tall");
        nuevoPar("bajo@short");
        nuevoPar("rapido@fast");
        nuevoPar("lento@slow");

        nuevoPar("escuela@school");
        nuevoPar("profesor@teacher");
        nuevoPar("estudiante@student");
        nuevoPar("libro@book");
        nuevoPar("cuaderno@notebook");
        nuevoPar("lapiz@pencil");
        nuevoPar("boligrafo@pen");

        nuevoPar("ciudad@city");
        nuevoPar("pueblo@town");
        nuevoPar("calle@street");
        nuevoPar("parque@park");
        nuevoPar("tienda@shop");
        nuevoPar("mercado@market");

        nuevoPar("familia@family");
        nuevoPar("padre@father");
        nuevoPar("madre@mother");
        nuevoPar("hermano@brother");
        nuevoPar("hermana@sister");
        nuevoPar("hijo@son");
        nuevoPar("hija@daughter");

        nuevoPar("dia@day");
        nuevoPar("noche@night");
        nuevoPar("mañana@morning");
        nuevoPar("tarde@afternoon");
        nuevoPar("semana@week");
        nuevoPar("año@year");

        nuevoPar("tonto@dumb");
        nuevoPar("profesor@teacher");
        nuevoPar("nota@grade");
        nuevoPar("factura@invoice");
        nuevoPar("multa@fine");


        listaIndicesFinal = new ArrayList<>(mapa.keySet());

        System.out.println(listaIndicesFinal);

    }

    public static void nuevoPar(String claveValor){

        String[] texto = claveValor.split("@");
        mapa.put(texto[0], texto[1]);

    }

    public static String traduce(String clave){

        return mapa.get(clave);
    }
    public static String palabraAleatoria(){
        int indice = aleatorio.nextInt(0, listaIndicesFinal.size());
        String palabra = listaIndicesFinal.get(indice);
        listaIndicesFinal.remove(indice);
        return palabra;
    }
    public static char primeraLetraTraduccion(String clave){

        String valor = mapa.get(clave);
        return valor.charAt(0);

    }

}

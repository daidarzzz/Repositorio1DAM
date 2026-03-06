package org.example.TEMA7.Colecciones.List.COlas;

import java.util.*;

public class Ejercicio4 {
    static Scanner read = new Scanner(System.in);
    static LinkedList<String> listaCompra = new LinkedList<>();
    static Boolean seguir = true;

    static void main(String[] args) {

        while (seguir) {
            menu();
        }

    }

    public static void menu() {
        System.out.println("--- LISTA DE LA COMPRA ---");
        System.out.println("1. Añadir producto al final");
        System.out.println("2. Eliminar primer producto");
        System.out.println("3. Eliminar producto por nombre");
        System.out.println("4. Ver primer producto");
        System.out.println("5. Buscar producto ");
        System.out.println("6. Mostrar lista actual");
        System.out.println("X. Salir");
        System.out.println();
        System.out.print("Seleccione una opción: ");
        char op = read.next().toUpperCase().charAt(0);
        seguir = switchOpciones(op);
        System.out.println("------------------------");
    }

    public static boolean switchOpciones(char op) {
        switch (op) {
            case '1':
                System.out.print("Producto a añadir: ");
                String producto = read.next();
                listaCompra.offerLast(producto);
                break;
            case '2':
                if (!listaCompra.isEmpty()) {
                    listaCompra.pollFirst();
                    System.out.println("Primer producto eliminado");
                } else {
                    System.out.println("No hay productos.");
                }
                break;
            case '3':
                System.out.print("Qué producto quieres eliminar: ");
                String producto2 = read.next();
                if (listaCompra.contains(producto2)) {
                    listaCompra.remove(producto2);
                } else {
                    System.out.println("No se encuentra el producto");
                }
                break;
            case '4':
                System.out.println("Primer producto: " + listaCompra.peekFirst());
                break;
            case '5':
                System.out.print("Qué producto buscas: ");
                String producto3 = read.next();
                if (listaCompra.contains(producto3)) {
                    System.out.println("El producto " + producto3 + " está en la lista");
                } else {
                    System.out.println("No está en la lista");
                }
                break;
            case '6':
                System.out.println("LISTA DE PRODUCTOS");
                for (String product : listaCompra) {
                    System.out.println((listaCompra.indexOf(product)+1) + "." + product);
                }
                break;
            case 'X':
                System.out.println("Adios!!!");
                return false;
            default:
                System.out.println("Opción no contemplada");
                break;
        }
        return true;

    }

}

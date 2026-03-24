package org.example.TEMA7.MercaDam;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AppZonaClientes {

    static Cliente cliente;
    static Scanner read = new Scanner(System.in);

    static void main(String[] args) {

        MercaDam mercaDam = new MercaDam();

        final int numClientes = 5;

        mercaDam.generarClientes(numClientes);
        System.out.print(numClientes + " generados: " + mercaDam.getClientes());
        System.out.println();
        boolean loginCorrecto = autenticacion(mercaDam.getClientes());
        if (!loginCorrecto) return;
        iniciarCompra();

    }

    public static boolean autenticacion(Set<Cliente> clientes) {
        System.out.println("=== COMPRA ONLINE EN MERCADAM ===");
        int intentos = 3;
        boolean loginCorrecto = false;
        do {
            System.out.println("usuario: ");
            String usuario = read.next();
            System.out.println("contraseña: ");
            String contrasenya = read.next();
            cliente = new Cliente(usuario, contrasenya);
            if (clientes.contains(cliente)) {
                loginCorrecto = true;
                for (Cliente cliente1 : clientes) {
                    if (cliente1.equals(cliente)) cliente = cliente1;
                }
            } else {
                intentos--;
                System.out.println("Credenciales no válidas. Intentos: " + intentos);
            }
        } while (!loginCorrecto && intentos > 0);
        if (intentos == 0) {
            System.out.println("ERROR DE AUTENTICACIÓN");
            return false;
        }
        else return true;
    }

    public static void iniciarCompra() {
        cliente.crearPedido();
        System.out.println("Bienvenido, " + cliente.getUsuario());
        System.out.println("Creando nuevo pedido...");
        imprimirProductos();
    }

    public static void imprimirProductos() {
        System.out.println("Elige un producto de la lista...");
        for (Producto producto : Producto.values()) {
            System.out.println(producto + ": " + producto.getPrecio() + "€");
        }
        System.out.println("=====================================================");
        char seguir = 'S';
        do {
            System.out.println("Elige un producto: ");
            String opcion = read.next().toUpperCase();
            System.out.println();
            try {
                Producto producto = Producto.valueOf(opcion);
                cliente.insertarProducto(producto);
                System.out.println("Has añadido " + producto + " con un precio de " + producto.getPrecio() + "€");
                cliente.getPedido().actualizarImporteTotal(producto.getPrecio());

                System.out.println("Importe total del pedido: " + cliente.getPedido().getImporteTotal() + "€");

                System.out.println("Quieres añadir más productos (S/N)?");
                seguir = read.next().toUpperCase().charAt(0);
                System.out.println();
            } catch (IllegalArgumentException e) {
                System.out.print("Producto no reconocido. Elige otro... ");
                System.out.println();
            }
        } while (seguir == 'S');

        imprimirResumen();

        mostrarOpciones();

    }

    public static void imprimirResumen() {
        System.out.println("=== RESUMEN DE TU CARRITO DE LA COMPRA ===");
        System.out.println("Productos: ");
        for (Map.Entry<Producto, Integer> mapita : cliente.getPedido().getProductos().entrySet()) {
            System.out.println(mapita.getValue() + " " + mapita.getKey() + " " + mapita.getKey().getPrecio());
        }
        System.out.println("Importe total: " + cliente.getPedido().getImporteTotal() + "€");
    }

    public static void imprimirResumenOrdenado() {
        System.out.println("=== RESUMEN DE TU CARRITO DE LA COMPRA ===");
        System.out.println("Productos: ");
        for (Map.Entry<Producto, Integer> mapita : cliente.getPedido().getProductos().entrySet()) {
            System.out.println(mapita.getValue() + " " + mapita.getKey() + " " + mapita.getKey().getPrecio());
        }
        System.out.println("Importe total: " + cliente.getPedido().getImporteTotal() + "€");
    }

    public static void imprimirDespedida() {
        System.out.println("=== GRACIAS POR SU PEDIDO ===");
        System.out.println("Lo recibirá en unos días en la dirección " + cliente.getDireccion());
    }

    public static void mostrarOpciones() {
        int opcion = 0;
        do {

            System.out.println("=====================================================");
            System.out.println("¿Qué desea hacer?");
            System.out.println("[1]. Aplicar promos.");
            System.out.println("[2]. Mostrar resumen ordenado por uds.");
            System.out.println("[3]. Borrar producto de la lista.");
            System.out.println("[4]. Terminar pedido.");

            System.out.println("Selecciona una opción:");
            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    cliente.getPedido().aplicarPromo3x2();
                    cliente.getPedido().aplicarPromo10();
                    break;
                case 2:
                    imprimirResumenOrdenado();
                    break;
                case 3:
                    break;
                case 4:
                    imprimirDespedida();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;

            }
        } while (opcion != 3);
    }

}

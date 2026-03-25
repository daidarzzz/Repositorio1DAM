package org.example.TEMA7.MercaDam;

import java.sql.SQLOutput;
import java.util.*;

/**
 * Clase principal donde vamos a usar las demás clases y ejecutar sus métodos y métodos propios de esta clase
 */
public class AppZonaClientes {

    static Cliente cliente;
    static Scanner read = new Scanner(System.in);

    /**
     * Método donde se ejecuta el programa principal, en este creamos el supermercado,
     * los clientes, realizamos un login y comenzamos la compra.
     * @param args
     */
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

    /**
     * Método que sirve para logearte correctamente.
     * Tienes 3 intentos, en caso de que falles esas 3 veces el
     * usuario o contraseña, se acaba el programa (devolviendo false),
     * en caso contrario, el cliente "tonto" generado previamente,
     * se le será asignada la dirección de memoria de la cuenta a la que
     * inicio sesión
     * @param clientes
     * @return
     */
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

    /**
     * Método que crea sirve para llamar a otros métodos (crear pedido e imprimir los productos disponibles)
     */
    public static void iniciarCompra() {
        cliente.crearPedido();
        System.out.println("Bienvenido, " + cliente.getUsuario());
        System.out.println("Creando nuevo pedido...");
        imprimirProductos();
    }

    /**
     * Método que te imprime los productos disponibles en la lista y te deja elegir los que añadir
     * al carrito de la compra, añade productos hasta que el usuario introduzca un carácter que no
     * sea 's'. Al dejar de añadir productos, te mostrará el resumen del pedido, y llamará al método de
     * mostrarOpciones.
     */
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

    /**
     * Método que te muestra un resumen del pedido actual.
     * Utiliza un foreach de un Map.Entry (que te permite usar clave y valor),
     * en cada iteración se imprime un producto del carrito, el precio y la cantidad del producto
     * al final se imprime el importe total del pedido.
     */
    public static void imprimirResumen() {
        System.out.println("=== RESUMEN DE TU CARRITO DE LA COMPRA ===");
        System.out.println("Productos: ");
        for (Map.Entry<Producto, Integer> mapita : cliente.getPedido().getProductos().entrySet()) {
            System.out.println(mapita.getValue() + " " + mapita.getKey() + " " + mapita.getKey().getPrecio());
        }
        System.out.println("Importe total: " + cliente.getPedido().getImporteTotal() + "€");
    }

    /**
     * Método que imprime el mismo resumen pero este está ordenado por cantidad
     * del producto. Se crea una lista de Map.Entry, que se inicializa como un ArrayList.
     * Mediante Comparator, realizamos un Collections.sort, e indicamos que clase va a realizar
     * la ordenación. Después de ordenar la lista, la procedemos a imprimir mediante un foreach
     */
    public static void imprimirResumenOrdenado() {
        System.out.println("=== RESUMEN DE TU CARRITO DE LA COMPRA ===");
        System.out.println("Productos: ");

        List<Map.Entry<Producto, Integer>> lista = new ArrayList<>(cliente.getPedido().getProductos().entrySet());

        Collections.sort(lista, new OrdenadoPorUnidades().reversed());

        for (Map.Entry<Producto, Integer> mapita : lista) {
            System.out.println(mapita.getValue() + " " + mapita.getKey() + " " + mapita.getKey().getPrecio());
        }

        System.out.println("Importe total: " + cliente.getPedido().getImporteTotal() + "€");
    }

    /**
     * Método que se despide
     */
    public static void imprimirDespedida() {
        System.out.println("=== GRACIAS POR SU PEDIDO ===");
        System.out.println("Lo recibirá en unos días en la dirección " + cliente.getDireccion());
    }

    /**
     *Este método sirve para borrar un producto del carrito de la compra, introduces cual producto quieres borrar, y
     * en caso de que el producto no esté en el carrito o no exista, te lo dirá. En caso de que quieras borrar un producto
     * que tiene una unidad, hará un remove, borrando el producto, en caso de que tenga más de una unidad, restará en uno
     * la cantidad del producto.
     */
    public static void borrarProducto() {
        imprimirResumen();
        System.out.println("=== BORRAR PRODUCTO ===");
        System.out.println("Introduce el producto que deseas borrar (1 unidad): ");
        try {
            Producto producto = Producto.valueOf(read.next().toUpperCase());
            if (!cliente.getPedido().getProductos().containsKey(producto)) {
                throw new IllegalArgumentException();
            }

            if (cliente.getPedido().getProductos().get(producto) == 1) {
                cliente.getPedido().getProductos().remove(producto);
            } else {

                int cantidad = cliente.getPedido().getProductos().get(producto);
                cliente.getPedido().getProductos().put(producto, cantidad-1);


            }

            cliente.getPedido().setImporteTotal(cliente.getPedido().getImporteTotal() - producto.getPrecio());

        } catch (IllegalArgumentException e) {
            System.out.println("El producto escogido no se encuentra en el carrito de la compra.");
        }
    }

    /**
     * Método que te muestra las opciones que puedes hacer con tu pedido, cada
     * opción llamará a un método distinto que realizará la acción.
     */
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
                    if (cliente.isPromociones()) {
                        System.out.println("Este cliente ya tiene promociones.");
                    } else {
                        cliente.getPedido().aplicarPromo3x2();
                        cliente.getPedido().aplicarPromo10();
                        cliente.setPromociones(true);


                        System.out.println("=========================================");
                        System.out.println("PROMO 3X2 y 10% DESC. APLICADAS");
                        System.out.println("=========================================");

                        imprimirResumen();

                    }


                    break;
                case 2:
                    imprimirResumenOrdenado();
                    break;
                case 3:
                    borrarProducto();
                    break;
                case 4:
                    imprimirDespedida();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;

            }
        } while (opcion != 4);
    }

}

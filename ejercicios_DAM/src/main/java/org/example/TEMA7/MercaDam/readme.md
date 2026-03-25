# Práctica FINAL - App de MercaDam

## Índice de contenido
1. [Introducción](#introducción)
2. [Estructura de clases](#estructura-de-clases)
3. [Programa principal](#programa-principal)
4. [Entrega](#entrega)

---

### 1. Introducción

La práctica va de realizar una app que gestione un supermercado de MercaDAM, en el que gestionaremos a los clientes y sus pedidos, la aplicación generará clientes aleatorios, que podrán gestionar su carrito de la compra añadiendo productos, borrandolos, aplicando descuentos, etc.


### 2. Estructura de clases

#### Contenido de las clases (java)

- Clase **Cliente.java**
> [Link al archivo](https://github.com/daidarzzz/Repositorio1DAM/blob/main/ejercicios_DAM/src/main/java/org/example/TEMA7/MercaDam/Cliente.java)

````
package org.example.TEMA7.MercaDam;

import java.util.Objects;

/**
 * Clase que representa a un cliente que compra en la aplicación de MERCADAM
 * Contiene atributos básicos como su usario, contraseña, direccion, el pedido y
 * si tiene promociones activas
 */
public class Cliente {

    private String usuario;
    private String contrasenya;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    /**
     *
     * Constructor que recibe el usuario y la contraseña como parámetro,
     * con una dirección por defecto, y las promociones en false.
     * @param usuario nombre de usuario de 8 caracteres
     * @param contrasenya contraseña de 8 caracteres
     */
    public Cliente(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.pedido = null;
        this.promociones = false;
        this.direccion = "Calle falsa, 123";
    }

    /**
     * Inicializa el pedido, que empieza siendo null en el constructor
     */
    public void crearPedido() {
        pedido = new Pedido();
    }

    /**
     * Método que sirve para añadir un producto al carrito
     * Si el pedido no tiene ese producto aún, se inicializa la cantidad en 1.
     * En caso contrario, recogemos la cantidad y la aumentamos en uno.
     * @param producto el producto que se va a insertar al mapa
     */
    public void insertarProducto(Producto producto){

        int cantidad = 0;
        if (!this.pedido.productos.containsKey(producto)) this.pedido.productos.put(producto, 1);
        else {
            cantidad = pedido.productos.get(producto);

            pedido.productos.put(producto, cantidad + 1);
        }

    }

    /**
     * GETTER Y SETTER BÁSICOS
     */
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean isPromociones() {
        return promociones;
    }

    public void setPromociones(boolean promociones) {
        this.promociones = promociones;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                '}';
    }

    /**
     * Método equals que comprueba que un objeto sea igual a otro
     * @param o   the reference object with which to compare.
     * @return Devuelve true si son iguales, false si son distintos
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(usuario, cliente.usuario) && Objects.equals(contrasenya, cliente.contrasenya);
    }

    /**
     * @return Método que devuelve el hash de un objeto
     */
    @Override
    public int hashCode() {
        return Objects.hash(usuario, contrasenya);
    }
}

````

- Clase **MercaDam.java**
> [Link al archivo](https://github.com/daidarzzz/Repositorio1DAM/blob/main/ejercicios_DAM/src/main/java/org/example/TEMA7/MercaDam/MercaDam.java)

````
package org.example.TEMA7.MercaDam;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Clase que representa al supermercado, administra los clientes qye tiene el super
 */
public class MercaDam {
    static Random aleatorio = new Random();
    private Set<Cliente> clientes;

    /**
     * Constructor básico, que inicializa la lista de clientes
     */
    public MercaDam() {
        this.clientes = new HashSet<>();
    }

    /**
     *
     * Este método utiliza la clase Random para elegir 8 carácteres aleatorios para el usuario y la contraseña
     * En caso de que el random cree dos clientes iguales, volverá a crear al último cliente hasta que no haya ningún duplicado
     * @param cantidad la cantidad de clientes que queremos generar
     */
    public void generarClientes(int cantidad) {
        String[] caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".split("");

        for (int i = 0; i < cantidad; i++) {
            String usuario = "";
            String password = "";
            for (int j = 0; j < 8; j++) {
                usuario += caracteres[aleatorio.nextInt(0, caracteres.length)];
                password += caracteres[aleatorio.nextInt(0, caracteres.length)];
            }

            Cliente cliente = new Cliente(usuario, password);
            if (clientes.contains(cliente)) {
                i--;
                continue;
            } else {
                clientes.add(cliente);
            }
        }

    }

    /**
     * Método que devuelve un Set de clientes que no puede ser modificado
     * @return
     */
    Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }

}

````

- Clase **Pedido.java**
> [Link al archivo](https://github.com/daidarzzz/Repositorio1DAM/blob/main/ejercicios_DAM/src/main/java/org/example/TEMA7/MercaDam/Pedido.java)

````
package org.example.TEMA7.MercaDam;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Esta clase sirve para guardar el "carrito de la compra", aquí se guardan los productos que compras
 * y la cantidad de unidades, además de que aquí se aplican los descuentos y el importe total.
 */
public class Pedido {

    /**
     * Tenemos dos atributos, importeTotal que es el precio final de tu carrito
     * de la compra, y "productos", que es un mapa ordenado (tree), en el que se inserta
     * el producto y la cantidad de unidades que el cliente va a llevarse
     */
    protected TreeMap<Producto, Integer> productos;
    private double importeTotal;

    /**
     * Constructor básico, donde se inicializa el mapa y el importe se deja a 0
     */
    public Pedido() {
        this.productos = new TreeMap<>();
        this.importeTotal = 0;
    }

    /**
     * Método que actualiza el importe total sumando el precio del nuevo producto
     * @param importeTotal precio del producto actual
     */
    public void actualizarImporteTotal(double importeTotal) {
        this.importeTotal += importeTotal;
    }

    /**
     * Método que aplica una promoción 3x2, cada 3 productos, habrá un producto "regalo",
     * y al final se multiplicará el precio de los productos regalo (el descuento que se aplicará)
     * y se resta al importe total.
     */
    public void aplicarPromo3x2() {

        for (Producto producto : productos.keySet()) {

            int cantidad = productos.get(producto);

            if (cantidad >= 3) {

                int productosRegalo = cantidad / 3;

                this.importeTotal -= productosRegalo * producto.getPrecio();

            }

        }

    }

    /**
     * Método que aplica un descuento del 10% al importe total,
     * recoge el valor del importe total * 0.1, y después lo resta
     * al importe total
     */
    public void aplicarPromo10() {

        double descuento = this.importeTotal * 0.10;

        this.importeTotal -= descuento;

    }

    /**
     * GETTER Y SETTER BÁSICOS
     * @return
     */
    public TreeMap<Producto, Integer> getProductos() {
        return productos;
    }

    public void setProductos(TreeMap<Producto, Integer> productos) {
        this.productos = productos;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }


}

````

- ENUM **Producto.java**
> [Link al archivo](https://github.com/daidarzzz/Repositorio1DAM/blob/main/ejercicios_DAM/src/main/java/org/example/TEMA7/MercaDam/Producto.java)

````
package org.example.TEMA7.MercaDam;

/**
 * ENUM que sirve para controlar los productos disponibles y sus precios en MERCADAM
 */
public enum Producto {

    MANZANAS(2.30),PAN(1.0),ARROZ(3.50),POLLO(4.50),LECHE(1.30),ACEITE(8.30),HUEVOS(3.30),TOMATES(4.0),PASTA(0.89);

    private final double precio;

    Producto(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}

````

- Clase **OrdenadoPorUnidades.java**
> [Link al archivo](https://github.com/daidarzzz/Repositorio1DAM/blob/main/ejercicios_DAM/src/main/java/org/example/TEMA7/MercaDam/OrdenadoPorUnidades.java)

````
package org.example.TEMA7.MercaDam;

import java.util.Comparator;
import java.util.Map;

public class OrdenadoPorUnidades implements Comparator<Map.Entry<Producto, Integer>> {
    @Override
    public int compare(Map.Entry<Producto, Integer> o1, Map.Entry<Producto, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}

````

### 3. Programa principal

- Clase **AppZonaClientes.java**
> [Link al archivo](https://github.com/daidarzzz/Repositorio1DAM/blob/main/ejercicios_DAM/src/main/java/org/example/TEMA7/MercaDam/AppZonaClientes.java)

````
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
````


### 4. Entrega
- [X] Código fuente en GitHub: [link](../MercaDam/)
- [X] Documentación
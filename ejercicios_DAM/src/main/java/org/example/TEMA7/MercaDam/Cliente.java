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

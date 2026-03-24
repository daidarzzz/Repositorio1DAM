package org.example.TEMA7.MercaDam;

import java.util.Objects;

public class Cliente {

    private String usuario;
    private String contrasenya;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    public Cliente(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.pedido = null;
        this.promociones = false;
        this.direccion = "Calle falsa, 123";
    }

    public void crearPedido() {
        pedido = new Pedido();
    }

    public void insertarProducto(Producto producto){

        int cantidad = 0;
        if (!this.pedido.productos.containsKey(producto)) this.pedido.productos.put(producto, 1);
        else {
            cantidad = pedido.productos.get(producto);

            pedido.productos.put(producto, cantidad + 1);
        }

    }

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(usuario, cliente.usuario) && Objects.equals(contrasenya, cliente.contrasenya);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, contrasenya);
    }
}

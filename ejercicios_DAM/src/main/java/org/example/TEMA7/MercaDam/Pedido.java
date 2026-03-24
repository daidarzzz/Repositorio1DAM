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

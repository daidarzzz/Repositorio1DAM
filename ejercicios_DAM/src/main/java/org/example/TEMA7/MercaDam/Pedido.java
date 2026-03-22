package org.example.TEMA7.MercaDam;

import java.util.HashMap;

public class Pedido {


    private HashMap<Producto, Integer> productos;
    private double importeTotal;

    public Pedido() {
        this.productos = new HashMap<>();
        this.importeTotal = 0;
    }

    public Pedido(HashMap<Producto, Integer> pedido, double importeTotal) {
        this.productos = pedido;
        this.importeTotal = importeTotal;
    }

    public void actualizarImporteTotal(double importeTotal) {
        this.importeTotal += importeTotal;
    }

    public void aplicarPromo3x2() {

    }

    public void aplicarPromo10() {
        
    }

    public void insertarProducto(Producto producto) {

        int cantidad = 0;
        if (!productos.containsKey(producto)) this.productos.put(producto, 1);
        else {
            cantidad = productos.get(producto);

            productos.put(producto, cantidad + 1);
        }

    }

    public HashMap<Producto, Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<Producto, Integer> productos) {
        this.productos = productos;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }


}

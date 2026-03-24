package org.example.TEMA7.MercaDam;

import java.util.HashMap;
import java.util.TreeMap;

public class Pedido {


    protected TreeMap<Producto, Integer> productos;
    private double importeTotal;

    public Pedido() {
        this.productos = new TreeMap<>();
        this.importeTotal = 0;
    }

    public Pedido(TreeMap<Producto, Integer> pedido, double importeTotal) {
        this.productos = pedido;
        this.importeTotal = importeTotal;
    }

    public void actualizarImporteTotal(double importeTotal) {
        this.importeTotal += importeTotal;
    }

    public void aplicarPromo3x2() {

        for (Producto p : productos.keySet()) {

        }

    }

    public void aplicarPromo10() {
        
    }


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

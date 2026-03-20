package org.example.TEMA7.MercaDam;

import java.util.HashMap;

public class Pedido {

    private HashMap<Producto, Integer> pedido;
    private double importeTotal;

    public Pedido() {

    }

    public Pedido(HashMap<Producto, Integer> pedido, double importeTotal) {
        this.pedido = pedido;
        this.importeTotal = importeTotal;
    }

    public void actualizarImporteTotal(double importeTotal) {

    }

    public void aplicarPromo3x2() {

    }

    public void aplicarPromo10() {
        
    }

    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public void setPedido(HashMap<Producto, Integer> pedido) {
        this.pedido = pedido;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }


}

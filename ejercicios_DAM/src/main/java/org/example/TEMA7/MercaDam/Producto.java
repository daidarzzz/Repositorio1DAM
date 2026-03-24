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

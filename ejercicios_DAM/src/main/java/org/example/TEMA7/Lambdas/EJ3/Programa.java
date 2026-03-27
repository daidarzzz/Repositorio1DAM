package org.example.TEMA7.Lambdas.EJ3;

import java.util.ArrayList;
import java.util.List;

public class Programa {

    static void main(String[] args) {

        List<Producto> productoList = new ArrayList<>();
        Producto producto1 = new Producto("Movil 1", 100, "Kiwi");
        Producto producto2 = new Producto("PS5", 345, "Kiwi");
        Producto producto3 = new Producto("Coche", 7000, "coche rayado");

        productoList.add(producto1);
        productoList.add(producto2);
        productoList.add(producto3);

        FiltroProducto filtroProducto = (producto) -> {
            if (producto.getCategoria().equalsIgnoreCase("kiwi") && producto.getPrecio() > 150) return true;
            return false;
        };

        productoList = productoList.stream().filter(filtroProducto::filtrar).toList();

        System.out.println("Productos filtrados (Categoría KIWI y precio mayor que 150):");
        for (Producto producto : productoList) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }

    }


}

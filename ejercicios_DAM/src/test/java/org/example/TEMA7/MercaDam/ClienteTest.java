package org.example.TEMA7.MercaDam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    void setUp() {
        // Inicializamos el cliente antes de cada test
        cliente = new Cliente("usuario1", "12345678");
    }
    @Test
    void crearPedido() {

        //Comprobamos que el pedido es null antes de crearlo
        assertNull(cliente.getPedido());

        cliente.crearPedido();

        //Comprobamos que ahora el pedido no sea nulo y se ha creado correctamenteç
        assertNotNull(cliente.getPedido());
        //Comprobamos que el importe empiece en 0
        assertEquals(0,cliente.getPedido().getImporteTotal());
    }

    @Test
    void insertarProducto() {
        cliente.crearPedido();

        //Insertar un producto (comprobar que haya uno de ese tipo)
        cliente.insertarProducto(Producto.PAN);
        assertEquals(1, cliente.getPedido().getProductos().get(Producto.PAN));

        //Insertar el mismo producto, comprobar que ahora haya 2 panes
        cliente.insertarProducto(Producto.PAN);
        assertEquals(2, cliente.getPedido().getProductos().get(Producto.PAN));

    }


    @Test
    void insertarProductoExcepcion() {

        assertThrows(IllegalArgumentException.class, () -> {
            Producto.valueOf("HAMBURGUESA");
        });

    }
}
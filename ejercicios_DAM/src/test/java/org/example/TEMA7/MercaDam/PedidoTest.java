package org.example.TEMA7.MercaDam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    private Pedido pedido;

    @BeforeEach
    void setUp() {
        // Inicializamos un pedido vacío antes de cada test
        pedido = new Pedido();
    }

    @Test
    void actualizarImporteTotal() {
        //Test que comprueba que el importe es igual a la suma de los dos productos utilizados
        pedido.actualizarImporteTotal(Producto.TOMATES.getPrecio());
        pedido.actualizarImporteTotal(Producto.HUEVOS.getPrecio());

        double importeEsperado = Producto.TOMATES.getPrecio() + Producto.HUEVOS.getPrecio();

        assertEquals(importeEsperado, pedido.getImporteTotal());

    }

    @Test
    void aplicarPromo3x2() {
        //Test en el que añadimos al importe total 3 tomates
        pedido.getProductos().put(Producto.TOMATES, 3);
        pedido.setImporteTotal(Producto.TOMATES.getPrecio() * 3);

        pedido.aplicarPromo3x2();
        //Aplicando el descuento, el precio del importe debería de ser el de 2 tomates (1 de regalo) comprobamos que así sea.
        double nuevoImporte = Producto.TOMATES.getPrecio() * 2;

        assertEquals(nuevoImporte, pedido.getImporteTotal());



    }

    @Test
    void aplicarPromo10() {
        //Hacemos que el importe sea 100 para hacer un cálculo sencillo
        pedido.setImporteTotal(100);
        pedido.aplicarPromo10();
        assertEquals(90.0, pedido.getImporteTotal());

    }

    @Test
    void testPromocionesCombinadas() {
        // insertamos 3 unidades de Arroz
        pedido.getProductos().put(Producto.ARROZ, 3);
        pedido.setImporteTotal(Producto.ARROZ.getPrecio() * 3);

        //Aplicamos el 3x2 (ahora pagaremos por 2 arroces)
        pedido.aplicarPromo3x2();

        //Aplicamos un 10% de descuento (2 arroces multiplicado por 0.90)
        pedido.aplicarPromo10();

        //Creamos una variable con el valor esperado
        double importeEsperado = (Producto.ARROZ.getPrecio() * 2) * 0.9;

        assertEquals(importeEsperado, pedido.getImporteTotal());
    }
}
package org.example.TEMA7.MercaDam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MercaDamTest {
    private MercaDam mercaDam;

    @BeforeEach
    void setUp() {
        // Inicializamos el supermercado antes de cada test
        mercaDam = new MercaDam();
    }
    @Test
    void generarClientes() {
        int clientes = 10;
        mercaDam.generarClientes(clientes);
        //Introducimos 10 clientes a MercaDam y comprobamos que se han creado correctamente
        assertEquals(clientes, mercaDam.getClientes().size());

    }

    @Test
    void testGetClientesEsInmutable() {
        mercaDam.generarClientes(5);

        // Intentar añadir un cliente a una lista inmodificable, debería de lanzar una excepción
        assertThrows(UnsupportedOperationException.class, () -> {
            mercaDam.getClientes().add(new Cliente("david", "12345"));
        });
    }

}
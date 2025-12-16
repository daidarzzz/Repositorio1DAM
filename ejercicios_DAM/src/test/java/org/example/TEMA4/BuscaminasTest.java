package org.example.TEMA4;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class BuscaminasTest {

    @Test
    void crearMatrizVisible() {
        Buscaminas.numFilas = 3;
        Buscaminas.numColumnas = 4;
        String[][] matriz = Buscaminas.crearMatrizVisible();

        assertEquals(3, matriz.length);
        assertEquals(4, matriz[0].length);

        for (String[] fila : matriz) {
            for (String celda : fila) {
                assertEquals("X", celda);
            }
        }
    }

    @Test
    void comprobarGameOver() {
        Buscaminas.numFilas = 2;
        Buscaminas.numColumnas = 2;
        Buscaminas.matrizReal = new String[][]{
                {"*", "-"},
                {"-", "-"}
        };

        //Celda con bomba
        String[] celda = {"1", "1"};
        assertFalse(Buscaminas.comprobarGameOver(celda));

        //Celda sin bomba
        String[] celda2 = {"1", "2"};
        assertTrue(Buscaminas.comprobarGameOver(celda2));
    }
}

package org.example.TEMA7.MercaDam;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Clase que representa al supermercado, administra los clientes qye tiene el super
 */
public class MercaDam {
    static Random aleatorio = new Random();
    private Set<Cliente> clientes;

    /**
     * Constructor básico, que inicializa la lista de clientes
     */
    public MercaDam() {
        this.clientes = new HashSet<>();
    }

    /**
     *
     * Este método utiliza la clase Random para elegir 8 carácteres aleatorios para el usuario y la contraseña
     * En caso de que el random cree dos clientes iguales, volverá a crear al último cliente hasta que no haya ningún duplicado
     * @param cantidad la cantidad de clientes que queremos generar
     */
    public void generarClientes(int cantidad) {
        String[] caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".split("");

        for (int i = 0; i < cantidad; i++) {
            String usuario = "";
            String password = "";
            for (int j = 0; j < 8; j++) {
                usuario += caracteres[aleatorio.nextInt(0, caracteres.length)];
                password += caracteres[aleatorio.nextInt(0, caracteres.length)];
            }

            Cliente cliente = new Cliente(usuario, password);
            if (clientes.contains(cliente)) {
                i--;
                continue;
            } else {
                clientes.add(cliente);
            }
        }

    }

    /**
     * Método que devuelve un Set de clientes que no puede ser modificado
     * @return
     */
    Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }

}

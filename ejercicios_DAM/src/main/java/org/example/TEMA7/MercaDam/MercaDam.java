package org.example.TEMA7.MercaDam;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MercaDam {
    static Random aleatorio = new Random();
    private Set<Cliente> clientes;

    public MercaDam() {
        this.clientes = new HashSet<>();
    }


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

    Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }

}

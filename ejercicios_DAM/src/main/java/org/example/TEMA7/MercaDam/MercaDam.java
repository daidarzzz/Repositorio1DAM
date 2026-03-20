package org.example.TEMA7.MercaDam;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MercaDam {

    private static Set<Cliente> clientes = new HashSet<>();

    public MercaDam() {

    }

    public


    Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }

}

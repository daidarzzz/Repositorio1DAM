package org.example.TEMA7.MercaDam;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MercaDaw {

    private static Set<Cliente> clientes = new HashSet<>();

    public MercaDaw() {

    }

    public


    Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }

}

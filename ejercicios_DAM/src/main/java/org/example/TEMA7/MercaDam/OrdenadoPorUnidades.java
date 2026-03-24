package org.example.TEMA7.MercaDam;

import java.util.Comparator;
import java.util.Map;

public class OrdenadoPorUnidades implements Comparator<Map.Entry<Producto, Integer>> {
    @Override
    public int compare(Map.Entry<Producto, Integer> o1, Map.Entry<Producto, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}

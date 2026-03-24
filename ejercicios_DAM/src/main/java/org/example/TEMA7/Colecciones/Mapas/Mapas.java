package org.example.TEMA7.Colecciones.Mapas;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    static void main(String[] args) {
        HashMap<String,String> consejales = new HashMap<>();
        consejales.put("Enrique Pastor","Juventud y tiempo libre");
        consejales.put("Monica Gil","Familia, fiestas y jardines");

        System.out.println(consejales.keySet());
        System.out.println(consejales.values());
        System.out.println(consejales.get("Enrique Pastor"));

        for (Map.Entry<String,String> mapita: consejales.entrySet()){
            System.out.println("El consejal " + mapita.getKey() + " tiene el cargo " + mapita.getValue());
        }


    }
}

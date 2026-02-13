package org.example.TEMA6.PlataformaStreaming;

import java.util.ArrayList;

public class PlataformaStreaming {

    static void main(String[] args) {

        ArrayList<Suscripcion> listaPlanes = new ArrayList<>();

        PlanGratis gratis = new PlanGratis("Gratis", 0);
        listaPlanes.add(gratis);
        PlanBasico basico = new PlanBasico("Basico", 4.99);
        listaPlanes.add(basico);
        PlanPremium premium = new PlanPremium("Premium", 9.99);
        listaPlanes.add(premium);
        PlanFamiliar familiar = new PlanFamiliar("Familiar", 999.99);
        listaPlanes.add(familiar);

        for (Suscripcion plan : listaPlanes) {
            plan.mostrarInfo();
            plan.obtenerBeneficios();
            plan.obtenerPeriodoPrueba();
        }



    }


}

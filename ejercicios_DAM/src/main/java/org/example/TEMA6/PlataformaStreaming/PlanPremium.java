package org.example.TEMA6.PlataformaStreaming;

public class PlanPremium extends Suscripcion{

    public PlanPremium(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {

        System.out.println("Acceso a todo el contenido en alta definición y descargas offline.");
        System.out.println("Acceso para varios perfiles simultáneamente en alta definición");

    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: 14 días de prueba gratuita");
    }
}

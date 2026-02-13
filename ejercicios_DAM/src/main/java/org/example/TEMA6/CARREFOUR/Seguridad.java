package org.example.TEMA6.CARREFOUR;

import java.util.ArrayList;

public class Seguridad extends Persona{

    private String empresa;
    private ArrayList<String> armas;

    public Seguridad(int codigo, String nombre, double sueldo, String empresa, String... arma) {
        super(codigo, nombre, sueldo);
        this.empresa = empresa;
        armas = new ArrayList<>();
        setArmas(arma);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<String> getArmas() {
        return armas;
    }

    public void setArmas(String[] armas) {

        for (String arma : armas) {

            this.armas.add(arma);

        }

    }

    @Override
    public void mostrarInfo() {

        super.mostrarInfo();
        System.out.println("El segurata pertenece a la empresa " + empresa);
        System.out.println("Armas del segurata: ");
        for (String arma : armas) {
            System.out.println("|==| " + arma + " |==|");
        }

    }

    @Override
    public void trabajar() {
        System.out.println("Vigilar a sospechosos");
    }


    @Override
    public String toString() {
        return "Seguridad{" +
                "empresa='" + empresa + '\'' +
                ", armas=" + armas +
                '}';
    }
}

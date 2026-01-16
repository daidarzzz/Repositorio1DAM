package org.example.TEMA5;

public class Bocadillo {

    private String nombre;
    private String pan;
    private String ingrediente;
    private String salsa;
    private double precio;

    public Bocadillo (String nombre, String pan, String ingrediente, String salsa, double precio) {

        this.nombre = nombre;
        this.pan = pan;
        this.ingrediente = ingrediente;
        this.salsa = salsa;
        this.precio = precio;

    }


    public Bocadillo() {

    }


    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getPan () {
        return nombre;
    }

    public void setPan (String pan) {
        this.pan = pan;
    }

    public String getIngrediente () {
        return ingrediente;
    }

    public void setIngrediente (String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getSalsa () {
        return ingrediente;
    }

    public void setSalsa (String salsa) {
        this.salsa = salsa;
    }

    public double getPrecio () {
        return precio;
    }

    public void setPrecio (double precio) {
        this.precio = precio;
    }


    public void imprimirInfoBocata() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de pan: " + pan);
        System.out.println("Ingrediente: " + ingrediente);
        System.out.println("Salsa: " + salsa);
        System.out.println("Precio: " + precio);

    }

}

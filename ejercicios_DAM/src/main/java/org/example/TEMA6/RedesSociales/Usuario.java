package org.example.TEMA6.RedesSociales;

public class Usuario {

    private String nombre;
    private int edad;
    private String nombreUsuario;
    private int seguidores;

    public Usuario(String nombre, int edad, String nombreUsuario, int seguidores) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreUsuario = nombreUsuario;
        this.seguidores = seguidores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public void mostrarInfo() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Username: " + nombreUsuario);
        System.out.println("Edad: " + edad);
        System.out.println("Seguidores: " + seguidores);

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", seguidores=" + seguidores +
                '}';
    }
}

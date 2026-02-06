package org.example.TEMA5.PRACTICA1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Empleado {

    //Array que contiene todos los cargos que puedes tener
    static String[] cargosDisponibles = {"director", "tecnico", "presentador", "colaborador"};
    static int numEmpleados = 0; //Contador global que indica el número de empleados (se usará para calcular la ID)

    //Variables de la clase
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    //Constructor -> Incluye todo menos la ID
    public Empleado(String nombre, String cargo, Empleado director) {

        id = generarID(); //Para generar la ID llamamos al método generarID
        //Asignamos a las variables de la clase los parámetros introducidos.
        this.nombre = nombre;
        this.cargo = validarCargo(cargo); //Llamada al método validarCargo para asignarlo correctamente
        this.director = director;

    }

    //Constructor 2 -> Lo mismo pero no le asignamos director
    public Empleado(String nombre, String cargo) {

        this(nombre, cargo, null);

    }


    //Método que genera una ID -> Pone EP y seguidamente pone el número de empleado que le corresponde. Devuelve la ID
    public String generarID() {

        return "EP" + (++numEmpleados);

    }


    //Método que devuelve un String (el cargo)
    public String validarCargo(String cargo) {

        //En caso de que el cargo que hayas introducido esté contemplado
        if (Arrays.asList(cargosDisponibles).contains(cargo.toLowerCase())) {

            return cargo.toLowerCase(); //Te devolverá el cargo, por lo que el cargo está bien

        } else {
            return "pte"; //Si no está contemplado, te pondrá el cargo por defecto (pte)
        }

    }

    public String getId() {
        return id;
    }

    //No podemos cambiar la id (no hay setID)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    //En el setCargo llamamos a la función de validarCargo para cambiar correctamente
    public void setCargo(String cargo) {
        this.cargo = validarCargo(cargo);
    }

    public Empleado getDirector() {
        return director;
    }

    //No hay set director, este se pone automáticamente.


    //ToString básico
    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }
}

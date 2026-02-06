package org.example.TEMA5.PRACTICA1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

//Creamos la clase programa
public class Programa {

    //Creamos sus atributos como privados
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    //Estos dos arraylist deberán de ser inicializados después, en el constructor
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director; //Metemos un objeto "Empleado" como atributo


    //Constructor -> Recibe el nombre, la cadena a la que pertenecerá y el director (Que se crea automáticamente)
    public Programa(String nombre, Cadena cadena, String director) {

        //Asignamos los valores a las variables correspondientes
        this.nombre = nombre;
        this.cadena = cadena;
        temporadas = 0; //El programa siempre empezará teniendo 0 temporadas
        //Inicialziamos los ArrayList
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        this.director = crearDirector(director); //Para crear un director, usaremos una función

        cadena.añadirPrograma(this); //Añadimos a la cadena que nos han pasado, nuestro programa. (Llamada a la función añadir programa)

    }


    //Método insertarEmpleado, con esto crearemos un empleado a partir de los parámetros nombre y cargo.
    public void insertarEmpleado(String nombre, String cargo) {
            //Creamos un nuevo empleado con los parámetros asignados, y le asignamos como director el director que tiene el programa.
            Empleado empleado = new Empleado(nombre, cargo.toLowerCase(), this.getDirector());

            listaEmpleados.add(empleado); //Lo añadimos a la lista de empleados


    }

    //Método para crear un director, devuelve el director creado.
    public Empleado crearDirector(String director) {
        //Creamos un director con los parámetros que recibimos, y ponemos por defecto que el director es null (porque el no tiene ningún director delante suya)
        Empleado direc = new Empleado(director, "director", null);
        listaEmpleados.add(direc); //Añadimos el director a la lista de empleados
        return direc; //Devovemos el director creado

    }

    //Método que se encarga de crear un invitado para el programa correspondiente, recibe el nombre, la profesión y la temporada en la que aparece
    public void insertarInvitado(String nombre, String profesion, int temporada) {
        //Creamos al invitado con los parámetros recibidos.
        Invitado invitado = new Invitado(nombre, profesion, temporada);

        listaInvitados.add(invitado); //Lo añadimos a la lista de invitados

        //En caso de que la temporada en la que salga sea mayor que "temporadas", significa de que hay nuevas temporadas, por lo que actualizamos la variable.
        if (temporada > this.temporadas) this.temporadas = temporada;

    }


    //método que sirve para que un programa cambie de cadena
    public void cambiarCadena(Cadena cadena) {

        //Borramos nuestro programa de la cadena anterior
        this.cadena.getListaProgramas().remove(this);

        //Le asignamos a nuestro programa su nueva cadena
        this.cadena = cadena;

        //Ahora añadimos a la lista de programas de la nueva cadena, el programa actual
        cadena.getListaProgramas().add(this);



    }

    //Método que te muestra cuantos invitados hubo en una temporada del programa, recibe la temporada
    public void invitadosTemporada(int temporada) {
        //Inicializamos un contador de cuantos invitados hubo
        int contadorInvitados = 0;
        //Creamos una lista de invitados, debido a que, quiero que solo cuente para el contador invitados DISTINTOS, no quiero que una persona aparezca dos veces.
        ArrayList<String> invitados = new ArrayList<>();

        System.out.println("INVITADOS EN LA TEMPORADA " + temporada + ":");
        //Bucle que recorre toda la lista de invitados
        for (int i = 0; i < listaInvitados.size(); i++) {

            //Creamos un invitado actual
            Invitado invitadoActual = listaInvitados.get(i);

            //En caso de que la temporada en la que sale el invitado actual coincida con la temporada solicitada Y el invitado no esté en la lista de invitados aún . . .
            if (invitadoActual.getTemporada() == temporada && !invitados.contains(invitadoActual.getNombre())) {
                contadorInvitados++; //se suma el contador
                //Mostramos al invitado
                System.out.println("[" + contadorInvitados + "] - " + invitadoActual.getNombre() + " (" + invitadoActual.getProfesion() + ")");
                //Lo añadimos a la lista provisional.
                invitados.add(invitadoActual.getNombre());
            }

        }

    }

    //Método que te devuelve las veces que el invitado ha acudido al programa.
    public int vecesInvitado(String invitado) {


        int contadorVecesInvitado = 0;

        //recorremos la lista de invitados
        for (int i = 0; i < listaInvitados.size(); i++) {

            //Si el nombre del invitado actual (en la lista) coincide con el invitado que buscamos ...
            if (listaInvitados.get(i).getNombre().equalsIgnoreCase((invitado.toLowerCase()))) {
                contadorVecesInvitado++; //Se sumará el contador en uno
            }


        }

        return contadorVecesInvitado; //Devolvemos el contador

    }


    //Método que te muestra cada vez que un invitado ha acudido, hacemos uso del método anterior.
    public void rastrearInvitado(String nombre) {

        //Contador que solo sirve para hacerlo más bonito el print
        int contador = 0;
        int vecesInvitado = vecesInvitado(nombre); //Llamamos al método anterior para saber cuántas veces ha acudido al programa
        System.out.println("El invitado " + nombre + " ha acudido " + vecesInvitado + " veces al programa:");

        //Bucle que recorre toda la lista de invitados
        for (int i = 0; i < listaInvitados.size(); i++) {
            //Si el nombre del invitado actual [listaInvitados.get(i)] es el mismo que el nombre que recibimos como parámetro
            if (listaInvitados.get(i).getNombre().equalsIgnoreCase(nombre)) {
                //Creamos la variable invitado (que es el invitado actual)
                Invitado invitado = listaInvitados.get(i);
                contador++;//Aumentamos el contador en uno
                //Mostramos la aparición del invitado, con la temporada y la fecha
                System.out.println("["+  contador + "] " + " Temporada: " + invitado.getTemporada() + ", Fecha: " + invitado.getFecha_visita());

            }

        }

    }


    //Método buscar invitado, devuelve true si el invitado ha acudido al programa correspondiente.
    public boolean buscarInvitado(String nombre, Programa programa) {


        //Recorremos la lista de invitados del programa que hemos introducido como parámetro
        for (int i = 0; i < programa.listaInvitados.size(); i++) {

            //En el momento en que el invitado que buscamos salga en la lista de invitados de ese programa . . .
            if (programa.listaInvitados.get(i).getNombre().equalsIgnoreCase(nombre)) {

                return true; //Nos devuelve true, indicando que si que ha salido en el programa

            }

        }

        return false; //Si terminamos todo el bucle, significa que nunca participó en el programa, devolviendo false

    }


    //Método que comprueba a qué programa fue antes un invitado, recibe el programa con el que quiere comparar como parámetro
    public void invitadoAntes(String nombre, Programa segundoPrograma) {

        //Si el invitado nunca ha estado en este programa, se acaba el método, avisandote de ello
        if (!buscarInvitado(nombre, this)) {
            System.out.println(nombre + " nunca ha participado en el programa " + this.nombre);
            return;
        }

        //Si el invitado nunca ha estado en el segundo programa, se acaba el método, avisandote de ello
        if (!buscarInvitado(nombre, segundoPrograma)) {
            System.out.println(nombre + " nunca ha participado en el programa " + segundoPrograma.getNombre());
            return;
        }

        //Inicializamos dos LocalDate como null, luego le asignaremos su valor
        LocalDate fechaPrimerPrograma = null;
        LocalDate fechaSegundoPrograma = null;


        //Recorremos la lista de invitados del programa actual
        for (int i = 0; i < this.listaInvitados.size(); i++) {

            //Creamos la variable invitadoActual
            Invitado invitadoActual = this.listaInvitados.get(i);

            //Si el nombre del invitado actual (el de la lista de invitados) coincide con el nombre del invitado que buscamos  . . .
            if (invitadoActual.getNombre().equalsIgnoreCase(nombre)) {

                //Si fecha es null O la fecha del invitadoActual va antes de fechaPrimerPrograma...
                if ( fechaPrimerPrograma == null || invitadoActual.getFecha_visita().isBefore(fechaPrimerPrograma)) {
                    fechaPrimerPrograma = invitadoActual.getFecha_visita(); //fechaPrimerPrograma ahora tendrá de valor la fecha del invitadoActual
                    //Con esto, evitamos el error de NullPointer y saldremos del bucle con la fecha más pequeña (la primera vez que fue al programa)
                }
            }

        }

        //realizamos el mismo proceso, pero esta vez para el segundo programa, y la fecha se asignará a fechaSegundoPrograma.
        for (int i = 0; i < segundoPrograma.listaInvitados.size(); i++) {

            Invitado invitadoActual = segundoPrograma.listaInvitados.get(i);

            if (invitadoActual.getNombre().equalsIgnoreCase(nombre)) {
                if (fechaSegundoPrograma == null || invitadoActual.getFecha_visita().isBefore(fechaSegundoPrograma)) {
                    fechaSegundoPrograma = invitadoActual.getFecha_visita();
                }
            }

        }

        //Mostramos la fecha que fue primera
        //Fecha 1 fue antes
        if (fechaPrimerPrograma.isBefore(fechaSegundoPrograma)) System.out.println(nombre + " fue primero a " + this.nombre + " (" + fechaPrimerPrograma + ") que a " + segundoPrograma.getNombre() + " (" + fechaSegundoPrograma + ")");
        //Fecha 2 fue antes
        else if (fechaPrimerPrograma.isAfter(fechaSegundoPrograma)) System.out.println(nombre + " fue primero a " + segundoPrograma.getNombre() + " (" + fechaSegundoPrograma + ") que a " + this.nombre + " (" + fechaPrimerPrograma + ")");
        //Ambas fechas coinciden
        else System.out.println("Fue el mismo día a ambos programas (" +fechaPrimerPrograma + ")");

    }


    //GETTERS Y SETTERS . . .
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }


    //Considero que SI puedes asignar el número de temporadas desde el set.
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    //No hay set listaempleados, tenemos un método dedicado a ello.

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }


    //Tampoco tenemos set listainvitados por la misma razón

    public Empleado getDirector() {
        return director;
    }

    //No hay set director, se asigna solo, siempre.



    //ToString básico

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena.getNombre() +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director.getNombre() +
                '}';
    }
}

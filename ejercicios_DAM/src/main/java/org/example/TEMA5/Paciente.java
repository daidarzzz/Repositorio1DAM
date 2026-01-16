package org.example.TEMA5;

import java.util.Random;

public class Paciente {

    static Random aleatorio = new Random();
    private static final char DEF_GENERO = 'X';
    private static final int INFRAPESO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;



     private String nombre;
     private int edad;
     private String dni;
     private char sexo;
     private double peso;
     private int altura;


    public Paciente(String nombre, int edad, char sexo, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        dni = generarDNI();
        this.peso = peso;
        this.altura = altura;
    }

    public Paciente() {
         this(null, 0, DEF_GENERO, 0, 0);
    }



     private String generarDNI () {

        char letraDNI[] = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };

         String dni = "";

         for (int i = 0; i < 8; i++) {
             int num = aleatorio.nextInt(0,10);
             dni = dni + num;
         }
         int resto = Integer.parseInt(dni)%23;
         char letraAsignada = letraDNI[resto];
         dni = dni + letraAsignada;

         return dni;
     }


     public int calcularIMC() {

        double resultado = peso / Math.pow(altura,2);

        if (resultado < 20) {
            return INFRAPESO;
        }
        else if (resultado > 25) {
            return SOBREPESO;
        } else {
            return PESO_IDEAL;
        }

     }

    public void imprimirPaciente() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }


    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

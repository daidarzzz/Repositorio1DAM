package org.example.TEMA7.ReservaPistas;

public abstract class Pista {
    private static int contadorPistas = 1;

    private String tipo;
    private int id;

    public Pista(String tipo) {
        this.tipo = tipo;
        setId();
      }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = contadorPistas++;
    }

    @Override
    public String toString() {
        return "Pista{" +
                "tipo='" + tipo + '\'' +
                ", id=" + id +
                '}';
    }
}

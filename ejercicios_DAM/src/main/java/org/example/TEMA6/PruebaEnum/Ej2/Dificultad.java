package org.example.TEMA6.PruebaEnum.Ej2;

public enum Dificultad {

    FACIL(2), MEDIO(4), DIFICIL(8), EXPERTO(10);

    private final int multiplicador;

    Dificultad(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getMultiplicador() {
        return multiplicador;
    }


}

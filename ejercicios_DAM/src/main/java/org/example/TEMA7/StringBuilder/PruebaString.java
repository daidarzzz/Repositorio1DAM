package org.example.TEMA7.StringBuilder;

public class PruebaString {

    static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("calleu");
        sb.append(" mantecao").append(" joaquin!!").append(" adiós").append(" qué os pasa?"). append("tsepmet");

        sb.insert(14, " de limón");

        sb.replace(25, 32, "Jacobo");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }


}

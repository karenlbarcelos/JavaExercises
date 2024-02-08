package org.Enum;

public class EnumsRunner {

    public static void main(String[] args) {

        // how to create a Enum variable
        // Enums ajuda a restringir o tipo de valores q estao presentes em umconjunto restrito
        Enums season = Enums.SUMMER;

        Enums season1 = Enums.valueOf("WINTER");

        System.out.println(Enums.SPRING.ordinal());  // posicao no qual um valor especifico esta dentro de um enum
    }
}

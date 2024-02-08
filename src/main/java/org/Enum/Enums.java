package org.Enum;

public enum Enums {

    // para armazenar enumno bd usa-se values
    WINTER(1), SPRING(2), SUMMER(3), FALL(4);

    private int value;

    private Enums(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

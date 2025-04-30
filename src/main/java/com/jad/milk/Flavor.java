package com.jad.milk;

public enum Flavor {
    ORIGINAL("Naturel"),
    CHOCOLATE("Chocolat"),
    VANILLA("Vanille");

    private final String frenchName;

    Flavor(String frenchName) {
        this.frenchName = frenchName;
    }
}

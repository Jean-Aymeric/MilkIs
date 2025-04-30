package com.jad.milk;

public enum MilkType {
    COW("Vache"),
    GOAT("Chèvre"),
    SHEEP("Brebis"),
    BUFFALO("Bufflonne"),
    HORSE("Jument"),
    CAMEL("Chamelle");

    private final String frenchName;

    MilkType(String frenchName) {
        this.frenchName = frenchName;
    }
}

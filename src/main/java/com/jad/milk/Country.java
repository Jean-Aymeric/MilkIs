package com.jad.milk;

public enum Country {
    BRAZIL("Brazil"),
    CANADA("Canada"),
    FRANCE("France"),
    GERMANY("Germany"),
    ITALY("Italy"),
    JAPAN("Japan"),
    NETHERLANDS("Netherlands"),
    NEW_ZEALAND("New Zealand"),
    SPAIN("Spain"),
    SWITZERLAND("Switzerland"),
    UNITED_KINGDOM("United Kingdom"),
    UNITED_STATES("United States");

    private final String name;

    Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

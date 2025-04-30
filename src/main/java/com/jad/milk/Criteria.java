package com.jad.milk;

public record Criteria(String key, String value) {
    public Criteria {
        if (key == null || key.isBlank()) {
            throw new IllegalArgumentException("Key cannot be null or blank");
        }
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Value cannot be null or blank");
        }
    }
}

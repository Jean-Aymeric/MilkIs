package com.jad.milk;

public class MilkBottle {
    private final String expirationDate;
    private final int volume;
    private final Country country;
    private final String brand;
    private final MilkType type;
    private final boolean bio;
    private final boolean lactoseFree;
    private final double fatRate;
    private final Flavor flavor;

    public MilkBottle(final String expirationDate, final int volume, final Country country, final String brand,
                      final MilkType type, final boolean bio, final boolean lactoseFree, final double fatRate,
                      final Flavor flavor) {
        this.expirationDate = expirationDate;
        this.volume = volume;
        this.country = country;
        this.brand = brand;
        this.type = type;
        this.bio = bio;
        this.lactoseFree = lactoseFree;
        this.fatRate = fatRate;
        this.flavor = flavor;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public int getVolume() {
        return this.volume;
    }

    public Country getCountry() {
        return this.country;
    }

    public String getBrand() {
        return this.brand;
    }

    public MilkType getType() {
        return this.type;
    }

    public boolean isBio() {
        return this.bio;
    }

    public boolean isLactoseFree() {
        return this.lactoseFree;
    }

    public double getFatRate() {
        return this.fatRate;
    }

    public Flavor getFlavor() {
        return this.flavor;
    }

    public boolean is(final String date, final String s, final String france, final String s1) {
        return false;
    }
}

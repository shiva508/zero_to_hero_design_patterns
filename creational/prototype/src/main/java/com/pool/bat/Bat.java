package com.pool.bat;

import java.util.Objects;

public abstract class Bat {
    private double height;
    private double width;
    private double weight;
    private BrandAmbassador brandAmbassador;

    public Bat(double height, double width, double weight) {
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BrandAmbassador getBrandAmbassador() {
        return brandAmbassador;
    }

    public void setBrandAmbassador(BrandAmbassador brandAmbassador) {
        this.brandAmbassador = brandAmbassador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bat bat = (Bat) o;
        return Double.compare(bat.height, height) == 0 && Double.compare(bat.width, width) == 0 && Double.compare(bat.weight, weight) == 0 && Objects.equals(brandAmbassador, bat.brandAmbassador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, weight, brandAmbassador);
    }

    @Override
    public String toString() {
        return "Bat{" +
                "height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                ", brandAmbassador=" + brandAmbassador +
                '}';
    }

    public abstract Bat createCopy();
}

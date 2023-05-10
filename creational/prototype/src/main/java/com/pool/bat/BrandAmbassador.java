package com.pool.bat;

import java.util.Objects;

public class BrandAmbassador {
    private String celebrityName;

    public BrandAmbassador(String celebrityName) {
        this.celebrityName = celebrityName;
    }

    public String getCelebrityName() {
        return celebrityName;
    }

    public void setCelebrityName(String celebrityName) {
        this.celebrityName = celebrityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrandAmbassador that = (BrandAmbassador) o;
        return Objects.equals(celebrityName, that.celebrityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(celebrityName);
    }

    @Override
    public String toString() {
        return "BrandAmbassador{" +
                "celebrityName='" + celebrityName + '\'' +
                '}';
    }
}

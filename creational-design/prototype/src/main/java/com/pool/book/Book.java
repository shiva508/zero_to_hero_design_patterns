package com.pool.book;

import java.util.Objects;

public abstract class Book implements Cloneable {
    private String name;
    private String autherName;
    private double price;
    public Book(String name, String autherName, double price) {
        this.name = name;
        this.autherName = autherName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutherName() {
        return autherName;
    }

    public void setAutherName(String autherName) {
        this.autherName = autherName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && Objects.equals(name, book.name) && Objects.equals(autherName, book.autherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, autherName, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autherName='" + autherName + '\'' +
                ", price=" + price +
                '}';
    }
}

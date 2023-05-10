package com.pool.book;

public class ScinceBook extends Book{

    public ScinceBook(String name, String autherName, double price) {
        super(name, autherName, price);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new ScinceBook(this.getName(), this.getAutherName(), this.getPrice());
    }
}

package com.pool;

public class Book {
    private String name;
    private String autherName;
    private String ganar;
    private int numberOfChapters;
    private int getNumberOfPages;
    private double price;
    private String publisher;

    public Book() {
    }

    public Book(BookBuilder bookBuilder) {
        this.name=bookBuilder.name;
        this.autherName=bookBuilder.autherName;
        this.ganar=bookBuilder.ganee;
        this.numberOfChapters=bookBuilder.numberOfChapters;
        this.getNumberOfPages=bookBuilder.getNumberOfPages;
        this.publisher=bookBuilder.publisher;
        this.price=bookBuilder.price;
    }
    public String getName() {
        return name;
    }

    public String getAutherName() {
        return autherName;
    }

    public String getGanar() {
        return ganar;
    }

    public int getNumberOfChapters() {
        return numberOfChapters;
    }

    public int getGetNumberOfPages() {
        return getNumberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    public static class BookBuilder{

        private String name;
        private String autherName;
        private String ganee;
        private int numberOfChapters;
        private int getNumberOfPages;
        private double price;
        private String publisher;

        public BookBuilder() {
        }

        public BookBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BookBuilder setAutherName(String autherName) {
            this.autherName = autherName;
            return this;
        }

        public BookBuilder setGanee(String ganee) {
            this.ganee = ganee;
            return this;
        }

        public BookBuilder setNumberOfChapters(int numberOfChapters) {
            this.numberOfChapters = numberOfChapters;
            return this;
        }

        public BookBuilder setGetNumberOfPages(int getNumberOfPages) {
            this.getNumberOfPages = getNumberOfPages;
            return this;
        }

        public BookBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public BookBuilder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autherName='" + autherName + '\'' +
                ", ganar='" + ganar + '\'' +
                ", numberOfChapters=" + numberOfChapters +
                ", getNumberOfPages=" + getNumberOfPages +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}

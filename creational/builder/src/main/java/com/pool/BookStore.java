package com.pool;

public class BookStore {
    public static void main(String[] args) {
        Book book= new Book.BookBuilder()
                           .setAutherName("Shiva")
                           .setName("Don't be prisoner")
                            .setGanee("Life")
                            .setPrice(88)
                            .setGetNumberOfPages(88)
                            .setNumberOfChapters(8)
                            .build();
        System.out.println(book);
    }
}

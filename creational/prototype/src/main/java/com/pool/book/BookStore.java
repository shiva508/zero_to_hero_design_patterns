package com.pool.book;

public class BookStore {
    public static void main(String[] args) throws CloneNotSupportedException {
        ScinceBook scinceBook=new ScinceBook("Monk Who Sold Ferrari","Robbin S Sharma",180.00);
        System.out.println(scinceBook);
        System.out.println(scinceBook.hashCode());
        ScinceBook copiedBook = (ScinceBook)scinceBook.clone();
        System.out.println(copiedBook);
        System.out.println(copiedBook.hashCode());

    }
}

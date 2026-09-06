package com.library;

public class Book {

    int bookId;
    String bookName;
    String author;
    int copiesAvailable;

    public Book(int bookId, String bookName, String author, int copiesAvailable) 
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public void showBookDetails() 
    {
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
        System.out.println("Copies : " + copiesAvailable);
    }
}
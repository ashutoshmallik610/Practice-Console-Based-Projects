package com.library;

public class Faculty extends User{

    public Faculty(String id,String name) 
    {
        super(id,name);
    }

    public void borrowBook(Library library,String bookName) 
    {
        library.borrowBook(bookName);
    }

    public void returnBook(Library library,String bookName) 
    {
        library.returnBook(bookName);
    }

}
package com.library;

public class Student extends User {

    public Student(String id,String name) 
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
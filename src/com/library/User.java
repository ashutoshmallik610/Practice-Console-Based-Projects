package com.library;

public class User {

    String userId;
    String userName;

    public User() {

    }

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public void searchBook(Library library, String bookName) {

        Book book = library.searchBook(bookName);

        if(book != null) {
            book.showBookDetails();
        }
        else {
            System.out.println("Book Not Found.");
        }
    }
}
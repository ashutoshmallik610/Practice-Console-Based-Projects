package com.library;

public class Library {

    Book books[] = new Book[10];

    int count = 0;

    public void addBook(Book book) {

        books[count++] = book;

        System.out.println(book.bookName + " Added Successfully.");
    }

    public void removeBook(String bookName) throws InvalidBookException {

        boolean found = false;

        for(int i=0;i<count;i++) {

            if(books[i].bookName.equalsIgnoreCase(bookName)) {

                found = true;

                for(int j=i;j<count-1;j++) {

                    books[j]=books[j+1];
                }

                books[count-1]=null;

                count--;

                System.out.println("Book Removed Successfully.");

                break;
            }
        }

        if(!found) {

            throw new InvalidBookException("Book Not Found.");
        }

    }

    public Book searchBook(String bookName) {

        for(int i=0;i<count;i++) {

            if(books[i].bookName.equalsIgnoreCase(bookName)) {

                return books[i];
            }
        }

        return null;
    }

    public void borrowBook(String bookName) {

        Book book = searchBook(bookName);

        if(book==null) {

            System.out.println("Book Not Found.");
            return;
        }

        if(book.copiesAvailable>0) {

            book.copiesAvailable--;

            System.out.println("Book Borrowed Successfully.");
        }

        else {

            System.out.println("No Copies Available.");
        }

    }

    public void returnBook(String bookName) {

        Book book = searchBook(bookName);

        if(book==null) {

            System.out.println("Book Not Found.");
            return;
        }

        book.copiesAvailable++;

        System.out.println("Book Returned Successfully.");
    }

    public void displayBooks() {

        System.out.println("\n===== Library Books =====");

        for(int i=0;i<count;i++) {

            books[i].showBookDetails();
        }

    }

}
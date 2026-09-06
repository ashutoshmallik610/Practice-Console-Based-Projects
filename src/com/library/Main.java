package com.library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        library.addBook(new Book(101,"Java","James Gosling",5));
        library.addBook(new Book(102,"Python","Guido",3));
        library.addBook(new Book(103,"C Programming","Dennis Ritchie",2));

        Student student = new Student("S101","Ashutosh");

        int choice;

        do {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");

            System.out.println("1.Display Books");
            System.out.println("2.Search Book");
            System.out.println("3.Borrow Book");
            System.out.println("4.Return Book");
            System.out.println("5.Remove Book");
            System.out.println("6.Exit");

            System.out.print("Enter Choice : ");

            choice=sc.nextInt();

            sc.nextLine();

            switch(choice) {

            case 1:

                library.displayBooks();
                break;

            case 2:

                System.out.print("Enter Book Name : ");

                String search=sc.nextLine();

                student.searchBook(library,search);

                break;

            case 3:

                System.out.print("Enter Book Name : ");

                String borrow=sc.nextLine();

                student.borrowBook(library,borrow);

                break;

            case 4:

                System.out.print("Enter Book Name : ");

                String ret=sc.nextLine();

                student.returnBook(library,ret);

                break;

            case 5:

                System.out.print("Enter Book Name : ");

                String remove=sc.nextLine();

                try {

                    library.removeBook(remove);

                } catch (InvalidBookException e) {

                    System.out.println(e.getMessage());
                }

                break;

            case 6:

                System.out.println("Thank You...");
                break;

            default:

                System.out.println("Invalid Choice.");

            }

        }while(choice!=6);

        sc.close();

    }

}
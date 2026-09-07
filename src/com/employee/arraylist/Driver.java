package com.employee.arraylist;


public class Driver {

    public static void main(String[] args) {

        try {

            ProcessEmployees processEmployees =
                    new ProcessEmployees();

            processEmployees.processAndDisplayEmployeeData();

        }
        catch (InvalidEmployeeException e) {

            System.out.println("Invalid Employee : "+ e.getMessage());
        }
    }
}
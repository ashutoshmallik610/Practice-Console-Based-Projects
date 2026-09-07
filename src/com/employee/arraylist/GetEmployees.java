package com.employee.arraylist;

import java.util.ArrayList;

public class GetEmployees {

    public ArrayList<Employee> getEmployee() 
    {
        ArrayList<Employee> employees = new ArrayList<>();

        // Developer
        employees.add(new Developer("EMP101","Ashutosh", "Male", 50000, 24, "Java", "IntelliJ")); //1

        employees.add(new Developer("EMP102","Rahul", "Male", 45000, 25, "Java", "Eclipse")); //2

        employees.add(new Developer("EMP103","Priya", "Female", 55000, 23, "Python", "VS Code")); //3

        // Duplicate of Employee 1
        employees.add(new Developer("EMP101", "Ashutosh", "Male", 50000, 24, "Java", "IntelliJ")); //4

        // Manager
        employees.add(new Manager("EMP104", "Ravi", "Male", 70000, 35, "Development")); //5

        employees.add(new Manager("EMP105", "Sneha", "Female", 75000, 32, "Testing")); //6

        employees.add(new Manager("EMP106", "Amit", "Male", 65000, 38, "HR")); //7

        // Duplicate of Employee 5
        employees.add(new Manager("EMP104", "Ravi", "Male", 70000, 35, "Development")); //8

        // Tester
        employees.add(new Tester("EMP107",  "Neha", "Female", 40000, 26, "Selenium")); //9

        employees.add(new Tester("EMP108", "Vikash", "Male", 42000, 28, "Postman")); //10

        employees.add(new Tester("EMP109", "Pooja", "Female", 43000, 25,"Selenium")); //11

        // Duplicate of Employee 9
        employees.add(new Tester("EMP107", "Neha", "Female", 40000, 26, "Selenium")); //12

        // More employees
        employees.add(new Developer("EMP110", "Karan", "Male", 48000, 27, "C++", "VS Code")); //13

        employees.add(new Manager("EMP111", "Meena", "Female", 68000, 34, "Finance")); //14

        // Duplicate of Employee 10
        employees.add(new Tester("EMP108", "Vikash", "Male", 42000, 28, "Postman")); //15
        
        
        return employees;

    }
}
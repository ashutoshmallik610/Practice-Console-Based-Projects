package com.ranking.employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Driver {

    public static void main(String[] args) {

        EmployeeDetails employeeDetails = new EmployeeDetails();

        List<Employee> employees = employeeDetails.getEmployeeDetails();
        
        ProcessEmployees processEmployees = new ProcessEmployees();

        int choice;

        do {

            System.out.println("\n========== EMPLOYEE RANKING SYSTEM ==========");
            System.out.println("1. Display All Employees");
            System.out.println("2. Remove Duplicate Employees");
            System.out.println("3. Traverse Using Iterator");
            System.out.println("4. Sort By Salary Descending");
            System.out.println("5. Sort By Experience");
            System.out.println("6. Employees Salary Greater Than 60000");
            System.out.println("7. Display Employee Names");
            System.out.println("8. Senior Developer Operation");
            System.out.println("9. Calculate Performance");
            System.out.println("0. Exit");

            System.out.print("Enter your choice : ");

            choice = 0;

            try {
               Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
            }
            catch (Exception e) {
                System.out.println("Invalid choice");
                continue;
            }

            switch(choice) {

                case 1:

                    System.out.println( "\n===== ALL EMPLOYEES =====");

                    for(Employee employee : employees) {

                        System.out.println(employee.displayDetails());
                    }

                    break;

                case 2:

                    System.out.println("\n===== REMOVING DUPLICATES =====");

                    Set<Employee> uniqueEmployees = new HashSet<>(employees);

                    for(Employee employee : uniqueEmployees) {

                        System.out.println(employee.displayDetails());
                    }

                    break;

                case 3:

                    System.out.println("\n===== ITERATOR =====");

                    Iterator<Employee> iterator = employees.iterator();

                    while(iterator.hasNext()) {

                        Employee employee = iterator.next();

                        System.out.println(employee.displayDetails());
                    }

                    break;

                case 4:

                    System.out.println("\n===== SALARY DESCENDING =====");

                    List<Employee> salaryList = new ArrayList<>(employees);

                    salaryList.sort(new CompareBySalary());

                    for(Employee employee : salaryList) {

                        System.out.println(employee.displayDetails());
                    }

                    break;

                case 5:

                    System.out.println("\n===== EXPERIENCE SORTING =====");

                    List<Employee> developers = new ArrayList<>();

                    for(Employee employee : employees) {

                        if(employee instanceof Developer) {

                            developers.add(employee);
                        }
                    }
                    developers.sort(new CompareByExperience());

                    for(Employee employee : developers) {

                        System.out.println(employee.displayDetails());
                    }

                    break;

                case 6:

                    processEmployees.salaryGreaterThan60(employeeDetails);

                    break;

                case 7:

                    processEmployees.employeeNames(employeeDetails);

                    break;

                case 8:

                    processEmployees.seniorDeveloper(employeeDetails);

                    break;

                case 9:

                    System.out.println("\n===== PERFORMANCE =====");

                    for(Employee employee : employees) {

                        employee.calculatePerformance();
                    }

                    break;

                case 0:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while(choice != 0);
    }
}
package com.student.course.mng;

import java.util.Scanner;

public class StudentDetails {

    private Scanner sc;

    public StudentDetails(Scanner sc) {
        this.sc = sc;
    }

    public Student getStudentDetails() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        return new Student(id, name);
    }
}
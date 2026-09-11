package com.student.course.mng;

import java.util.Scanner;

public class CourseDetails {

    private Scanner sc;

    public CourseDetails(Scanner sc) {
        this.sc = sc;
    }

    public Course getCourseDetails() {

        System.out.print("Enter Course ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Course Name: ");
        String name = sc.nextLine();

        return new Course(id, name);
    }
}
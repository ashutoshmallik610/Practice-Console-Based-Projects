package com.student.course.mng;

import java.util.Scanner;

import com.student.course.mng.exception.CourseAlreadyEnrolledException;
import com.student.course.mng.exception.CourseNotFoundException;
import com.student.course.mng.exception.DuplicateStudentException;
import com.student.course.mng.exception.StudentNotFoundException;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentCourseManager manager = new StudentCourseManager();

        StudentDetails studentDetails = new StudentDetails(sc);

        CourseDetails courseDetails = new CourseDetails(sc);

        int choice = 0;

        do {

            try {

                System.out.println("\n==============================");
                System.out.println(" STUDENT COURSE MANAGEMENT");
                System.out.println("==============================");

                System.out.println("1. Add Student");
                System.out.println("2. Remove Student");
                System.out.println("3. View All Students");
                System.out.println("4. Search Student by ID");
                System.out.println("5. Enroll Student in Course");
                System.out.println("6. Drop Course");
                System.out.println("7. View Student Courses");
                System.out.println("8. Exit");

                System.out.print("\nEnter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                case 1:

                    Student student = studentDetails.getStudentDetails();

                    manager.addStudent(student);

                    break;


                case 2:

                    System.out.print("Enter Student ID: ");

                    int removeId = sc.nextInt();

                    manager.removeStudent(removeId);

                    break;


                case 3:

                    manager.viewAllStudents();

                    break;


                case 4:

                    System.out.print("Enter Student ID: ");

                    int searchId = sc.nextInt();

                    manager.searchStudent(searchId);

                    break;


                case 5:

                    System.out.print("Enter Student ID: ");

                    int studentId = sc.nextInt();

                    Course course = courseDetails.getCourseDetails();

                    manager.enrollCourse(studentId,course);

                    break;


                case 6:

                    System.out.print("Enter Student ID: ");

                    int stdId = sc.nextInt();

                    System.out.print("Enter Course ID: ");

                    int courseId = sc.nextInt();

                    manager.dropCourse(stdId,courseId);

                    break;


                case 7:

                    System.out.print("Enter Student ID: ");

                    int id = sc.nextInt();

                    manager.viewStudentCourses(id);

                    break;


                case 8:

                    System.out.println("Thank you for using the application.");

                    break;


                default:

                    System.out.println("Invalid menu choice.");
                }

            }

            catch (DuplicateStudentException |
                   StudentNotFoundException |
                   CourseNotFoundException |
                   CourseAlreadyEnrolledException e) {

                System.out.println("Error: " + e.getMessage());
            }

            catch (IllegalArgumentException e) {

                System.out.println("Invalid input: " + e.getMessage());
            }

            catch (Exception e) {

                System.out.println("Something went wrong: "+ e.getMessage());

                sc.nextLine();
            }

        } while (choice != 8);

        sc.close();
    }
}
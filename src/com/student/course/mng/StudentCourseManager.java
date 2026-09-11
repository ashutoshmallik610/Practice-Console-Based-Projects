package com.student.course.mng;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.student.course.mng.exception.CourseAlreadyEnrolledException;
import com.student.course.mng.exception.CourseNotFoundException;
import com.student.course.mng.exception.DuplicateStudentException;
import com.student.course.mng.exception.StudentNotFoundException;

public class StudentCourseManager {

    private Map<Integer, Student> students;

    private Map<Integer, Set<Course>> studentCourses;


    public StudentCourseManager() {

        students = new LinkedHashMap<>();

        studentCourses = new LinkedHashMap<>();
    }


    // 1. Add Student
    public void addStudent(Student student) throws DuplicateStudentException 
    {
        if (students.containsKey(student.getStdId())) {

            throw new DuplicateStudentException("Student ID already exists: "+ student.getStdId());
        }

        students.put(student.getStdId(), student);

        studentCourses.put(student.getStdId(),new LinkedHashSet<Course>());

        System.out.println("Student added successfully.");
    }


    // 2. Remove Student
    public void removeStudent(int studentId)
            throws StudentNotFoundException {

        if (!students.containsKey(studentId)) {

            throw new StudentNotFoundException("Student not found: " + studentId);
        }

        students.remove(studentId);

        studentCourses.remove(studentId);

        System.out.println("Student removed successfully.");
    }


    // 3. View All Students
    public void viewAllStudents() {

        if (students.isEmpty()) {

            System.out.println("No students registered.");

            return;
        }

        System.out.println("\n--- All Students ---");

        students.values().stream().forEach(student -> System.out.println(student));
    }


    // 4. Search Student by ID
    public void searchStudent(int studentId)
            throws StudentNotFoundException {

        Student student = students.values().stream().filter(s -> s.getStdId() == studentId).findFirst().orElseThrow(() ->
                        new StudentNotFoundException("Student not found: " + studentId));

        System.out.println("Student Found:");
        System.out.println(student);
    }


    // 5. Enroll Student in Course
    public void enrollCourse(
            int studentId,
            Course course)
            throws StudentNotFoundException,
                   CourseAlreadyEnrolledException {

        if (!students.containsKey(studentId)) {

            throw new StudentNotFoundException(
                    "Student not found: " + studentId);
        }

        Set<Course> courses =
                studentCourses.get(studentId);

        if (courses.contains(course)) {

            throw new CourseAlreadyEnrolledException(
                    "Student is already enrolled in Course ID: "
                    + course.getCourseId());
        }

        courses.add(course);

        System.out.println(
                "Course enrolled successfully.");
    }


    // 6. Drop Course
    public void dropCourse(
            int studentId,
            int courseId)
            throws StudentNotFoundException,
                   CourseNotFoundException {

        if (!students.containsKey(studentId)) {

            throw new StudentNotFoundException(
                    "Student not found: " + studentId);
        }

        Set<Course> courses =
                studentCourses.get(studentId);

        Course course = courses.stream()
                .filter(c -> c.getCourseId() == courseId)
                .findFirst()
                .orElseThrow(() ->
                        new CourseNotFoundException(
                                "Course not found: " + courseId));

        courses.remove(course);

        System.out.println(
                "Course dropped successfully.");
    }


    // 7. View Student Courses
    public void viewStudentCourses(int studentId)
            throws StudentNotFoundException {

        if (!students.containsKey(studentId)) {

            throw new StudentNotFoundException(
                    "Student not found: " + studentId);
        }

        System.out.println(
                "\nStudent: " + students.get(studentId));

        Set<Course> courses =
                studentCourses.get(studentId);

        if (courses.isEmpty()) {

            System.out.println(
                    "No courses enrolled.");

            return;
        }

        System.out.println("\n--- Enrolled Courses ---");

        courses.stream()
                .forEach(course -> System.out.println(course));
    }


    // Extra Stream operation
    // Search students by name
    public void searchStudentByName(String name) {

        System.out.println(
                "\n--- Students Matching Name ---");

        students.values()
                .stream()
                .filter(student ->
                        student.getStdName()
                               .equalsIgnoreCase(name))
                .forEach(student ->
                        System.out.println(student));
    }


    // Extra Stream operation
    // Display student names in sorted order
    public void displayStudentNamesSorted() {

        System.out.println(
                "\n--- Student Names ---");

        students.values()
                .stream()
                .map(student -> student.getStdName())
                .sorted()
                .forEach(name ->
                        System.out.println(name));
    }
}
package com.student.course.mng;

import java.util.Objects;

public class Course {

    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        setCourseId(courseId);
        setCourseName(courseName);
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {

        if (courseId <= 0) {
            throw new IllegalArgumentException("Course ID must be greater than 0");
        }

        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {

        if (courseName == null || courseName.isBlank()) {
            throw new IllegalArgumentException("Course name cannot be empty");
        }

        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Course))
            return false;

        Course course = (Course) obj;

        return this.courseId == course.courseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId +", Course Name: " + courseName;
    }
}
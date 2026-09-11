package com.student.course.mng;

import java.util.Objects;

public class Student {

    private int stdId;
    private String stdName;

    public Student(int stdId, String stdName) {
        setStdId(stdId);
        setStdName(stdName);
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {

        if (stdId <= 0) {
            throw new IllegalArgumentException("Student ID must be greater than 0");
        }

        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {

        if (stdName == null || stdName.isBlank()) {
            throw new IllegalArgumentException("Student name cannot be empty");
        }

        this.stdName = stdName;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Student))
            return false;

        Student student = (Student) obj;

        return this.stdId == student.stdId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stdId);
    }

    @Override
    public String toString() {
        return "Student ID: " + stdId + ", Name: " + stdName;
    }
}
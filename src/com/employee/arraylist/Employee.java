package com.employee.arraylist;

import java.util.Objects;

public class Employee {

    private String id;
    private String name;
    private String gender;
    private int salary;
    private int age;

    public Employee(String id, String name, String gender,
                    int salary, int age) {

        this.id = id;
        setName(name);
        setGender(gender);
        setSalary(salary);
        setAge(age);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.isEmpty()) 
        {
            throw new InvalidEmployeeException("Invalid employee name");
        }

        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {

        if (gender == null || gender.isEmpty()) 
        {
            throw new InvalidEmployeeException("Invalid employee gender");
        }

        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {

        if (salary <= 0) 
        {
            throw new InvalidEmployeeException("Salary must be greater than 0" );
        }

        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age <= 0) 
        {
            throw new InvalidEmployeeException("Invalid employee age");
        }

        this.age = age;
    }

    public String generateReport() {

        StringBuilder sb = new StringBuilder();

        sb.append("ID : ").append(id)
          .append(" | Name : ").append(name)
          .append(" | Gender : ").append(gender)
          .append(" | Salary : ").append(salary)
          .append(" | Age : ").append(age);

        return sb.toString();
        
    }

    @Override
    public String toString() {
        return generateReport();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee employee = (Employee) obj;

        return Objects.equals(this.id, employee.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
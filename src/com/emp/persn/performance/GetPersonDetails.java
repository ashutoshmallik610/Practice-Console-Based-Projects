package com.emp.persn.performance;

import java.util.ArrayList;
import java.util.List;

public class GetPersonDetails {

    public List<Employee> getEmployees() {

        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Developer("E101", "Ayush", " DevOps & Infrastructure", 70000, "Python", 3));
        
        employees.add(new Developer("E102", "Abhiit", "Data Science & Analytics", 60000, "Julia", 2));
		
        employees.add(new SeniorDeveloper("E102", "Sandeep", "Advanced & Infrastructure Teams", 95000, " C#", 5, 7));
        
        employees.add( new SeniorDeveloper("E103","Sandeep","Cloud", 85000, "C#", 5, 6 ));

        employees.add( new Employee( "E105","Nitin", "HR", 40000));

        return employees;
    }
}
package com.emp.persn.performance;

import java.util.List;
import java.util.stream.Collectors;

public class ProcessPerson 
{
	public void processPreson()
	{
		GetPersonDetails personDetails = new GetPersonDetails();
		
		List<Employee> emp = personDetails.getEmployees();
		
		//All Employees
		System.out.println("All Employees..................");
		
		List<Employee> allEmployees = emp.stream().collect(Collectors.toList());
		
		System.out.println(allEmployees);
		
		//Filter Whose Salary is Greater Than 50000
		
		System.out.println("Salary Greater Than 50000...............................");
			
		List<Employee> employeeWithSalary = emp.stream().filter(x -> x.getSalary() > 50000).collect(Collectors.toList());
		
		System.out.println(employeeWithSalary);
		
		//Extract only the names
		
		System.out.println("Extract only the names...............................");
		
		List<String> employeesNames = emp.stream().map(x -> x.getName()).collect(Collectors.toList());
		
		System.out.println(employeesNames);
		
		//Remove Duplicate ID
		
		System.out.println("Removing Duplicates.....................................");
		
		List<Employee> removeDuplicateId = emp.stream().distinct().toList();
		
		System.out.println(removeDuplicateId);
		
		for (Employee employee : emp) {

		    if (employee instanceof SeniorDeveloper) {

		        SeniorDeveloper s = (SeniorDeveloper) employee;

		        s.conductTeamMeeting();
		        s.calculatePerformance();

		    } else if (employee instanceof Developer) {

		        Developer d = (Developer) employee;

		        d.calculatePerformance();
		    }
		}
	}
}

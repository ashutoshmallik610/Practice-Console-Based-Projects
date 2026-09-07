package com.employee.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProcessEmployees 
{
	
	public void processAndDisplayEmployeeData() {

	    GetEmployees g = new GetEmployees();

	    ArrayList<Employee> emps = g.getEmployee();

	    System.out.println("Employees before : --------------------------\n" + emps);
	    
	    List<Employee> employees = emps.stream().distinct().collect(Collectors.toList());
	    
	    System.out.println("Employees after removing duplicate : --------------------------\n"+employees);

	    List<Employee> salaryWise = employees.stream().filter(x -> x.getSalary() > 60000).collect(Collectors.toList());

	    System.out.println("Employees after salary filter : --------------------------\n" + salaryWise);

//	    Map<String, List<Employee>> employeesByGender = employees.stream().collect(Collectors.groupingBy(x -> x.getGender()));
//
//	    System.out.println("Employees grouped by gender : " + employeesByGender);
	    
	    Map<String, List<Employee>> employeesByRole = employees.stream().collect(Collectors.groupingBy(x -> {
	    	    	
	    	        if (x instanceof Developer) {
	    	            return "Developer";
	    	        } 
	    	        else if (x instanceof Tester) {
	    	            return "Tester";
	    	        } 
	    	        else if (x instanceof Manager) {
	    	            return "Manager";
	    	        } 
	    	        else {
	    	            return "General Employee";
	    	        }
	    	    }
	    	    ));

	    System.out.println("Employees grouped by role : --------------------------\n" + employeesByRole);
	    
	    System.out.println("\nEmployees specific work : --------------------------");
	    
	    for(Employee e : employees)
	    {
	    		if(e instanceof Developer)
	    		{
	    			Developer d = (Developer)e;
	    			
	    			d.developerSpecificOperation();
	    		}
	    		if(e instanceof Tester)
	    		{
	    			Tester t = (Tester)e;
	    			
	    			t.testerSpecificOperation();
	    		}
	    		if(e instanceof Manager)
	    		{
	    			Manager m = (Manager)e;
	    			
	    			m.managerSpecificOperation();
	    		}
	    }
	    
	}
}

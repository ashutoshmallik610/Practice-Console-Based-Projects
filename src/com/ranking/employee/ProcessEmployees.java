package com.ranking.employee;

import java.util.List;import java.util.stream.Collectors;

public class ProcessEmployees 
{
	public void salaryGreaterThan60(EmployeeDetails e)
	{
		List<Employee> emplyeesSalary60 = e.getEmployeeDetails();
		
		System.out.println("=========Employees salary > than 60000=========");
		
		List<Employee> es = emplyeesSalary60.stream().filter(x -> x.getSalary() > 60000).collect(Collectors.toList());
		
		System.out.println(es);
	}
	
	public void employeeNames(EmployeeDetails e)
	{
		List<Employee> emps = e.getEmployeeDetails();
		
		System.out.println("=========Employees=========");
		
		List<String> empss = emps.stream().map(x -> x.getName()).collect(Collectors.toList());
		
		System.out.println(empss);
	}
	
	public void seniorDeveloper(EmployeeDetails e)
	{
	    List<Employee> emps = e.getEmployeeDetails();

	    System.out.println("========= Senior Developer Work =========");

	    for(Employee employee : emps)
	    {
	        if(employee instanceof SeniorDeveloper)
	        {
	            SeniorDeveloper s = (SeniorDeveloper) employee;

	            s.conductTeamMeeting();
	        }
	    }
	}
	
}



package com.ranking.employee;

import java.util.ArrayList;
import java.util.HashSet;

public class EmployeeDetails 
{
	public ArrayList<Employee> getEmployeeDetails()
	{
		ArrayList<Employee> set = new ArrayList<Employee>();
		
		set.add(new Developer("Ayush", 23, "Male", "WERTYUOP", 78000, ".Net", 3));
		
		set.add(new Developer("Abhijit", 24, "Male", "DGJKYGBC", 77000, "C++", 2));
		
		set.add(new SeniorDeveloper("Rahul", 26, "Male", "KJHGFDDF", 110000, "Java", 4, 8));
		
		set.add(new SeniorDeveloper("Hemant", 24, "Male", "HGFDSDJP", 130000, "Java", 5, 10));
		
		set.add(new Tester("Sandeep", 25, "Male", "UYTREHJX", 80000, "Selenium"));
		
		set.add(new Tester("Daksh", 26, "Male", "WERTGGFX", 100000, "Playwright"));
		
		set.add(new Developer("Abhijit", 24, "Male", "WERTYUOP", 77000, "C++", 2)); //duplicate
		
		return set;
	}
}

package com.ranking.employee;

import java.util.Comparator;

public class CompareBySalary implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) 
	{
		int result = e2.getSalary() - e1.getSalary();
		
		return result;
	}

}

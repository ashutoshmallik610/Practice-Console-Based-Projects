package com.college;

public class HOD extends Faculty
{
	private String dept;

	public HOD(String id, String name, int age, String subject, int salary, String dept)
	{
		super(id, name, age, subject, salary);
		setDept(dept);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) 
	{
		if(dept==null)
		{
			System.out.println("Invalid Department");
			this.dept=null;
		}
		else
		{
			this.dept=dept;
		}
	}
	
	@Override
	public void performRole()
	{
	    calculateSalary();
	}
	
	@Override
	public void displayDetails()
	{
	    super.displayDetails();

	    System.out.println("Department 	: " + getDept());
	}
	
}

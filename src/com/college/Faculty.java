package com.college;

public class Faculty extends Person
{
	private String subject;
	private int salary;
	
	public Faculty(String id, String name, int age, String subject, int salary)
	{
		super(id, name, age);
		setSubject(subject);
		setSalary(salary);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) 
	{
		if(subject==null)
		{
			System.out.println("Invalid Subject");
			this.subject=null;
		}
		else
		{
			this.subject=subject;
		}
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) 
	{
		
		if(salary>0)
		{
		this.salary = salary;
		}
		else
		{
			System.out.println("Invalid Salary");
			this.salary=0;
		}
	}
	
	public void calculateSalary()
	{
		int yearlySalary=getSalary()*12;
		System.out.println("Yearly salary is : "+yearlySalary);
	}
	
	@Override
	public void performRole()
	{
	    calculateSalary();
	}
	
	@Override
	public void displayDetails() 
	{
		System.out.println("Faculty Id 	: "+getId());
		System.out.println("Faculty Name 	: "+getName());
		System.out.println("Faculty Age 	: "+getAge());
		System.out.println("Faculty Subject : "+getSubject());
		System.out.println("Faculty Salary 	: ₹"+getSalary());
	}
	
}

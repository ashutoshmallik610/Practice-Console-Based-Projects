package com.college;

abstract public class Person 
{
	private String id;
	private String name;
	private int age;
	
	public Person(String id, String name, int age) 
	{
		setId(id);
		setName(name);
		setAge(age);;
	}

	public String getId() {
		return id;
	}

	public void setId(String id)
	{
		if(id==null)
		{
			System.out.println("Invalid ID");
			this.id=null;
		}
		else
		{
			this.id=id;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) 
	{
		if(name==null)
		{
			System.out.println("Invalid Name");
			this.name=null;
		}
		else
		{
			this.name=name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) 
	{	
		if(age>0)
		{
		this.age = age;
		}
		else
		{
			System.out.println("Invalid Age");
			this.age=0;
		}
	}
	public abstract void displayDetails();
	public abstract void performRole();
	
}

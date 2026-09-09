package com.ranking.employee;

public class Person {
	
	private String name;
	private int age;
	private String gender;

	public Person(String name, int age, String gender) 
	{	
		setName(name);
		setGender(gender);
		setAge(age);
	}

	// Getter and Setter for name
	public String getName() {
	    return name;
	}

	public void setName(String name) 
	{
	    if (name == null || name.isBlank()) 
	    {
	        System.out.println("Invalid Name");
	        this.name = null;
	    }
	    else
	    {
	    	 this.name = name;
	    }
	   
	}

	// Getter and Setter for age
	public int getAge() {
	    return age;
	}

	public void setAge(int age)
	{
	    if (age < 0 || age > 120) 
	    {
	        System.out.println("Invalid Age");
	        this.age = 0;
	    }
	    else
	    {
	    	this.age = age;
	    }
	    
	}

	// Getter and Setter for gender
	public String getGender() {
	    return gender;
	}

	public void setGender(String gender) {

	    if (gender == null ||
	        (!gender.equalsIgnoreCase("Male") &&
	         !gender.equalsIgnoreCase("Female") &&
	         !gender.equalsIgnoreCase("Other"))) {

	        System.out.println("Invalid Gender");
	        this.gender = null;
	    }
	    else
	    {
	    	 this.gender = gender;
	    }
	   
	}
	
}

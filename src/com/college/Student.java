package com.college;

public class Student extends Person
{
	private String course;
	private int marks;
	
	public Student(String id, String name, int age, String course, int marks) 
	{
		super(id, name, age);
		setCourse(course);
		setMarks(marks);
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) 
	{
		if(course==null)
		{
			System.out.println("Invalid Course");
			this.course=null;
		}
		else
		{
			this.course=course;
		}
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) 
	{
		
		if(marks>0)
		{
		this.marks = marks;
		}
		else
		{
			System.out.println("Invalid Mark");
			this.marks=0;
		}
	}
	
	public void calculateGrade()
	{
	    if(marks >= 90)
	    {
	        System.out.println("Grade 		: A");
	    }
	    else if(marks >= 75)
	    {
	        System.out.println("Grade 		: B");
	    }
	    else if(marks >= 60)
	    {
	        System.out.println("Grade 		: C");
	    }
	    else
	    {
	        System.out.println("Grade 		: Fail");
	    }
	}
	
	@Override
	public void performRole()
	{
	    calculateGrade();
	}
	
	@Override
	public void displayDetails() 
	{
		System.out.println("Student Id 	: "+getId());
		System.out.println("Student Name 	: "+getName());
		System.out.println("Student Age 	: "+getAge());
		System.out.println("Student Course 	: "+getCourse());
		System.out.println("Student Marks 	: "+getMarks());

	}
	
}

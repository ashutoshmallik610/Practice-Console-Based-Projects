package com.ranking.employee;

public class Tester extends Employee
{
	private String testingTool;

	public Tester(String name, int age, String gender, String id, 
			int salary, String testingTool) 
	{
		super(name, age, gender, id, salary);
		this.testingTool = testingTool;
	}

	public String getTestingTool() {
		return testingTool;
	}

	public void setTestingTool(String testingTool) 
	{
		if (testingTool == null || testingTool.isBlank()) 
	    {
	        System.out.println("Invalid Testing Tool");
	        this.testingTool = null;

	    }
	    else
	    {
	    	this.testingTool = testingTool;
	    }
	}

	@Override
	public void calculatePerformance() {

		System.out.println(getName()+" Calculate performance based on valid bugs detected,"
				+ " test automation coverage, and escaped defects.");
		
	}
	
	@Override
	public String displayDetails()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.displayDetails());
		
		sb.append("| Testing Tool : ").append(testingTool);
		
		return sb.toString();
		
	}
	
}

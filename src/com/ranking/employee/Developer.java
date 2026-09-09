package com.ranking.employee;

public class Developer extends Employee{
	
	private String language;
	private int experience;
	
	public Developer(String name, int age, String gender, 
			String id, int salary, String language, int experience) 
	{
		super(name, age, gender, id, salary);
		this.language = language;
		this.experience = experience;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) 
	{
		 if (language == null || language.isBlank()) 
		    {
		        System.out.println("Invalid Language");
		        this.language = null;
		    }
		    else
		    {
		    	this.language = language;
		    }
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) 
	{
		if(experience>0)
		{
			this.experience = experience;
		}
		else
		{
			System.out.println("Invalid Experience");
			this.experience = 0;
		}
		this.experience = experience;
	}

	@Override
	public void calculatePerformance() {

		System.out.println(getName()+" Calculate performance based on code quality, "
				+ "story points completed, and bugs found in testing.");
		
	}
	
	@Override
	public String displayDetails()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.displayDetails());
		
		sb.append("| Programming Language : ").append(language)
		  .append("| Experience : ").append(experience);
		
		return sb.toString();
		
	}
	
}

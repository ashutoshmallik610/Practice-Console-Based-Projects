package com.ranking.employee;

public class SeniorDeveloper extends Developer
{
	private int teamSize;

	public SeniorDeveloper(String name, int age, String gender, String id,
			int salary, String language, int experience,int teamSize) 
	{
		super(name, age, gender, id, salary, language, experience);
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) 
	{
		if(teamSize>0)
		{
			this.teamSize = teamSize;
		}
		else
		{
			System.out.println("Invalid Team Size");
			this.teamSize = 0;
		}
		this.teamSize = teamSize;
	}
	@Override
	public void calculatePerformance() {

		System.out.println(getName()+" Calculate performance based on system architecture impact,"
				+ " mentorship hours, and critical problem-solving.");
		
	}
	
	@Override
	public String displayDetails() {

	    StringBuilder sb = new StringBuilder();

	    sb.append(super.displayDetails())
	      .append("| Team Size : ")
	      .append(teamSize);

	    return sb.toString();
	}	
	
	public void conductTeamMeeting()
	{
		System.out.println("Senior developer conducts team meeting");
	}
	
}

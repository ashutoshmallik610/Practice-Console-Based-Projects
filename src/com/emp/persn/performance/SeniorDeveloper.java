package com.emp.persn.performance;

public class SeniorDeveloper extends Developer {

    private int teamSize;

    public SeniorDeveloper(String id, String name, String department, int salary,
    		String programmingLanguage,int experience, int teamSize) 
    {
        super(id, name, department, salary, programmingLanguage, experience);

        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    // Method existing only in SeniorDeveloper
    public void conductTeamMeeting() {

        System.out.println( getName() + " is conducting a meeting for " + teamSize +" team members.");
    }

    @Override
    public void calculatePerformance() {

        System.out.println(getName() + " - Senior Developer performance: Outstanding");
    }

    @Override
    public String display() {

        StringBuilder sb = new StringBuilder();

        sb.append(super.display())
          .append(" | Team Size: ").append(teamSize).append("\n");

        return sb.toString();
    }

    // Covariant return type
    @Override
    public SeniorDeveloper getPerson() {
        return this;
    }
}
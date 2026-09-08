package com.emp.persn.performance;

public class Developer extends Employee {

    private String programmingLanguage;
    private int experience;

    public Developer(String id, String name, String department, int salary,
            String programmingLanguage, int experience)
    {
        super(id, name, department, salary);

        this.programmingLanguage = programmingLanguage;
        this.experience = experience;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public void calculatePerformance() {

        System.out.println(getName() + " - Developer performance: Excellent");
    }

    @Override
    public String display() {

        StringBuilder sb = new StringBuilder();

        sb.append(super.display())
          .append(" | Language: ").append(programmingLanguage)
          .append(" | Experience: ").append(experience);

        return sb.toString();
    }

    // Covariant return type
    @Override
    public Developer getPerson() {
        return this;
    }
    
    
}
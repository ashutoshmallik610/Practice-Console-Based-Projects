package com.employee.arraylist;


public class Developer extends Employee {

    private String programmingLanguage;
    private String tool;

    public Developer(String id, String name, String gender,int salary, int age,
                     String programmingLanguage,String tool) 
    {

        super(id, name, gender, salary, age);

        this.programmingLanguage = programmingLanguage;
        this.tool = tool;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void developerSpecificOperation() {

        System.out.println(getName() +" develops using " +programmingLanguage);
    }

    @Override
    public String generateReport() {

        StringBuilder sb = new StringBuilder();

        sb.append(super.generateReport())
          .append(" | Role : Developer")
          .append(" | Language : ")
          .append(programmingLanguage)
          .append(" | Tool : ")
          .append(tool);
        
        sb.append("\n");
        return sb.toString();
    }

    
    
}
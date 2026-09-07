package com.employee.arraylist;

public class Tester extends Employee {

    private String testingTool;

    public Tester(String id, String name, String gender,
                  int salary, int age,
                  String testingTool) {

        super(id, name, gender, salary, age);

        this.testingTool = testingTool;
    }

    public String getTestingTool() {
        return testingTool;
    }

    public void testerSpecificOperation() {

        System.out.println(getName() +" performs testing using " +testingTool);
    }

    @Override
    public String generateReport() {

        StringBuilder sb = new StringBuilder();

        sb.append(super.generateReport())
          .append(" | Role : Tester")
          .append(" | Testing Tool : ")
          .append(testingTool);

        sb.append("\n");
        return sb.toString();
    }
}
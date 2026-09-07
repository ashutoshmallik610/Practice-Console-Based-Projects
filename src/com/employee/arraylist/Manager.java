package com.employee.arraylist;

public class Manager extends Employee {

    private String team;

    public Manager(String id, String name, String gender,
                   int salary, int age,
                   String team) {

        super(id, name, gender, salary, age);

        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void managerSpecificOperation() {

        System.out.println(
                getName() +
                " manages the " +
                team +
                " team"
        );
    }

    @Override
    public String generateReport() {

        StringBuilder sb = new StringBuilder();

        sb.append(super.generateReport())
          .append(" | Role : Manager")
          .append(" | Team : ")
          .append(team);

        sb.append("\n");
        return sb.toString();
    }
}
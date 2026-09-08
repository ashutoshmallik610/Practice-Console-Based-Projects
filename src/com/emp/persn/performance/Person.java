package com.emp.persn.performance;


public class Person {

    private String id;
    private String name;

    // Static block
    static {
        Employee.companyName = "Tech Solutions Pvt. Ltd.";
        System.out.println("Static block: Company initialized");
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Encapsulation
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();

        sb.append("ID: ").append(id)
          .append(" | Name: ").append(name);

        return sb.toString();
    }

    // Used for covariant return type
    public Person getPerson() {
        return this;
    }
    
}
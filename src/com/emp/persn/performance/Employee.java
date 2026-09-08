package com.emp.persn.performance;

import java.util.Objects;

public class Employee extends Person implements Performance {

    private String department;
    private int salary;

    static String companyName;

    // Instance block
    {
        System.out.println("Instance block: Employee object is being created");
    }

    public Employee(String id, String name, String department, int salary) 
    {

        super(id, name);

       setDepartment(department);
       setSalary(salary);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary)
    {

        if (salary <= 0) 
        {
        		throw new InvalidEmployeeException( "Salary must be greater than 0" );
        }

        this.salary = salary;
    }

    @Override
    public void calculatePerformance() {

        System.out.println( getName() + " - Employee performance: Good");
    }

    @Override
    public String display() {

        StringBuilder sb = new StringBuilder();

        sb.append(super.display())
          .append(" | Department: ").append(department)
          .append(" | Salary: ").append(salary)
          .append(" | Company: ").append(companyName);

        return sb.toString();
    }

    // Covariant return type
    @Override
    public Employee getPerson() {
        return this;
    }
    
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	@Override
	public boolean equals(Object obj) 
	{
		Person other = (Person) obj;
		return Objects.equals(getId(), other.getId());
	}

	@Override
	public String toString() 
	{
		return display();
	}
	
	
}
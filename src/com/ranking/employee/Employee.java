package com.ranking.employee;

import java.util.Objects;

public abstract class Employee extends Person implements Performance{

		private String id;
		private int salary;
		static String companyName = "Oracle";
	
		static
		{
			System.out.println("Company is : "+companyName);
		}
		
		public Employee(String name, int age, String gender, String id, int salary) 
		{
			super(name, age, gender);
			setId(id);
			setSalary(salary);
		}

	// Getter and Setter for id
		public String getId() {
		    return id;
		}

		public void setId(String id)
		{
		    if (id == null || id.isBlank()) 
		    {
		        System.out.println("Invalid ID");
		        this.id = null;
	
		    }
		    else
		    {
		    	this.id = id;
		    }
		    
		}
		
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) 
		{
			if(salary>0)
			{
				this.salary = salary;
			}
			else
			{
				System.out.println("Invalid salary");
				this.salary = 0;
			}
			
		}
		
		@Override
		public boolean equals(Object obj)
		{
			Employee e = (Employee) obj;
			
			return this.id.equals(e.id);
		}
		
		
		@Override
		public int hashCode()
		{
			return Objects.hash(id);
		}
		
		public String displayDetails()
		{
			StringBuilder sb = new StringBuilder();
			
			sb.append("| Employee Id : ").append(id)
			  .append("| Name : ").append(getName())
			  .append("| Gender : ").append(getGender())
			  .append("| Age :").append(getAge())
			  .append("| Salary : ").append(salary);
			
			return sb.toString();
			
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", salary=" + salary + ", getName()=" + getName() + ", getAge()=" + getAge()
					+ ", getGender()=" + getGender() + "]";
		}
		
		
}

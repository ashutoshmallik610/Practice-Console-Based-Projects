package com.emp.persn.performance;

public class Driver {

    public static void main(String[] args) {
    	
    		try 
    			{
    				ProcessPerson processPerson = new ProcessPerson();
    				
    				processPerson.processPreson();
    			} 
    		catch (InvalidEmployeeException e) 
    		{

    			System.out.println(e.getMessage());
		}
    }
}
package com.college;

import java.util.Scanner;
public class Driver {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== College Management System =====");
		System.out.println("1.Student");
		System.out.println("2.Faculty");
		System.out.println("3.HOD");
		int choice=sc.nextInt();
		
		ProcessCollege processCollege =  new ProcessCollege();
		
		switch(choice)
		{
		case 1:
			Student student = new Student("GFDf4567", "Rahul", 21, "B.Tech", 90);
			processCollege.process(student);
			break;
		case 2:
			Faculty faculty = new Faculty("DKBK8990", "Sandeep", 41, "Math", 55000);
			processCollege.process(faculty);
			break;
		case 3:
			HOD hod = new HOD("KJHJ985", "Bikash", 50,"Software-Engineering" , 65000, "MBA");
			processCollege.process(hod);
			break;
		}
		sc.close();
	}

}

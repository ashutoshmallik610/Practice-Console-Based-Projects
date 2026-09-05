package com.ecommerce;

import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the option");
		System.out.println("1---Electronics");
		System.out.println("2---Clothing");
		int choice=sc.nextInt();
		ProductProcessDetails productProcessDetails = new ProductProcessDetails();
		switch(choice)
		{
		case 1:
			Electronics electronics = new Electronics("4567GHFG", "AC", 37000, 2, "Havels");
			productProcessDetails.processProductDetails(electronics);
			break;
		case 2:
			Clothing clothing = new Clothing("7656DDFV", "T-shirt", 999, "M", "Cotton");
			productProcessDetails.processProductDetails(clothing);
			break;
		default :
			System.out.println("Invalid choice");
		}
		sc.close();
	}

}

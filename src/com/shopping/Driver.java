package com.shopping;

public class Driver {

	public static void main(String[] args) {
		
		Product[] products = new Product[2];
		
		products[0] = new Electronics("iPhone 17", 89000, 2, "apple", "DFGH01", 1);
		products[1] = new Clothing("T-shirt", 899, 4, "M", "Black", "Male", "cutton");
		
		for(Product p : products)
		{
		    p.displayDetails();
		    System.out.println("----------------------");
		}
		
		Customer customer = new Customer("Ashutosh Mallik", "98765432", "ashutosh@gmail.com");

		customer.customerDisplay();

		System.out.println("----------------------");
		
		Cart cart = new Cart();

		cart.addCart(products[0]);

		cart.removeCart(products[0]);
		
		Invoice invoice = new Payment(101,90000);

		invoice.generateReceipt();

		invoice.generateReceipt();
		
		
	}

}

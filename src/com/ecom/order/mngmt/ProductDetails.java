package com.ecom.order.mngmt;

import java.util.ArrayList;
import java.util.List;

public class ProductDetails {

	    public ArrayList<Product> getProducts() {

	    	ArrayList<Product> products = new ArrayList<Product>();

	        Electronics e1 = new Electronics("E101", "Laptop", 55000, 2, "Dell", 2);
	        Electronics e2 = new Electronics("E102", "Smartphone", 25000, 5, "Samsung", 1);
	        Electronics e3 = new Electronics("E103", "Headphones", 2500, 10, "Sony", 1);
	        Electronics e4 = new Electronics("E101", "Laptop", 55000, 2, "Dell", 2); // duplicate
	        Electronics e5 = new Electronics("E105", "Smartwatch", 5000, 4, "Boat", 1);
	        Electronics e6 = new Electronics("E106", "Tablet", 18000, 3, "Lenovo", 2);

	        Clothing c1 = new Clothing("C101", "T-Shirt", 999, 5, "Cotton", "L");
	        Clothing c2 = new Clothing("C102", "Jeans", 1999, 4, "Denim", "32");
	        Clothing c3 = new Clothing("C103", "Shirt", 1499, 6, "Linen", "M");
	        Clothing c4 = new Clothing("C101", "T-Shirt", 999, 5, "Cotton", "L"); // duplicate
	        Clothing c5 = new Clothing("C105", "Jacket", 2999, 3, "Leather", "XL");
	        Clothing c6 = new Clothing("C106", "Hoodie", 1799, 7, "Wool", "L");

	        products.add(e1);
	        products.add(e2);
	        products.add(e3);
	        products.add(e4);
	        products.add(e5);
	        products.add(e6);

	        products.add(c1);
	        products.add(c2);
	        products.add(c3);
	        products.add(c4);
	        products.add(c5);
	        products.add(c6);

	        return products;
	}
}

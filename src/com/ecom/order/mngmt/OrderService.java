package com.ecom.order.mngmt;

import java.util.List;
import java.util.stream.Collectors;

public class OrderService {

	public void productDetails(ProductDetails products)
	{
		List<Product> prds = products.getProducts();
		
		System.out.println("All products ............................\n"+prds);
	}
	
	
    // Remove duplicate products
    public void removeDuplicates(List<Product> products) 
    {

    	List<Product> prds = products.stream().distinct().collect(Collectors.toList());
    	
    	System.out.println("Removed duplicate products ............................\n"+prds);
    }


    // Find products whose price > 2000
    public void findExpensiveProducts(List<Product> products)
    {

    	List<Product> prds = products.stream().filter(p -> p.getPrice() > 2000).collect(Collectors.toList());
        
    	System.out.println("Products whose price is greater than 50000 ............................\n"+prds);
    }


    // Calculate total value
    // price × quantity
    public void calculateTotalValue(List<Product> products) {

        int prds = products.stream().mapToInt(p -> p.getPrice() * p.getQuantity()).sum();
        
        System.out.println("Final amount ............................\n"+prds);
    }


    //  instanceof + downcasting
    public void displaySpecificDetails(List<Product> products) {

        for (Product p : products) {

            if (p instanceof Electronics) {

                Electronics e = (Electronics) p;

                e.showWarranty();

            } 
            else if (p instanceof Clothing) {

                Clothing c = (Clothing) p;

                c.showFabric();
            }
        }
    }

}
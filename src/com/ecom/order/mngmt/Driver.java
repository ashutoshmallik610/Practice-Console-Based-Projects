package com.ecom.order.mngmt;

import java.util.List;

public class Driver {

	public static void main(String[] args) {

		ProductDetails p = new ProductDetails();
		
		List<Product> pr = p.getProducts();
		
			OrderService orderService = new OrderService();
			
			orderService.productDetails(p);
			
			orderService.removeDuplicates(pr);
			
			orderService.findExpensiveProducts(pr);
			
			orderService.calculateTotalValue(pr);
			
			orderService.displaySpecificDetails(pr);

	}

}

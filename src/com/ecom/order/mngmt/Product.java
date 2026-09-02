package com.ecom.order.mngmt;

import java.util.Objects;

public class Product {

    private String id;
    private String name;
    private int price;
    private int quantity;

    public Product(String id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) 
    {	
    	if (price <= 0) 
        {
             throw new InvalidPriceException("Price must be greater than 0 for " + name);
        }
    	else
    	{
    		this.price = price;
    	}
        
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) 
    {
    	if (quantity <= 0) 
        {
             throw new InvalidQuantityException("Quantity must be greater than 0 for " + name);
        }
    	else
    	{
    		this.quantity = quantity;
    	}
        
    }

    public String displayDetails() {

        StringBuilder sb = new StringBuilder();

        sb.append("| ID : ").append(id)
          .append(" | Name : ").append(name)
          .append(" | Price : ").append(price)
          .append(" | Quantity : ").append(quantity);

        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Product other = (Product) obj;

        return Objects.equals(id, other.id);
    }
    
    @Override
    public String toString() {
        return displayDetails();
    }
}
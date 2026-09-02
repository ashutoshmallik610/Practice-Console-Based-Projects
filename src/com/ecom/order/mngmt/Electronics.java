package com.ecom.order.mngmt;

public class Electronics extends Product {

    private String brand;
    private int warrantyPeriod;

    public Electronics(String id, String name, int price,
                       int quantity, String brand, int warrantyPeriod) {

        super(id, name, price, quantity);

        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String displayDetails() {

        StringBuilder sb = new StringBuilder();

        sb.append(super.displayDetails());

        sb.append(" | Brand : ").append(brand)
          .append(" | Warranty Period : ").append(warrantyPeriod);
        
        sb.append("\n");

        return sb.toString();
    }

    public void showWarranty() {

        System.out.println( "Warranty of the " + getName() + " is : " + warrantyPeriod + " years");
    }
}
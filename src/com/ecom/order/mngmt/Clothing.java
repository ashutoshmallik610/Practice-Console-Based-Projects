package com.ecom.order.mngmt;

public class Clothing extends Product {

    private String fabric;
    private String size;

    public Clothing(String id, String name, int price,
                    int quantity, String fabric, String size) {

        super(id, name, price, quantity);

        this.fabric = fabric;
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String displayDetails() {

        StringBuilder sb = new StringBuilder();

        sb.append(super.displayDetails());

        sb.append(" | Fabric : ").append(fabric)
          .append(" | Size : ").append(size);
        
        sb.append("\n");

        return sb.toString();
    }

    public void showFabric() {

        System.out.println("Fabric of the " + getName() + " is : " + fabric);
    }
}
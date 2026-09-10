package com.shopping;

public class Clothing extends Product
{
	private String size;
	private String color;
	private String genderTarget;
	private String material;
	
	public Clothing(String productName, int price, int quantity, String size, 
			String color, String genderTarget, String material) 
	{
		super(productName, price, quantity);
		setSize(size);
		setColor(color);
		setGenderTarget(genderTarget);
		setMaterial(material);
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGenderTarget() {
		return genderTarget;
	}

	public void setGenderTarget(String genderTarget) {
		this.genderTarget = genderTarget;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Size of the Product : ").append(getSize()).append("\n");
		sb.append("Color of the Product : ").append(getColor()).append("\n");
		sb.append("For Whom : ").append(getGenderTarget()).append("\n");
		sb.append("Material Type is : ").append(getMaterial());
		
		System.out.println(sb);
	}
	
}

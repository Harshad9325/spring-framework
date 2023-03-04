package com.springcore.lifecycle;

public class Bean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public Bean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bean [price=" + price + "]";
	}
	public void init() {
		System.out.println("inside init method");
	}
	
	public void distroy() {
		System.out.println("distroy methode");
	}
	
}

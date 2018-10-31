package br.com.emarques.Model;

public class Product {

	private String name;
	private double price;

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+ "\nPrice: "+price+ "\n";
	}

}

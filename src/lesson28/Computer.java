package lesson28;

public class Computer {
	private String brand;
	private String model;
	private String color;
	private int price;

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}
	
	public void setBrand(String newBrand) {
		this.brand = newBrand;
	}
	
	public void setModel(String newModel) {
		this.model = newModel;
	}
	
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}
	
	public void print() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
	}
	
	public Computer(String brand , String model, String color, int price) {
		this.brand  =brand;
		this.model = model;
		this.color = color;
		this.price = price;
	}
}

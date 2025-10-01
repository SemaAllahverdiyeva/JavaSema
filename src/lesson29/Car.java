package lesson29;

public class Car {
	String brand;
	String model;
	int year;
	int price;

	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public Car(int price, String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public Car(String brand, String model, int year, int price) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}
}

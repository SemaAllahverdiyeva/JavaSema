package lesson29;

public class BMW extends Car {
	String color;
	boolean isElectric;

	public BMW(String brand, String model, String color, boolean isElectric) {
		super(brand, model);
		this.color = color;
		this.isElectric = isElectric;
	}

	public BMW(String brand, String model, int year, String color, boolean isElectric) {
		super(brand, model, year);
		this.color = color;
		this.isElectric = isElectric;
	}

	public BMW(int price, String brand, String model, String color, boolean isElectirc) {
		super(price, brand, model);
		this.color = color;
		this.isElectric = isElectirc;
	}

	public BMW(String brand, String model, int year, int price, String color, boolean isElectric) {
		super(brand, model, year, price);
		this.color = color;
		this.isElectric = isElectric;
	}

}

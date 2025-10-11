package lesson37;

public class Clothing implements Product {
	private String name;
	private double price;

	public Clothing(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}
}

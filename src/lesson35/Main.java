package lesson35;

public class Main {
	public static void main(String[] args) {
		Car car = new Car("model", 2013);
		Calculation.calculatePrice(car);
		System.out.println("Price: " + car.price);

	}
}

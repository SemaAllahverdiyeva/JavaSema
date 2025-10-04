package lesson35;

public class Calculation {

	public static void calculatePrice(Object obj) {
		if (obj instanceof Car) {
			Car car = (Car) obj;

			if (car.year >= 2020) {
				car.price = 30000;
			} else if (car.year >= 2000) {
				car.price = 20000;
			} else {
				car.price = 10000;
			}
		} else {
			System.out.println("obj type is not Car");
		}
	}
}
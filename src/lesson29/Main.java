package lesson29;

public class Main {
	public static void main(String[] args) {
		//BMW
		BMW car1 = new BMW("brand", "model", "color", true);
		BMW car2 = new BMW("brand", "model", 20, "color", false);
		BMW car3 = new BMW(100, "brand", "model", "color", true);
		BMW car4 = new BMW("brand", "model", 10, 01, "color", false);
	}
}

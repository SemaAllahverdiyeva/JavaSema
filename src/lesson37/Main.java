package lesson37;

public class Main {

	public static void main(String[] args) {
		Electronics phone = new Electronics("phone", 1200);
		Clothing scarf = new Clothing("scarf", 15);
		Grocery tee = new Grocery("tee" , 5);
		ShoppingCart.sum(phone, scarf, tee);
	}

}

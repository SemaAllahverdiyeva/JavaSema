package lesson31;

public class Main {
public static void main(String[] args) {
	//Car
	Car car1 = new Car("brand", "model", 0);
	Car car2 = new Car("brand", "model", 1);
	Car car3 = new Car("brand", "model", 2);
	Car car4 = new Car("brand", "model", 3);
	System.out.println(car1.toString());
	System.out.println(car2.toString());
	System.out.println(car3.toString());
	System.out.println(car4.toString());
	//Bank
	Bank b = new Bank(1127);
	b.balanceİncreasingMethod(270);
	System.out.println(b.balance);
}
}

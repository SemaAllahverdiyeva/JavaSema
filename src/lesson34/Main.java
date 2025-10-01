package lesson34;

public class Main {

	public static void main(String[] args) {
		Flyable b = new Flyable() {
			@Override
			public void fly(String name) {
				System.out.println(name);
			}
		};
		b.fly("bird");

		Flyable b2 = new Flyable() {
			@Override
			public void fly(String name) {
				System.out.println(name);
			}
		};
		b.fly("butterfly");

		Flyable e = new Flyable() {
			@Override
			public void fly(String name) {
				System.out.println(name);
			}
		};
		b.fly("eagle");

		// HomeWork

		// Rabbit and Dog
		Rabbit rabbit = new Rabbit("name", "surname", "color", 4);
		Dog dog = new Dog("name", "surname", "color", 7);

		// Computer
		Computer computer = new Computer();
		computer.setBrand("brand");
		computer.setModel("model");
		computer.setColor("color");
		computer.setPrice(1200);
		computer.printInfo();

		// Task 7, Person, Bank...

		Developer d = new Developer("name", "surname", 200);
		Teacher t = new Teacher("name", "surname", 1000);
		Driver d1 = new Driver("name", "surname", 480);
		Bank b1 = new Bank();
		b1.specialCredit(d, 2000);
		b1.specialCredit(t, 3500);
		b1.specialCredit(d1, 5000);		
	}

}

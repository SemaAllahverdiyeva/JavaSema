package lesson34;

public class Dog extends Animal {
	int speed;

	public Dog(String name, String surname, String color, int speed) {
		super(name, surname, color);
		this.speed = speed;
	}
}

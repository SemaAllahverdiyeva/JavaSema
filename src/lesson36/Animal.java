package lesson36;

public class Animal {
	String name;
	int age;

	public void sound(String sound) {
		System.out.println(sound);
	}
	
	public void eating(String food) {
		System.out.println(this.name + " eats " + food);
	}

	public void sleeping(String hour) {
		System.out.println(this.name + " sleeps at " + hour + " o'clock");
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

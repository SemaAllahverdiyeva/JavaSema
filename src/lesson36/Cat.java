package lesson36;

public class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void sound(String sound) {
		System.out.println(name + " " + sound + "s");
	}
}

package lesson33;

public class Cat implements Eatable, Runable {
	String name;
	int age;

	@Override
	public void eat(String food) {
		System.out.println("eats " + food);
	}

	@Override
	public int run(int num) {
		return num * 20;
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

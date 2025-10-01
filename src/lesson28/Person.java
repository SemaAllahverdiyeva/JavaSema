package lesson28;

public class Person {
	String name;
	String surname;
	String bhirtday;
	int age;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(int age, String bhirtday) {
		this.age = age;
		this.bhirtday = bhirtday;
	}

	public Person(String name, String surname, String bhirtday, int age) {
		this.name = name;
		this.surname = surname;
		this.bhirtday = bhirtday;
		this.age = age;
	}
}

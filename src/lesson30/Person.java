package lesson30;

public class Person {
	int id;
	String name;
	String surname;
	int age;
	String phone;
	String addres;

	public Person(int id, String name, String surname, int age, String phone, String addres) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.phone = phone;
		this.addres = addres;
	}
	
	public void printInfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(surname);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(addres);
	}
}

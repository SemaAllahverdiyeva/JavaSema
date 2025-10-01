package lesson33;

public class Animal {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
}

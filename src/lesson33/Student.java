package lesson33;

public class Student {
	private String name;
	private int age;

	public class Address {
		static String city;
		static String street;

		public Address(String city, String street) {
			this.city = city;
			this.street = street;
		}

		public static String fullAddress() {
			return city + ", " + street;
		}
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(Address.fullAddress());
	}
}

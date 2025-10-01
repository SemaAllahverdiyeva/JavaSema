package lesson30;

public class Main {

	public static void main(String[] args) {
		//Cat, Dog, Lion
		Cat cat = new Cat();
		cat.makeNoise();
		Dog dog = new Dog();
		dog.makeNoise();
		Lion lion = new Lion();
		lion.makeNoise();
		System.out.println();
		// Employee
		Employee employee = new Employee(1, "name" , "surname" , 25 , "phone" , "addres" , 1000, "department" , "username" , 123);
		employee.printInfo();
		//Person2
		Person2 person = new Person2("name","surname");
		Person2.city = "city";
		System.out.println("\n" + person.name + "\n" + person.surname + "\n" + Person2.city);
	}

}

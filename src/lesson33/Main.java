package lesson33;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("name", 2);
		System.out.println(cat.run(5));
		cat.eat("fish");

		Storage s1 = new Storage();
		Storage s2 = new Storage();
		Computer computer1 = new Computer("name", 2000, s1);
		Computer computer2 = new Computer("name", 2100, s2);

		Student student = new Student("name", 20);
		Student.Address address = student.new Address("city", "street");
		student.printInfo();
	}
}

package lesson30;

public class Employee extends Person {
	int salary;
	String department;
	String username;
	int password;

	public void printInfo() {
		super.printInfo();
		System.out.println(salary);
		System.out.println(department);
		System.out.println(username);
		System.out.println(password);
	}

	public Employee(int id, String name, String surname, int age, String phone, String address, int salary,
			String department, String username, int password) {
		super(id, name, surname, age, phone, address);
		this.salary = salary;
		this.department = department;
		this.username = username;
		this.password = password;
	}
}
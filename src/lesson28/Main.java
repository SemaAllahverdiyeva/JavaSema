package lesson28;

public class Main {

	public static void main(String[] args) {
		// Class: Worker
		Worker w1 = new Worker("name", "surname", 40);
		Worker w2 = new Worker("name", "surname", 20);
		CalculationSalary.calcuation(w1);
		System.out.println("salary: " + w1.salary);
		CalculationSalary.calcuation(w2);
		System.out.println("salary: " + w2.salary);
		
		// Class: Person
		Person p1 = new Person("name" , "surname");
		Person p2 = new Person("name" , 20);
		Person p3 = new Person("name" , "bhirtday");
		Person p4 = new Person("name" , "surname", "bhirtday" ,20 );
		
		// Class: Computer
		Computer c= new Computer("brand" , "model", "color" , 0);
	}

}

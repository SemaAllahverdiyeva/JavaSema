package lesson28;

public class CalculationSalary {
	public static void calcuation(Worker w) {
		if (w.age <= 23) {
			w.salary = 700;
		} else if (w.age >= 23 && w.age <= 30) {
			w.salary = 1400;
		} else {
			w.salary = 2000;
		}
	}
}

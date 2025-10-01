package lesson29;

public class Calculation {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int multiplication(int a, int b) {
		return a * b;
	}

	public static int exit(int a, int b) {
		return a - b;
	}

	public static int division(int a, int b) {
		return a / b;
	}

	public static int findTheResidue(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {
		System.out.println(sum(14, 7));
		System.out.println(multiplication(7, 3));
		System.out.println(division(63, 3));
		System.out.println(findTheResidue(87, 22));
	}
}

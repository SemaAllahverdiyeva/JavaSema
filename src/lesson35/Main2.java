package lesson35;

public class Main2 {
	public static void main(String[] args) {
		try {
			checkNegativeNumber(-5);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void checkNegativeNumber(int a) {
		if (a < 0) {
			throw new IllegalArgumentException("The number cannot be negative");
		}
	}
}

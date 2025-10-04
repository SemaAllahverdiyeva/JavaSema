package lesson36;

public class Task4 {
	public static void main(String[] args) {
		try {
			A();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void A() {
		B();
	}

	public static void B() {
		System.out.println(15 / 0);
	}
}

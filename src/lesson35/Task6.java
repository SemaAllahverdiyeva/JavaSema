package lesson35;

public class Task6 {

	public static void main(String[] args) {
		try {
			System.out.println(5 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}

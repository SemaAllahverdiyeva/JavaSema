package lesson36;

public class Task5 {

	public static void main(String[] args) {
		try {
			System.out.println(15/0);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}

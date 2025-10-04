package lesson36;

public class Task3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int index = 7;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		try {
			try {
				System.out.println(a / b);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}

			System.out.println(arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}

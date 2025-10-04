package lesson36;

public class Task6 {
	public static void a() throws ArithmeticException {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 9};
		try {
			System.out.println(arr[15]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		a();
	}
}

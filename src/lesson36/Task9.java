package lesson36;

public abstract class Task9 {
	public static void main(String[] args) {
		// try-catch
		System.out.println("try-catch");
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		// multi catch
		System.out.println("\nmulti catch");
		int[] arr = { 1, 2, 3, 4, 5 };
		try {
			System.out.println(arr[7]);
			System.out.println(arr[4] / 0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// finally
		System.out.println("\nfinally");
		String str = "Java";
		try {
			str.charAt(7);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally her zaman isleyir");
		}
	}
}

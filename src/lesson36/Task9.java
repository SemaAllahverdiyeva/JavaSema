package lesson36;

public abstract class Task9 {
	public static void main(String[] args) {
		//try-catch
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}

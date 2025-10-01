package lesson32;

public class Library {
	public void enter(Object obj) {
		if (obj instanceof Worker || obj instanceof Driver) {
			System.out.println("entered");
		} else {
			System.out.println("not entered");
		}
	}
}

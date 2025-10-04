package lesson36;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		try {
			a(a);
		} catch (InvalidUserInputException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void a(String a) throws InvalidUserInputException {
		if (a.isBlank() == true) {
			throw new InvalidUserInputException("blank");
		} else {
			throw new InvalidUserInputException("not blank");
		}
	}
}

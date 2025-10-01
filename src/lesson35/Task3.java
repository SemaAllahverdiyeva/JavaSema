package lesson35;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Number 2: ");
		int num2 = sc.nextInt();	
		String str = "Jules Verne est un écrivain français.";
		try {
			int qismet = num1 / num2;
			System.out.println(str.charAt(num1));
		}
		catch(ArithmeticException e) {
			System.out.println("Error: Division by zero");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Index none");
		}
		
		sc.close();
	}

}
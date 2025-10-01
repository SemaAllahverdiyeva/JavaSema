package lesson35;

import java.util.Scanner;

public class BasicTryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Number 2: ");
		int num2 = sc.nextInt();
		try {
			int qismet = num1 / num2;
			System.out.println(qismet);
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero");
		}
		sc.close();
	}
}

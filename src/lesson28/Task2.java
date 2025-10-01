package lesson28;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		sc.close();
		System.out.println(sum);
	}

}

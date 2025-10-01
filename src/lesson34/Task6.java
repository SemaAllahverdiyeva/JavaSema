package lesson34;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		for (int i = a; i < 10000; i++) {
			if(i % 9 == 0 && i % 10 == 5) {
				System.out.println(i);
			}
		}
	}

}

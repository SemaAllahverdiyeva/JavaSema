package lesson28;

public class Task1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 50; i++) {
			if (i % 4 == 0) {
				sum += i;
			}
			if (i % 6 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}

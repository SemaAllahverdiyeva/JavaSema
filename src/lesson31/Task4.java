package lesson31;

public class Task4 {
	public static void main(String[] args) {
		int a = 1;
		int sumOfOddNumbers = 0;
		int sumOfEvenNumbers = 0;
		int commonDifference = 0;
		
		while(a <= 100) {
			if(a%2 == 0) {
				sumOfEvenNumbers += a;
			}else {
				sumOfOddNumbers += a;
			}
			commonDifference = sumOfOddNumbers - sumOfEvenNumbers;
			a++;
		}
		System.out.println(commonDifference);
	}
}

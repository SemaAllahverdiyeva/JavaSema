package lesson31;

public class Bank {
	int balance = 0;

	public void balanceİncreasingMethod(int a) {
		balance += a;
	}

	public void balanceDecreaseMethod(int a) {
		balance -= a;
	}
	
	public Bank(int balance) {
		this.balance = balance;
	}
}

package lesson34;

public class Bank implements CreditAble {
	@Override
	public void credit(Person p, double amount) {
		if (p.salary > 500) {
			System.out.println("Kredit verilir.");
		} else {
			System.out.println("Kredit verilmir");
		}
	}

	@Override
	public void specialCredit(Person p, double amount) {
		if (p instanceof Developer) {
			System.out.println("Kredit verilir");
		}else {
			System.out.println("Kredit verilmir");
		}
	}

}

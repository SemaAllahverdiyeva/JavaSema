package lesson40;

import java.time.LocalDate;

public class Task7 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int year = date.getYear();
		User u1 = new User("sema" , "allahverdiyeva" , 2013);
		
		if(year - u1.birthday < 18) {
			System.out.println("Error");
		}
	}
}

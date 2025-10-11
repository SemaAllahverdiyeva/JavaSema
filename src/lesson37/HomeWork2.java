package lesson37;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HomeWork2 {
	public static void main(String[] args) {
		// 1
		LocalDate date1 = LocalDate.of(1990, 10, 12);
		LocalDate date2 = LocalDate.of(1990, 10, 23);
		if (date1.isBefore(date2)) {
			System.out.println("Date1 date2-dən sonra gəlir");
		} else if (date1.isAfter(date2)) {
			System.out.println("Date1 date2-dən əvvəl gəlir");
		} else {
			System.out.println("date1=date2");
		}
		// 2-?
		// 3
		long a = ChronoUnit.DAYS.between(date1, date2);
		System.out.println(a);
		// 4
		LocalDateTime ldt1 = LocalDateTime.now();
		LocalDateTime ldt2 = LocalDateTime.of(2025, 10, 25, 14, 17);
		long ldtf = ChronoUnit.DAYS.between(ldt1, ldt2);
		System.out.println(ldtf);
		// 5
		String dateStr = "2025-10-08 14:22:12";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime date = LocalDateTime.parse(dateStr, formatter);
		System.out.println(date);
		// 6-?
		// 7
		LocalDate d = LocalDate.of(2013, 9, 12);
		if (d.isLeapYear() == true) {
			System.out.println("Fevral 29 gündür");
		} else {
			System.out.println("Fevral 28 gündür");
		}
	}
}

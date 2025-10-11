package lesson37;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HomeWork1 {
	public static void main(String[] args) {
		// 1
		LocalDate ofMethod = LocalDate.of(2025, 10, 8);
		System.out.println(ofMethod);

		//2
		LocalDate today = LocalDate.now();
		System.out.println(today);

		// 3
		DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime t1 = LocalTime.of(3, 21, 7);
		String timeFormat = t1.format(f);

		//4
		System.out.println(timeFormat);
		LocalDateTime d = LocalDateTime.now();
		System.out.println(d);

		//5
		String dateStr = "2025-10-08";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(dateStr, formatter);
		System.out.println(date);
		
		//6
		String timeStr = "03:21:07";
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime time2 = LocalTime.parse(timeStr, formatter2);
		System.out.println(time2);
		
		//7
		LocalDate th = today.plusDays(5);
		System.out.println(th);
		
		//8
		LocalTime time = LocalTime.now();
		LocalTime a= time.minusHours(3);
		System.out.println(a);
	}
}

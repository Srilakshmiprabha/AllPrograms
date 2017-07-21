package date;

import java.time.LocalDate;

import java.time.temporal.ChronoField;

public class Dateeg {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = yesterday.plusDays(2);
		LocalDate prevmonth = date.minusMonths(1);
		LocalDate nextmonth = prevmonth.plusMonths(2);
		// LocalDateTime i =date.atTime(5,30);
		boolean h = date.isLeapYear();
		System.out.println("Today date: " + date);
		System.out.println("Yesterday date: " + yesterday);
		System.out.println("Tommorow date: " + tomorrow);
		System.out.println("prev month " + prevmonth);
		System.out.println("Tommorow date: " + nextmonth);
		System.out.println("is leap year" + h);

		LocalDate date1 = LocalDate.parse("2017-02-03");
		System.out.println(date1);
		LocalDate date2 = LocalDate.parse("2017-03-03");
		System.out.println(date2);
		System.out.println(date1.compareTo(date2));
		System.out.println(date1.get(ChronoField.YEAR));

	}
}

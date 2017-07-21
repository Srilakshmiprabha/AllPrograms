package date;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoField;

public class Offsetdatetime {
	public static void main(String[] args) {
		OffsetDateTime date = OffsetDateTime.now();
		OffsetDateTime yesterday = date.minusDays(1);
		OffsetDateTime tomorrow = yesterday.plusDays(2);
		OffsetDateTime prevmonth = date.minusMonths(1);
		OffsetDateTime nextmonth = prevmonth.plusMonths(2);
		// OffsetDateTimeTime i =date.atTime(5,30);

		System.out.println("Today date: " + date);
		System.out.println("Yesterday date: " + yesterday);
		System.out.println("Tommorow date: " + tomorrow);
		System.out.println("prev month " + prevmonth);
		System.out.println("Tommorow date: " + nextmonth);
		System.out.println(date.toLocalDate());
		 System.out.println(date.getDayOfMonth()); 
		System.out.println(date.getDayOfYear());

	}
}

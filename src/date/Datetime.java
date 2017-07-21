package date;

import java.time.temporal.ChronoField;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetime {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before Formatting: " + now);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = now.format(format);
		System.out.println("After Formatting: " + formatDateTime);
		System.out.println(now.get(ChronoField.DAY_OF_WEEK));
		System.out.println(now.get(ChronoField.DAY_OF_YEAR));
		System.out.println(now.get(ChronoField.DAY_OF_MONTH));
		System.out.println(now.get(ChronoField.HOUR_OF_DAY));
		System.out.println(now.get(ChronoField.MINUTE_OF_DAY));
		LocalDateTime datetime2 = now.minusDays(10);
		LocalDateTime datetime3 = now.plusDays(100);
		System.out.println("minus" + datetime2);
		System.out.println("plus day" + datetime3);
		System.out.println(datetime2.compareTo(datetime3));

	}
}

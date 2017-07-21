package date;

import java.time.LocalTime;
import java.time.LocalDate;

public class Timeeg {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalTime time2 = time.minusHours(5);
		LocalTime time3 = time2.minusMinutes(4);
		LocalTime time4 = time.plusHours(14);
		LocalTime time5 = time4.plusMinutes(18);
		System.out.println("current" + time);
		System.out.println("before current" + time2);
		System.out.println(" before currentmin" + time3);
		System.out.println("after current" + time4);
		System.out.println("after current min" + time5);
		System.out.println(time.compareTo(LocalTime.NOON));
		LocalTime l = LocalTime.of(12, 23, 34);
		System.out.println(l);
	}
}

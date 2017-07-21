package date;

import java.time.*;

//import java.time.YearMonth; 
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField; 
public class Yermonth {

	public static void main(String[] args) {
		YearMonth ym = YearMonth.now();
		System.out.println(ym);
		String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
		System.out.println(s);
		long l1 = ym.get(ChronoField.YEAR);
		System.out.println(l1);
		long l2 = ym.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(l2);
		YearMonth ym2 = ym.plus(Period.ofYears(2));
		System.out.println(ym2);
		YearMonth ym3 = ym.minus(Period.ofYears(2));
		System.out.println(ym3);
	}
}
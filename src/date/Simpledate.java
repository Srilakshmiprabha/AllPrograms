package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Simpledate {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = formatter.parse("31/03/2015");
			System.out.println("Date is: " + date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Date date = new Date();
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = formatter1.format(date);
		System.out.println(strDate);
	}
}

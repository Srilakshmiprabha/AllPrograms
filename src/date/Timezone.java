package date;

import java.util.*;
 
import java.util.Date; 
import java.text.DateFormat;  
public class Timezone {

	public static void main(String args[]) throws Exception {

		String[] availId = TimeZone.getAvailableIDs();

		System.out.println("Available Ids are: ");
		for (int i = 0; i < availId.length; i++) {
			System.out.println(availId[i]);
			TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata");
			System.out.println("Value of ID is: " + timezone.getID());
			Date d = DateFormat.getDateInstance().parse("31 Mar, 2015");
			System.out.println("Date is: " + d);
		}
	}
}
package date;
import java.time.*;  

import java.time.temporal.Temporal;  

public class Periodeg {
 
	  public static void main(String[] args) {  
	    Period period = Period.ofDays(24);  
	    Temporal temp = period.addTo(LocalDate.now());  
	    System.out.println(temp);  
	    period = Period.of(2017,02,16);  
	    System.out.println(period.toString()); 
	   Period period1=Period.ofMonths(5);
	    Period period2 = period1.minus(Period.ofMonths(2));  
	    System.out.println(period2);
	    period2 = period1.plus(Period.ofMonths(2));  
	    System.out.println(period2);  
}
}
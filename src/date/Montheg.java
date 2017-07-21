package date;
import java.time.*;  

public class Montheg {

	  public static void main(String[] args) {  
	    Month month = Month.from(LocalDate.now());  
	    System.out.println(month.getValue());  
	    System.out.println(month.name());  
	    System.out.println(month.minus(2));  
	    System.out.println(month.plus(2));  
	    System.out.println("Total Number of days: "+month.length(true)); 
	  }  
	  
}

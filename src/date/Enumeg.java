package date;
import java.time.*;  
import java.time.temporal.ChronoField;
public class Enumeg {
	  
  
	  public static void main(String[] args) {  
	    LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 25);  
	    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);  
	    System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));  
	    DayOfWeek day = DayOfWeek.of(5);  
	    System.out.println(day.name()); 
	    System.out.println(day.getValue()); 
	            
	    day = day.minus(3);  
	    System.out.println(day.getValue());  
	    day = day.plus(3);  
	    System.out.println(day.getValue());  
	  }  
	  }  
	


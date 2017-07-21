package date;
import java.time.*;  import java.time.temporal.*;
public class Monthday {
	 
	  public static void main(String[] args) {  
	    MonthDay month = MonthDay.now(); 
	    System.out.println(month);
	    long mof = month.get(ChronoField.MONTH_OF_YEAR);
	    System.out.println(mof);
	    long dom = month.get(ChronoField.DAY_OF_MONTH);
	    System.out.println(dom);
	    boolean b = month.isValidYear(7654); 
	    System.out.println(b);
	    ValueRange range = month.range(ChronoField.MONTH_OF_YEAR);
	    System.out.println(range);}
}
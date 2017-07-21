package date;
import java.time.Year; 
import java.time.LocalDate;  
public class Yeareg {
 
	  public static void main(String[] args) {  
	    Year y = Year.now();  
	    System.out.println(y);  
	    LocalDate l = y.atDay(123);  
	    System.out.println(l);  
	    System.out.println(y.length());  
	    System.out.println(y.isLeap());  
	    System.out.println(y.now());  
	   Year y1=Year.of(2078);
	    System.out.println(y.isAfter(y1));
	    System.out.println(y.isBefore(y1));
	  }  
	  
}

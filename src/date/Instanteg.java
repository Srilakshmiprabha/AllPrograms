package date;
import java.time.Instant;
import java.time.*; 
import java.time.temporal.ChronoUnit;

public class Instanteg {
	  
	
	  public static void main(String[] args) {  
	    Instant inst = Instant.parse("2017-02-03T10:37:30.00Z");  
	    System.out.println(inst);  
	    Instant instant = Instant.now();  
	    System.out.println(instant);    
	    instant = instant.minus(Duration.ofDays(125));  
	    System.out.println(instant);  
	    Instant inst2 = inst.plus(Duration.ofDays(125));
	    System.out.println(inst2);
	    System.out.println(inst.isSupported(ChronoUnit.DAYS));  
	    System.out.println(inst.isSupported(ChronoUnit.YEARS)); 
	    System.out.println(inst.isSupported(ChronoUnit.WEEKS)); 
		   

	  }  
	}  



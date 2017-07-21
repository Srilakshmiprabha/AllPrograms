package date;
import java.time.Clock;
import java.time.Duration;
public class Clockeg { 
 
	  public static void main(String[] args) {  
	    Clock c = Clock.systemDefaultZone();      
	    System.out.println(c.getZone());
	    c = Clock.systemUTC();  
	    System.out.println(c.instant()); 
	    Duration d = Duration.ofHours(5);  
	    Clock clock = Clock.offset(c, d);    
	    System.out.println(clock.instant());  
	  }  
	}  



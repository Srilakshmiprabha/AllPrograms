package date;
import java.time.*;  
import java.time.temporal.ChronoUnit;  

public class Durationeg {
	public static void main(String[] args) {  
	    Duration ds = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(ds.get(ChronoUnit.SECONDS)); 
	    Duration d = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d.get(ChronoUnit.SECONDS));    
	    Duration d1 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
	    System.out.println(d1.getSeconds());  
	    Duration d2 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
        System.out.println(d2.isNegative());
        Duration d3 = d1.plus(d1);  
        System.out.println(d3.getSeconds());  
	}
}

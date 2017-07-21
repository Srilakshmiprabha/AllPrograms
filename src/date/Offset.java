package date;import java.time.OffsetTime;  
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;  
public class Offset {  
  public static void main(String[] args)   {  
    OffsetTime offset = OffsetTime.now();  
    int h = offset.get(ChronoField.HOUR_OF_DAY);  
    System.out.println(h);  
    int m = offset.get(ChronoField.MINUTE_OF_DAY);  
    System.out.println(m);  
    long s = offset.get(ChronoField.SECOND_OF_DAY);  
    System.out.println(s);
    int hour = offset.getHour();  
    System.out.println(hour+ " hour");  
    int minute = offset.getMinute();  
    System.out.println(minute+ " minute");  
    ValueRange range = offset.range(ChronoField.MINUTE_OF_HOUR);
    System.out.println(range);
  }  
}  




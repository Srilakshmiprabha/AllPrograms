package exception;
class Parents extends Thread
{static int speed=22;
	public void run(){
	
	if(speed>40)
	{
		
		
		try{wait(90000);System.out.println(speed);
		assign();}catch(Exception e){System.out.println("exception");}  
		
	}/*else
	{
		assign();
	}*/
	System.out.println(speed);
	
	
}

	public void assign()
	{
		
		notify();
		speed=45;
		System.out.println(speed);
}}
public class Interthread {
public static void main(String[] args) {
	

Parents p=new Parents();

Parents c=new Parents();
p.start();

c.start();

}
}
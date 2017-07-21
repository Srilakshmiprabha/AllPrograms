package inner;

 class Example1{
static int speed=100;
//int speed=90;
static class Run
{
	int distance=80;
	void run(){
	int time=distance*speed;
System.out.println("time="+time);
}}
}
 public class Static{
	 public static void main(String[] args) {
		Example1.Run obj=new Example1.Run();
		obj.run();
	}
 }
package exception;

public class Trycatch {
	public static void main(String[] args) {
		String s=null;
		try
		{
			int m=s.length();
			System.out.println(m);
			
		}catch(Exception e){
		System.out.println("exception");
	}
finally
{
	System.out.println("finally executed");
}

}
}
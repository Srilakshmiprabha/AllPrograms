package exception;

public class Instantiation extends Create{
public static void main(String[] args)throws InstantiationException {
	try
	{
	Create c=new Create();
	

		System.out.println("trying to intialize abstract class");
	}
	catch(InstantiationException e)
	{System.out.println("abstract class cannot be instatiated");
		
	}}
	void run()
{
	System.out.println("executed without exception");
}
}
 class Create
{
	public void run();
}
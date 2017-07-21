package exception;

class Throws 
	{
	   void throwMethod() throws NullPointerException
	   {
	       System.out.println ("Inside throwMethod");
	       throw new NullPointerException("Demo"); 
	   } 
	   public static void main(String args[])
	   {Throws s=new Throws();
	       try
	       {
	         s.throwMethod();
	       }
	       catch (NullPointerException exp)
	       {
	          System.out.println ("The exception get caught" +exp);
	       }
	    }
	}



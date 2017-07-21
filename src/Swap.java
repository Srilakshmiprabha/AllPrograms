import java.util.Scanner;

public class Swap {static int a, b;
	
	int swapping(int num1,int num2)
	{
		//num2=(num1+num2)-(num1=num2); num1=
		//num1=num2;
		//System.out.println("swapped values are "+num1 +num2);
		//return num1,num2;
	
	num1=num1+num2;
	num2=num1-num2;
	return num1;
	return num2;}	
	public static void main(String[] args) {
		Swap s=new Swap();
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("enter a,b");
		a = sc.nextInt();
		b = sc.nextInt();*/
		int result=s.swapping(2,0);
		int expected=(2);
		
		}
		void test(int num1,int num2){
			if(num1==b&&num2==a)
			{
				System.out.println("test pass");}
				else{
					System.out.println("test pass");
					
			}
			
		}
		

	

}

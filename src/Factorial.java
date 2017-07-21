import java.util.Scanner;

public class Factorial {
	int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String args[]) {

		Factorial fact = new Factorial();
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("enter number"); int number = sc.nextInt();
		 * 
		 * int result = fact.factorial(number); int fact2 =
		 * fact.factorials(number); fact.run(result, fact2);
		 */
		int result = fact.factorial(5);
		int expected = 120;
		fact.run(result, expected);
		result = fact.factorial(6);
		expected = 720;
		fact.run(result, expected);
		result = fact.factorial(2);
		expected = 2;
		fact.run(result, expected);
		result = fact.factorial(3);
		expected = 20;
		fact.run(result, expected);
	}

	void run(int result, int fact2) {
		if (result == fact2) {
			System.out.println("test pass");

		} else {
			System.out.println("test fail");
		}
	}
}

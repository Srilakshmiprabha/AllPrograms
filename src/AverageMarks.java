import java.util.Scanner;

public class AverageMarks {
	char result;

	char calculate(int avg) {
		if (avg >= 90) {
			/* System.out.println("grade is A"); */
			result = 'A';

		} else if (avg >= 80 && avg < 90)

		{
			/* System.out.println("grade is B"); */result = 'B';

		} else if (avg >= 70 && avg < 80)

		{
			/* System.out.println("grade is c"); */result = 'C';

		} else

		{
			/* System.out.println("grade is D"); */result = 'D';

		}
		return result;

	}

	public static void main(String[] args) {

		/*
		 * System.out.println("ENTER MARKS");
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("enter your english marks"); int eng =
		 * sc.nextInt(); System.out.println("enter your maths marks"); int math
		 * = sc.nextInt(); System.out.println("enter your physics marks"); int
		 * physics = sc.nextInt(); sc.close(); float total = eng + math +
		 * physics; float avg = total / 3;
		 * System.out.println("your avg is"+avg);
		 * 
		 * AverageMarks g = new AverageMarks(); g.Calculate(avg); // g.run('A',
		 * result);
		 */
		AverageMarks avg = new AverageMarks();
		char result = avg.calculate(90);
		char expected = 'A';
		avg.run(result, expected);
		result = avg.calculate(110);
		expected = 'B';
		avg.run(result, expected);
		result = avg.calculate(80);
		expected = 'C';
		avg.run(result, expected);
		result = avg.calculate(10);
		expected = 'U';
		avg.run(result, expected);
	}

	public void run(char expected, char actual) {

		if (expected == actual) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}
	}

}

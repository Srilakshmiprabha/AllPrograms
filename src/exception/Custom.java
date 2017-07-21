package exception;

import java.util.Scanner;

class Engineering extends Exception

{
	Engineering(String c) {
		super(c);
	}
}

public class Custom {
	void dept(String sc, int a) throws Engineering

	{
		if (sc.length() < 2) {
			throw new Engineering("enter name not character");
		} else {
			System.out.println("your name" +" "+ sc +" "+ "num" +" "+ a);
		}

	}

	public static void main(String[] args) {

		Custom e = new Custom();
System.out.println("enter name and regno");
		Scanner s = new Scanner(System.in);
		try {
			String name = s.next();

			int regno = s.nextInt();
			e.dept(name, regno);
		} catch (Exception f)

		{
			System.out.println("exception");
		}
	}
}

package regexp;

import java.util.regex.*; 
import java.util.Scanner;

public class Regularexpression {
	public static void main(String[] args) {
		// String s="itslakshmi@gmail.com";
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Pattern pattern = Pattern
				.compile("[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})");
		Matcher match = pattern.matcher(s);
		if (match.matches()) {
			System.out.println("valid mail id");

		} else {
			System.out.println("nota valid");
		}
	}

}

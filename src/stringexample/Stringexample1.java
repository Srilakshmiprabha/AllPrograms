package stringexample;

import java.util.Scanner;

public class Stringexample1 {
	int count = 0;

	String str = new String();

	public static void main(String[] args) {
		String string = new String("This is full creative");
		// Scanner sc=new Scanner(System.in);
		// String string=sc.nextLine();
		Stringexample1 example = new Stringexample1();
		char[] d = string.toCharArray();
		char r = ' ';
		int i = 0;
		for (int j = 0; j < string.length(); j++) {
			if (d[j] == r) {
				example.run1(string.substring(0, j + 1));
				i = j;
			} else
				System.out.println(string.substring(i, j + 1));
		}

		// example.run();
	}

	void run1(String s) {

		String str2 = s;
		count++;
		if (count > 1) {
			for (int k = 0; k < s.length(); k++) {
				System.out.println(str2.substring(0, k + 1));
			}

		}
	}
}

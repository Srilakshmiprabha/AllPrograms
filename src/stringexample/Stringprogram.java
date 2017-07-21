package stringexample;

import java.util.Scanner;

public class Stringprogram {
	public static void main(String[] args) {
		String string1 = new String();
		String string2;// = new String();
		System.out.println("enter strings");
		Scanner sc = new Scanner(System.in);
		string1 = sc.next();
		string2 = sc.next();
		int j;
		char[] c = new char[10];

		char a[] = string1.toCharArray();
		char b[] = string2.toCharArray();
		for (int i = 0; i < string1.length(); i++) {
			for (j = 0; j < string2.length(); j++)

			{
				
				if (a[i] == b[j]) {
					 b[j]=' ';

				}
			}
			
				
			}System.out.println(String.valueOf(b));
		}
	}

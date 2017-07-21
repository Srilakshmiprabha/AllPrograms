package regexp1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String[] x = new String[10];
		System.out.println(x.length);
		Scanner sc = new Scanner(System.in);
		int i, j, k;
		System.out.println("enter number of strings");
		String[] s = new String[20];
		int n = sc.nextInt();
		for (i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		for (i = 0; i < n; i++) {
			String r = s[i];
			String re = new String();
			for (j = 0; j < s[i].length(); j++) {
				int m = s[i].length();
				re = re + s[i].charAt(m - j - 1);

			}
			System.out.println(re);
			if (r.equals(re)) {
				System.out.println(r + "is a palindrome");
				x[i] = r;
			} else {
				System.out.println("not a palindrome");
			}
		}

		for (k = 0; k < n; k++) {

			if (x[k].length() > x[k + 1].length()) {
				x[k]=x[k+1];
			}
		}
		System.out.println(x[k + 1] + "is largest string");

	}
}
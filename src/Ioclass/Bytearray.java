package Ioclass;

import java.io.*;

public class Bytearray {

	public static void main(String args[]) throws Exception {
		FileOutputStream fout1 = new FileOutputStream("java1.txt");
		FileOutputStream fout2 = new FileOutputStream("java2.txt");

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(fout1);
		bout.writeTo(fout2);

		bout.flush();
		bout.close();
		System.out.println("Success...");
		byte[] buf = { 95, 96, 97, 98 };

		ByteArrayInputStream byt = new ByteArrayInputStream(buf);
		int k = 0;
		while ((k = byt.read()) != -1) {

			char ch = (char) k;
			System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
		}
	}

}

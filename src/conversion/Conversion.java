package conversion;

public class Conversion {
	public static void main(String[] args) {
		String s = "77900";
		int m = 99;
		System.out.println("int to string");
		int i = Integer.parseInt(s);
		System.out.println(s + 100);
		System.out.println(i + 100);
		s = String.valueOf(i);
		System.out.println(s);
		s = Integer.toString(i);
		System.out.println(s);
		System.out.println("string to float");
		s = "99.09";
		float f = Float.parseFloat(s);
		System.out.println(s + 100);
		s = String.valueOf(f);
		System.out.println(s);
		s = Float.toString(f);
		System.out.println(s);
		System.out.println("double to string");
		s = "99.09";
		double d = Double.parseDouble(s);
		System.out.println(s + 10.90);
		s = String.valueOf(d);
		System.out.println(s);
		s = Float.toString(f);
		System.out.println(d);
		System.out.println("long to string");
		s = "9909";
		long l = Long.parseLong(s);
		System.out.println(s + 100);
		s = String.valueOf(l);
		System.out.println(s);
		s = Float.toString(l);
		System.out.println(s);

	}
}

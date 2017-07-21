import java.util.Scanner;

public class Area {
	static double square, rectangle, triangle;
	double area1, area2, area3;

	double calculate(double a) {
		area1 = a * a;
		return area1;

	}

	double calculate(double a, double b) {
		area2 = a * b;
		return area2;

	}

	double calculate(double value, double b, double c) {
		area3 = value * b * c;

		return area3;
	}

	public static void main(String[] args) {
		Area a = new Area();
		System.out.println("enter side of square");
		Scanner sc = new Scanner(System.in);

		double r = a.calculate(5);
		double e = 25.00;
		a.run(r, e);
		r = a.calculate(5, 10);
		e = 25.00;
		a.run(r, e);
		r = a.calculate(0.5, 2, 4);
		e = 4.00;
		a.run(r, e);
	}

	void run(double area1, double area2) {

		if (area1 == area2) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}
	}

}

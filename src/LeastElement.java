
public class LeastElement {
	int i;

	int least(int[] a) {
		for (i = 1; i < a.length; i++) {
			// System.out.println(a[i]);
			if (a[0] > a[i]) {
				a[0] = a[i];

			}
		}
		return a[0];

	}

	public static void main(String[] args) {
		LeastElement l = new LeastElement();
		int a[] = { 8, 9, 7, 99, 5, 90, 77, 2, 4 };

		int r = l.least(a);
		int e = 2;
		l.run(r, e);
		int b[] = { 3, 4, 5, 6 };
		r = l.least(b);
		e = 4;
		l.run(r, e);
		int c[] = { 9, 0, 855, -6 };
		r = l.least(c);
		e = -6;
		l.run(r, e);
		int d[] = { 9, 8, 6, 7,22,0 };
		r = l.least(d);
		e = 0;
		l.run(r, e);

	}

	public void run(int expected, int actual) {

		if (expected == actual) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}
	}
}
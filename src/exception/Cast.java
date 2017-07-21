package exception;

class A {
	int i = 10;
}

class B extends A {
	int add() {
		int j = 20 + i;
		return j;
	}
}

class C extends B {
	int k = 30;

	void run() {
		System.out.println("hiii");
	}
}

public class Cast {
	public static void main(String[] args) throws ClassCastException {
		System.out.println("values");
		A a = new B();

	B b = (B) a;
	int r=b.add();
	System.out.println(r);
		try {
			C c = (C) b;
			c.run();
		} catch (Exception e) {
			System.out.println("c cannot be printed");
		}

	}
}
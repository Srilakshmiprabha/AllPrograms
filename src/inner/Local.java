package inner;

class Arithmetic {

	void run() {
		System.out.println("inside a method");
		class Add {
			void display() {
				System.out.println("there is a class called local class");
			}
		}
		Add a = new Add();
		a.display();
	}
}

public class Local {
	public static void main(String[] args) {

		System.out.println("local example");
		Arithmetic ar = new Arithmetic();
		ar.run();
	}
}

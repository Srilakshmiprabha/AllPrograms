package inner;

class A {
	interface Message {
		void msg();
	}
}

public class Nested implements A.Message {
	public void msg() {
		System.out.println("Hello nested interface");
	}

	public static void main(String args[]) {
		A.Message message = new Nested();
		message.msg();
	}
}

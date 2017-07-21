package inner;

interface Showable {
	void show();

	interface Message {
		void msg();
	}
}

class Nested1 implements Showable.Message {
	public void msg() {
		System.out.println("Hello nested interface using interface");
	}

	public static void main(String args[]) {
		Showable.Message message = new Nested1();
		message.msg();
	}

}

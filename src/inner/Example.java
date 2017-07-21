package inner;

 interface Anonymous1 {
	abstract void run();
}

 public class Example {
	public static void main(String[] args) {
		Anonymous1 m = new Anonymous1() {
		public	void run() {
				System.out.println("im  Anonymous class using interface");
			}
		};
		m.run();

	}
}

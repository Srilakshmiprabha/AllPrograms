package inner;

abstract class Anonymous {
	abstract void run();

	public static void main(String[] args) {
		Anonymous m = new Anonymous() {
			void run() {
				System.out.println("im  Anonymous class");
			}
		};
		m.run();
	}
}

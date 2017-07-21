package exception;

class Exe extends Thread {
	synchronized public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i * 9);
		}
		try

		{
			Thread.sleep(400);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class Sync {
	public static void main(String[] args) {
		Exe e1 = new Exe();
		Exe e2 = new Exe();
		e1.start();
		e2.start();

	}
}

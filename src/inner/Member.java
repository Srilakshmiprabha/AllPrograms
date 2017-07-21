package inner;

  public class Member {
	int sum = 0, i;

	 class Sub {
		void run(int n) {
			for (i = 0; i < n; i++) {
				sum = sum + i;
				System.out.println(sum);
			}
		}
	}

	public static void main(String[] args) {
		Member m = new Member();
		Member.Sub m1 = m.new Sub();
		// System.out.println("enter n");

		m1.run(15);
	}
}

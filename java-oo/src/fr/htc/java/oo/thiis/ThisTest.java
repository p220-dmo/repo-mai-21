package fr.htc.java.oo.thiis;

public class ThisTest {

	private String status;;

	public ThisTest(String status) {
		this.status = status;
	}

	public static void main(String[] args) {

		ThisTest test = new ThisTest("Done");

		test.add(5, 12);
		System.out.println("out of add method" + test);

		ThisTest test2 = new ThisTest("Blocked");

		test2.add(5, 12);
		System.out.println("out of add method" + test2);

	}

	public int add(int x, int y) {
		int somme = x + y;
		System.out.println(this.status);
		System.out.println("In the add method" + this);
		return somme;
	}

}

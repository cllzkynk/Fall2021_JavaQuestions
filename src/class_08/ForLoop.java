package class_08;

public class ForLoop {

	public static void main(String[] args) {
		// FOR LOOP
		// we use it when we know in advance how many times
		// we want to perform action
		//
		// it's more organized

		// i want to say good morning 5 times

		for (int i = 5; i < 10; i++) {

			System.out.println("Good morning");
		}

		System.out.println("________I want to print numbers from 1-100_________");

		for (int in = 1; in <= 100; in++) {
			System.out.println(in);

		}

		/*
		 * for (start point; end point; increment/decrement){ code; }
		 */

		System.out.println("I want to print numbers from 10-0");

		for (int a = 10; a >= 0; a--) {
			System.out.print(a + " ");
		}

		System.out.println("________What will be the output_______");

		for (int i = 0; i < 30; i += 3) {
			System.out.println(i + " ");
		}
	}
}

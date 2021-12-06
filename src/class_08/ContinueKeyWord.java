package class_08;

public class ContinueKeyWord {

	public static void main(String[] args) {
		// continue will skip 1 iteration

		// I want to print numbers from 1 to 5 except 3;

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue; // skips 3 in this case

			}
			System.out.println(i);

		}
		System.out.println("End OF THE LOOP");

		// i want to print 1-10 but except 3&7

		for (int a = 1; a <= 10; a++) {
			if (a == 3 || a == 7) {
				continue;

			}
			System.out.println(a);
		}

	}
}
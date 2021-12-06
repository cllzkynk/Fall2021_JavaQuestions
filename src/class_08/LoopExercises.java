package class_08;

public class LoopExercises {

	public static void main(String[] args) {

		// print numbers 1-100 in 1 line with space

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println("------------100-1-----------------");

		for (int a = 100; a > 1; a--) {
			System.out.print(a + " ");
		}

		for (int b = 20; b > 0; b -= 2) {
			System.out.println(b + " ");
		}

		for (int b = 20; b > 0; b--) {
			if (b % 2 == 0) {

				System.out.println(b + " ");
			}
		}

		for (int num = 20; num <= 50; num += 3) {

			System.out.print(num + " ");
		}

		for (int num1 = 20; num1 <= 50; num1++) {
			if (num1 % 2 == 1) {
				System.out.print(num1 + " ");
			}

		}
	}

}
package class_09;

public class NestedIfLoop {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {// outer loop
			System.out.println("Hello");

			for (int y = 0; y < 3; y++) {// inner loop
				System.out.println("Bye");
			}

		}

		System.out.println("----------------MORE EXAMPLES------------------");

		for (int i = 10; i <= 14; i++) {

			for (int j = 1; j <= 4; j++) {
				System.out.println("i =" + i + " j=" + j);
			}
			System.out.println(
					"----------------how can i print numbers from 10 to 99 using nested loop------------------");

			for (int o = 1; o <= 9; o++) {
				for (int k = 0; k <= 9; k++) {
					System.out.println(o + k);
				}
			}

		}
	}
}

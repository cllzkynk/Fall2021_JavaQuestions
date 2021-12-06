package class_09;

public class ForMe {

	public static void main(String[] args) {

		for (int i = 7; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();

		}

		int rows = 7;

		for (int a = 2; a <= rows; a++) {
			for (int j = 1; j <= a; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

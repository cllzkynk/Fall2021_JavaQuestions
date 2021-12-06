package class_09;

public class NewPattern {

	public static void main(String[] args) {
		// 6 rows -outer loop controls it, 12 coloums-outer loops controls it

		for (int r = 1; r <= 6; r++) {
			for (int c = 1; c <= 12; c++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

}

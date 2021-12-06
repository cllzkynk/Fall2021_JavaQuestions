package class_09;

public class Patterns {

	public static void main(String[] args) {
		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
//				1
//				12
//				123
//				1234
		}

	}

}

package class_09;

public class BigSquare {

	public static void main(String[] args) {
		for (int r = 7; r >= 1; r--) {// we don't care what is the value of r as loong as it gives 5 rows
			for (int c = 7; c >= 1; c--) {
				System.out.print(c); // if you print r -the output will be different
			}
			System.out.println();
		}
	}
}
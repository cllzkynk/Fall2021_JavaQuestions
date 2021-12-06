package Random_;

public class Task8 {
	public static void main(String[] args) {

		int[][] numbers = { { 1, 2, 3, }, { 3, 4, 2 }, { 1, 1, 1 } };
		int sum = 0;
		for (int[] rows : numbers) {
			for (int col : rows) {
				if (col % 2 != 0) {
					sum += col;
				}
			}
		}
		System.out.println(sum);

	}
}

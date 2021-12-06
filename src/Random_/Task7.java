package Random_;

public class Task7 {

	public static void main(String[] args) {
		int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 11, 12, 13 }

		};
		for (int[] rows : numbers) {
			for (int num : rows) {
				if (num % 2 == 0) {
					System.out.println(num);
				}
			}
		}

	}

}

package class_11;

public class ArraysAccessingalValuesfrom2DArray {

	public static void main(String[] args) {
		char[][] $array = new char[3][4];

		// add values to 1st row
		$array[0][0] = 'A';
		$array[0][1] = 'B';
		$array[0][2] = 'C';
		$array[0][3] = 'D';

		// add values to 2nd row
		$array[1][0] = 'W';
		$array[1][1] = 'X';
		$array[1][2] = 'Y';
		$array[1][3] = 'Z';

		// add values to 3st row
		$array[2][0] = 'Q';
		$array[2][1] = 'W';
		$array[2][2] = 'B';
		$array[2][3] = 'R';

		System.out.println($array.length); // 3 it will tell you how many array you have in big array

		for (int row = 0; row < $array.length; row++) {// loops through rows -length of rows is 3
			for (int col = 0; col < $array[row].length; col++) { // length =4, cause we have A B C D -4 elements

				System.out.print($array[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("_________________________________________________________________");

		int[][] array = { { 10, 20, 30 }, { 1, 2, 3 }, { 100, 200, 300 }, };

		for (int i = 0; i < array.length; i++) { // array.length -how many arrays you have (1,2,3 -with indexes 0,1,2)
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("The size of array of int = " + array.length);

	}

}

package class_11;

public class Arrays2D1 {

	public static void main(String[] args) {
		// new char [rows] [columns]

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

		System.out.println($array[1][3]);// Z

		System.out.println("ANOTHER WAY TO CREATE A 2D ARRAY");

		int[][] array = { { 10, 20, 30 }, { 1, 2, 3 }, { 100, 200, 300 }, };
		System.out.println(array[2][1]);// 200
		System.out.println(array[0][0]);// 10

		System.out.println("The size of array of int = " + array.length);

	}

}

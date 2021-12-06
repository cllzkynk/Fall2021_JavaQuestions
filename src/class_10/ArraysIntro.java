package class_10;

public class ArraysIntro {
	public static void main(String[] args) {
		// arrays in java
		// arrays are containers that store data /values of same type
		// I have 5 students in the class and need
		// to calculate the average score

		int[] grades = new int[5];
		grades[0] = 98;
		grades[1] = 80;
		grades[2] = 89;
		grades[3] = 67;
		grades[4] = 77; // arrays are data structures

		int average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / 5;
		System.out.println("Average score of my students = " + average);

		int a = 10;
		int b;
		b = 10;

		double[] array; // -declaring an array
		array = new double[3]; // initialising

		array[0] = 12.99;
		array[1] = 10.89; // we forgot to put the last value that's why the output is 0.0 (because of the
							// double value

		System.out.println("Value of last element = " + array[2]);
		array[2] = 5.99;
		System.out.println("Value of last element = " + array[2]);

		// array[3] = 7;
		// System.out.println(array[3]); // ArrayIndexOutOfBoundsException: 3

		System.out.println("---------------LIQUID----------------------");

		String[] liquid = new String[4];// arrays are fixed in size, if you put 4 -you cannot save more
		liquid[2] = "Water";
		liquid[1] = "TEa";

		System.out.println(liquid[0]); // output -null, cause we didn't give the index for it

	}

}

package class_11;

public class TaskAtClassLargestNumber {

	public static void main(String[] args) {
		// find the largest number in array

		int[] array = { 10, 0, 20, 8, -1, 77, 56 };
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];

			}
		}
		System.out.println("The largest number from as array is " + max);

	}

}

package class_10;

public class ProjectTask4MaxAndMInNumbersInArray {

	public static void main(String[] args) {
		System.out.println("___________LARGEST AND SMALLEST NUMBER IN THE ARRAY________________");

		int[] array = { -10, 10, 11, 18, 3, 75 };
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}

		}
		int min = array[0];
		for (int j = 1; j > array.length; j++) {
			if (array[j] < min) {
				min = array[j];
			}
		}

		System.out.println("The largest number from as array is " + max);
		System.out.println("The smallest number from as array is " + min);

	}
}

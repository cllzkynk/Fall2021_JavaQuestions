package class_08;

public class NestedLoops {

	public static void main(String[] args) {
		// inside loop-inner loop
		// outside loop- outer

		/*
		 * inner loop has a dependency on outer
		 */

		for (int i = 1; i < 3; i++) {
			System.out.println("I am an outer loop");
			for (int y = 0; y <= 3; y++) {

				System.out.println("I am an inner loop");
			}
		}

	}

}

package class_10;

public class RewievNestedLoops {

	public static void main(String[] args) {

		boolean condition = true;

		while (condition) {
			System.out.println("I am while loop");

			for (int i = 1; i < 8; i++) {
				System.out.println("i am for loop");
				break;

			}
			System.out.println("-----------------------------------------");
		}

	}
}
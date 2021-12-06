package class_08;

public class BreakKeyWord {

	public static void main(String[] args) {

		// break

		for (int i = 1; i < 4; i++) {
			System.out.println("hello");
			break;
			// it breaks our loop

			// we want to print numbers 1-10
		} // when number is 5 we want to break the loop

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
			
		}

	}

}

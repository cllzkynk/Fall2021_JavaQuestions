package reviewClass_3;

public class LogicalOperators {

	public static void main(String[] args) {

		int number = 0;

		if (number >= 0) {
			if (number <= 100) {
				System.out.println("NUmber is between 0 and 100");
			} else {
				System.out.println("Number is between 0 and 100 ");
			}
		} else {
			System.out.println("Number is ot between 0 and 100");

		}

		if (number >= 0 && number <= 100) {
			System.out.println("NUmber is between 0 and 100");

		}

	}

}

package class_06;

public class NotOperator1 {

	public static void main(String[] args) {
		boolean isJavaEasy = false;

		if (!isJavaEasy) {
			System.out.println("Please, try to spend more time with Java");
		}
		System.out.println("----------------------------||-------------------------");

		String day = "Saturday";

		if (!(day.equals("Sunday") || day.equals("Saturday"))) { // !true and we're allowed to go inside the code
			System.out.println("I'm going to work");

		}

		System.out.println("-----------------------&&------INCORRECT OPERATOR------------------------");

		String day1 = "Sunday";

		if (!(day1.equals("Sunday") && day1.equals("Saturday"))) {

			System.out.println("I'm going to work");// day cannot be saturday and sunday at the same time
													// && operator should not be used in this situation
		}
	}
}

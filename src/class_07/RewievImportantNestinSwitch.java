package class_07;

public class RewievImportantNestinSwitch {

	public static void main(String[] args) {
		String timeOfDay = "Morning";
		String day = "Saturday";

		switch (timeOfDay) {

		case "Morning":
			System.out.println("Good morning");

			switch (day) {
			case "Saturday":
				System.out.println("It's java class");
				break;

			/// case"Monday and so on

			}

			break;
		case "Noon":
			System.out.println("Good afternoon");
			break;

		case "Evening":
			System.out.println("Good evening");

			break;
		case "Night":
			System.out.println("Good night");

			break;

		default:
			System.out.println("Invalid input");

		}

	}

}

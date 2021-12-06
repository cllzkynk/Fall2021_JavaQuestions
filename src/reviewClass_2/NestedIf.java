package reviewClass_2;

public class NestedIf {
	public static void main(String[] args) {
		String name = "Marta";
		String pass = "pass123";
		double accountBalance = 10.25;
		double transferAmount = 8;
		boolean transAllowed = true;

		if (pass == "pass123") {
			System.out.println("Welcome to Syntax bank");
			if (transAllowed) {
				System.out.println("Initiazing transfer");
			} else {
				System.out.println("You're not eligible for transfer");
			}
			if (transferAmount > accountBalance) {
				System.out.println("Incuffisient balance");
			} else {
				System.out.println("TRansfer complete");
			}

		} else {
			System.out.println("Invalid credentials, please try again");
		}

	}
}
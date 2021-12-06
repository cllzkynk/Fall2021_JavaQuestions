package class_07;

public class taskOnWhileLoopAtHome {

	public static void main(String[] args) {

		boolean workday = true;
		int day = 1;

		while (workday) {

			if (day < 6) {
				System.out.println("I need a day off");

			} else {
				System.out.println("I'm off");
				workday = false;
			}

			day++;
		}

	}
}
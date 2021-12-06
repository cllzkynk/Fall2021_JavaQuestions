package class_07;

public class TaskOnWhileLoop {

	public static void main(String[] args) {
		boolean workDay = true;
		int day = 1;

		while (day < 6) {

			System.out.println("I need a day off");
			day++;

			if (day >= 6) {
				System.out.println("I don't need a day off any more");
			}
		}

	}

}

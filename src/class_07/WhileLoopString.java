package class_07;

public class WhileLoopString {

	public static void main(String[] args) {
		String day = "Saturday";

		if (day.equals("Saturday")) {
			System.out.println("My fav java class");
		}
		while (day.equals("Saturday")) {
			System.out.println("My fav java class");
			day = "Sunday";

		}
		System.out.println("_________________________________________________________");

		boolean isItBreakTime = true;

		if (isItBreakTime) {
			System.out.println("I will get tea");// 1
		}

		while (isItBreakTime) {
			System.out.println("I will get tea");// infinite

		}
	}

}

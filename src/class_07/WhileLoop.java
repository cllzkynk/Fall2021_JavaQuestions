package class_07;

public class WhileLoop {

	public static void main(String[] args) {

		int time = 13;
		if (time > 12) { // condition is true and if code executes once
			System.out.println("Good day");
		}

		System.out.println("----------------WHILE LOOP--------------");
		while (time > 12) {
			System.out.println("Good day");// the condition is also true so that's why the code executes INFINITE

			// in order for the loop to stop , we need to add some counter variable
			// we'll keep decrementing time

			// we decreasing time by 1, the cond is true only one time now

		}

	}
}

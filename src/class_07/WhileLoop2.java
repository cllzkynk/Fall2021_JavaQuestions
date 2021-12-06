package class_07;

public class WhileLoop2 {

	public static void main(String[] args) {
		int time1 = 15;
		while (time1 > 12) {
			System.out.println("Good day");
			time1--; // the code executes 3 times, cause the condition is true three times
		}

		int time2 = 15;
		while (time2 > 12) {
			System.out.println("Good day");
			time2--; // the code will not execute because conditions is false
		}

		int time3 = 15;
		while (time3 > 12) {
			System.out.println("Good day");
			time3++; // the code will execute INFINITE times cause the condition is ALWAYS true
		}

	}
}
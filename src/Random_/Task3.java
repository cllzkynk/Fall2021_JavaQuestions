package Random_;

public class Task3 {

	public static void main(String[] args) {
		// Fibonacci numbers 0 1 1 2 3 5 8 13 21
		int num1, num2, num3;
		num1 = 0;
		num2 = 1;
		System.out.print(num1 + " " + num2 + " ");

		for (int i = 0; i < 9; i++) {
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;

		}

	}
}
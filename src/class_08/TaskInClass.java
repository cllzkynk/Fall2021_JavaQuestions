package class_08;

public class TaskInClass {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum = sum + i;

		}
		System.out.println(sum);

		int a;
		for (a = 1; a < 6; a++) {
			System.out.println("Value of a inside the loop " + a);
		}
		System.out.println("Value of outside " + a);

		System.out.println("-----------------------------------------------");

		int result = 1;
		for (int i = 10; i >= 1; i -= 2) {
			result *= i;

			System.out.println(result);
		}

	}
}
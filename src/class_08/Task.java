package class_08;

public class Task {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 1; a <= 50; a++) {

			if (a % 2 == 0) {
				sum += a;
			}
		}
		System.out.println(sum);

		int sum1 = 0;
		for (int b = 1; b <= 50; b++) {

			if (b % 2 == 1) {
				sum1 += b;
			}
		}
		System.out.println(sum1);

		System.out.println("______ANOTHER WAY_________");

		int sum11 = 0;
		int sum2 = 0;

		for (int n = 1; n < 51; n++) {
			if (n % 2 == 0) {
				sum11 = n + sum11;
			} else {
				sum2 = n + sum2;
			}
		}
		System.out.println("The sum of even number from 1 to 50 is " + sum11);
		System.out.println("The sum of even number from 1 to 50 is " + sum2);

	}
}

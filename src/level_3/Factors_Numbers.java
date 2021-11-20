package level_3;

/*
 * @author CELÝL
 *
 */
public class Factors_Numbers {

	public static void main(String[] args) {

		int number = 96;

		System.out.println("Factors of " + number + " are :");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}

		}

	}

}

package level_3;

/*
 * @author CELÝL
 *
 */
public class NaturalNumberSumRecursion {
	public static void main(String[] args) {
		// Girilen sayiyi iki asal sayinin toplami seklinde yazilip yazilmadigini
		// kontrol

		int num = 34;

		boolean flag = false;

		for (int i = 2; i <= num / 2; i++) {
			if (checkPrimeNumber(i)) {
				if (checkPrimeNumber(num - i)) {
					System.out.println(num + " = " + i + " + " + (num - i));
					flag = true;
				}

			}

		}
		if (flag) {
			System.out.println(num + " can be expressed as the sum of two prime numbers");
		}

	}

	public static boolean checkPrimeNumber(int i) {
		boolean sign = true;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				sign = false;
				break;
			}
		}

		return sign;

	}

}

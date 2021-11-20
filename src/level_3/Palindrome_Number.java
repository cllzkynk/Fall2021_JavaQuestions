package level_3;

/**
 * @author CELÝL
 *
 */
public class Palindrome_Number {
	public static void main(String[] args) {

		int num = 152;
		int rev = 0;
		int candidate = num;

		while (num != 0) {
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;

		}
		if (candidate == rev) {
			System.out.println(candidate + " is a palindrome");
		} else {
			System.out.println(candidate + " is not a palindrome");
		}

	}

}

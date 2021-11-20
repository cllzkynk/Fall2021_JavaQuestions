package level_3;

/*
 * @author CELİL
 *
 */
public class Recursive_Factorial {
	public static void main(String[] args) {

		System.out.println(factorial(6));

	}

	public static int factorial(int num) {
		if (num > 1) {
			return num * factorial(num - 1);

		} else {
			return 1;
		}
	}

}

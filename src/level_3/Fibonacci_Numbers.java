package level_3;

/*
 * @author CELÝL
 *
 */
public class Fibonacci_Numbers {
	public static void main(String[] args) {

		int first = 0;
		int second = 1;
		System.out.print(first + " " + second + " ");
		for (int i = 2; i <= 16; i++) {
			int third = first + second;
			first = second;
			second = third;
			System.out.print(third + " ");
		}

	}

}

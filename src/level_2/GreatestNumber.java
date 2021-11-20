package level_2;

public class GreatestNumber {

	public static void main(String[] args) {
		int a = 30;
		int b = 19;
		int c = 17;

		if (a > b && a > c) {
			System.out.println(a + " is the maximum number");
		} else if (b > a && b > c) {
			System.out.println(b + " is the maximum number");
		} else {
			System.out.println(c + " is the maximum number");
		}

	}

}

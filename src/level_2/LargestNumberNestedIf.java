package level_2;

public class LargestNumberNestedIf {

	public static void main(String[] args) {
		int a = 8200;
		int b = 99700;
		int c = 9600;

		if (a >= b) {
			if (a >= c) {
				System.out.println("a is greatest ");
			} else {
				System.out.println("c is greatest ");
			}

		} else {
			if (b >= c) {
				System.out.println("b is greatest ");
			} else {
				System.out.println("c is greatest ");
			}
		}

	}

}

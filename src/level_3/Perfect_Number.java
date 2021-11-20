package level_3;

public class Perfect_Number {

	public static void main(String[] args) {
		System.out.println("Below are all perfect numbers till 10000");
		for (int i = 2; i < 10000; i++) {
			if (isPerfect(i)) {
				System.out.println(i + " is a perfect number");
			}

		}
	}// last of main

	public static boolean isPerfect(int i) {
		int sum = 0;
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				sum = sum + j;
			}

		}
		if (sum == 2 * i && i != 1)
			return true;

		return false;
	} // last of method

} // last of class

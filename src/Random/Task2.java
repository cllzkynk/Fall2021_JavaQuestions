package Random_;

public class Task2 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
//		A prime number is a whole number greater than 1 whose only factors are 1 and itself.
//		2, 3, 5, 7, 11, 13, 17 ...
		int num = 22;
		boolean boo = true;
		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					boo = false;
					break;
				}
			}

		} else {
			boo = false;
		}
		System.out.println(+num + " is it a prime number? " + boo);

	}

}

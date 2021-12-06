package class_08;

public class MultiplicationTable {

	public static void main(String[] args) {

		int num1 = 3;
		int num = 0;
		int mult;

		for (num = 1; num <= 10; num++) {
			mult = num1 * num;
			System.out.println(num1 + "*" + num + " = " + mult);

		}
	}
}
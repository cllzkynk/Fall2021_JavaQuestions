package Random_;

public class Task1 {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 3;

		num1 += num2;
		num2 = num1 - num2;
		num1 -= num2;

		System.out.println("The number num1 = " + num1);
		System.out.println("The number num2 = " + num2);

	}

}

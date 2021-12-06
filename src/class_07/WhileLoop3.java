package class_07;

public class WhileLoop3 {
	public static void main(String[] args) {
		// print numbers 10 -50

		System.out.print("------------PRINTING NUMBERS 1-50--------------");

		int num = 0;
		while (num <= 50) {
			System.out.print(num + " ");
			num++;
		}

		System.out.print("-----------------PRINTING 10-60-------------------");

		int a = 10;
		while (a < 61) {
			System.out.print(a + " ");
			a++;
		}

		System.out.println("----------------PRINTING 100-60------------------------------");

		int b = 100;
		while (b >= 60) {
			System.out.println(b + " ");
			b--;
		}

	}
}
package class_07;

public class whileLoop6 {

	public static void main(String[] args) {
		// print numbers 100-1(odd numbers only)

		int e = 99;
		while (e > 0) {
			System.out.println(e + " ");
			e -= 2;
		}
		System.out.println("----ANOTHER WAY-----");

		int f = 99;
		while (f > 0) {
			if ((f % 2) != 0) {

				System.out.println(f + " ");
			}
			f--;

		}

	}
}
package class_07;

public class evenUnevenWhileLoop {

	public static void main(String[] args) {
		// print from 10-30 only even numbers

		int c = 10;
		while (c < 31) {

			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
			c++;
		}
		System.out.println("_______ANOTHER WAY_______");
		int d = 10;
		while (d <= 30) {
			System.out.print(d + " ");
			d += 2;
		}

	}
}
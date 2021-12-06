package class_07;

public class whileLoop5 {

	public static void main(String[] args) {

		int c = 10;
		while (c < 31) {
			System.out.println("I'm inside loop");

			if (c % 2 == 0) {
				System.out.print(c + " ");
				c++; // -if we keep increment here it will be infinite

			}
			// c++;
		}
	}

}

package class_09;

public class Task66OneMoreTry {

	public static void main(String[] args) {
		int a;

		for (a = 1; a <= 10; a++) {
			System.out.print(a + " ");
		}
		System.out.println();

		for (int b = 2; b <= 20; b += 2) {
			System.out.print(b + " ");
		}
		System.out.println();

		for (int c = 3; c <= 30; c += 3) {
			System.out.print(c + " ");
		}
		System.out.println();

		for (int d = 4; d <= 40; d += 4) {

			System.out.print(d + " ");
		}
		System.out.println();

		for (int e = 5; 5 <= 50; e += 5) {

			System.out.print(e + " ");
			if (e == 50) {
				break;
			}

		}

	}
}

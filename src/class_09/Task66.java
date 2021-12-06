package class_09;

public class Task66 {

	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10
		// 2 4 6 8 10 12 14 16 18 20
		// 3 6 9 12 15 18 21 24 27 30
		// 4 8 12 16 20 24 28 32 36 40
		// 5 10 15 20 25 30 35 40 45 50

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int a = 2; a <= 20; a++) {
			if (a % 2 == 0) {
				System.out.println(a + " ");
			}

			for (int b = 3; b <= 30; b++) {
				if (b % 3 == 0) {
					System.out.println(b + " ");

				}

				for (int c = 4; c <= 40; c++) {
					if (c % 4 == 0) {
						System.out.println(c + " ");
					}

				}

				for (int d = 5; d <= 50; d++) {
					if (d % 5 == 0) {
						System.out.print(d + " ");
					}
					;
				}

			}
		}
	}
}
package recursive;

import java.util.Scanner;

public class UsAlma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir taban Girin: ");
		int taban = scan.nextInt();
		System.out.println("Bir us Girin: ");
		int us = scan.nextInt();

		// islem(taban, us);
		
		System.out.println(islem(taban, us));
		scan.close();
	}

	private static int islem(int x, int y) {
		if (x == 0)
			return 1;
		if (x > 0 && y == 0)
			return 1;
		if (x > 0 && y == 1)
			return x;
		if (x > 0 && y > 1)
			return islem(x,(y - 1)) * x;

      return 0;
	}
}
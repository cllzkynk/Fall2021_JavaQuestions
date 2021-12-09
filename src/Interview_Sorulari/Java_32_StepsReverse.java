package InterviewSorulari;

import java.time.Year;

public class Java_32_StepsReverse {

	public static void main(String[] args) {
		// StepsReverse

		yol1();
		System.out.println("===========================================");
		yol2();

	}

	private static void yol2() {
		int i=1;
		while (i<=6) {
			int j=5;
			while(j>=i) {
				System.out.print(j+" ");
				j--;
			}
			System.out.println();

			i++;
		}
	}

	private static void yol1() {
		for(int x = 1; x<=6; x++) {
			for(int y=5; y>=x; y--) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

	}

}

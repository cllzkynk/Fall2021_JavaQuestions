package InterviewSorulari;

public class Java_31_StepsRegular {

	public static void main(String[] args) {

		// StepsRegular
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		yol1();
		System.out.println("=============================================");
		yol2();
	}

	private static void yol2() {
		int i=1;
		while (i<=5) {
			int j=1;
			while(j<=i) {
				System.out.print(j+" ");
				j++;
			}
			System.out.println();

			i++;
		}


	}

	private static void yol1() {
		for(int x = 1; x<=5; x++) { // satir sayisi
			for(int y=1; y<=x; y++) { // sutun saysi
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}
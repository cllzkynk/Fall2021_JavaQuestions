package level_3;

public class ForKare {




	public static void main(String[] args) {
		int i, j;
		for (int k = 0; k <= 0; k++) {
			for (i = 1; i <= 13; i++) {
				for (j = 1; j <= 13; j++) {
					if (i %4== 1 ||  j %4== 1 ) {
						System.out.print(" * ");
					} else {
						System.out.print("   ");
					}
					if (j == 17) {
						System.out.println();
					}
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}

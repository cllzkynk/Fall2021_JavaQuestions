package class_09;

public class PrintingPatternsBestWay {

	public static void main(String[] args) {
		// rows -controlled by outer loop 4 rowss
		// coloums -inner loops 6 coloums
		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= 6; c++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

}

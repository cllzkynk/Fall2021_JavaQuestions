package recursive_;

public class Tribonacci {

	public static void main(String[] args) {
		
		//tribonacci(sayi);
		//System.out.println(tribonacci(sayi)); bu 15. terimi yazdirir.
		
		for (int i = 0; i < 15; i++) {
			System.out.print(tribonacci(i)+"  ");
		}
	}

	public static int tribonacci(int sayi) {

		if (sayi == 0) {
			return 0;

		}
		if (sayi == 1 || sayi == 2) {
			return 1;

		} else {
			return tribonacci(sayi - 1) + tribonacci(sayi - 2) + tribonacci(sayi - 3);
		}
	}

}

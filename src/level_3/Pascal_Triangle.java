package level_3;

public class Pascal_Triangle {

	public static void main(String[] args) {
		int n = 7;
		printPascal(n);

	}

	public static void printPascal(int n) {
		for (int line = 0; line < n; line++) {
			for (int j = 0; j <2*(n-line); j++) {
				System.out.print(" ");
			}
			
			for (int i = 0; i <= line; i++) {
				
				System.out.print(pattern(line, i) +"   " );
			}
			System.out.println();
		}

	}

public static int pattern(int n, int k) {
		int result = 1;
		if (k > n - k)     k = n - k;
			for (int i = 0; i < k; i++) {
				result *= (n - i);
				result /= (i + 1);
			}

		

		return result;
	}

}

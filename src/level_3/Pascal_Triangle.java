package level_3;

public class Pascal_Triangle {

	public static void main(String[] args) {
		int n = 7; // kac yukluginde olsun ? 
		Pascal(n);

	}

	public static void Pascal(int n) {
		for (int line = 0; line < n; line++) {
			for (int j = 0; j <2*(n-line); j++) {
				System.out.print(" ");
			}
			
			for (int i = 0; i <= line; i++) {
				
				System.out.print(formul(line, i) +"   " );
			}
			System.out.println();
		}

	}

public static int formul(int n, int k) {
		int result = 1;
		if (k > n - k)     k = n - k;
			for (int i = 0; i < k; i++) {
				result *= (n - i);
				result /= (i + 1);
			}

		

		return result;
	}

}

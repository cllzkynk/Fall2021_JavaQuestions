package recursive_;

import java.util.Scanner;

public class Interview_Questions_07 {

	public static void main(String[] args) {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
		Scanner scan = new Scanner(System.in);
		System.out.println("Kac fib istiyon ");
		int adim = scan.nextInt();
		int onceki = 1;
		int suAnki = 1;

		System.out.println("Verimsiz fib");

		for (int i = 0; i <= adim; i++) { // fib fonksiyonu verimsiz bi koddur cunku hesapladiklarini tekrar hesaplamak
											// zorunda
			System.out.print(fib_Eforlu(i) + " ");
		}

		System.out.println("\nVerimli fib_Verimli");
		for (int i = 0; i <= adim; i++) {
			System.out.print(fib_Verimli(i, onceki, suAnki) + " "); // bu kod daha verimli cunku hesapladiklarini tekrar
																	// hesaplamiyor
		}

		scan.close();
	}

	private static int fib_Verimli(int n, int onceki, int suAnki) {
		if (n == 0)
			return 0;
		if (n <= 1)
			return onceki;
	//	System.out.println();
		//System.out.println("N==>"+n+"\n ONCEKI==>"+onceki+"\nSONRAKI==>"+suAnki);
		return fib_Verimli(n - 1, suAnki, onceki + suAnki);

	}

	private static int fib_Eforlu(int a) {
		if (a == 0)
			return 0;
		if (a == 1)
			return 1;

		return fib_Eforlu(a - 1) + fib_Eforlu(a - 2);
	}

}

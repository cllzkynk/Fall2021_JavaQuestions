package recursive;

public class FayansSayisiBul {
	/*
	 * Bir NXM alaný verildi . 2 i X 2 i boyutunda sonsuz sayýda karoya sahipsiniz ,
	 * burada i = 0, 1, 2,… böyle devam eder. Görev, verilen alaný fayanslarla
	 * doldurmak için gereken minimum fayans sayýsýný bulmaktýr. Örnekler:
	 * 
	 * 
	 * Giriþ : N = 5, M = 6. Çýkýþ : 9 5 X 6'lýk alan minimum 9 karo ile
	 * kaplanabilir. 6 karo 1 X 1, 2 karo 2 X 2, 1 karo 4 X 4.
	 */

	public static void main(String[] args) {
		int n = 8, m = 6;
        System.out.println(minFyns(n, m));
	}

	private static int minFyns(int n, int m) {
		//// temel durum, alan 0 olduðunda.
		if (n == 0 || m == 0)
		        return 0;
		 else if (n % 2  == 0 && m % 2 == 0)
		        return minFyns(n / 2, m / 2);
		 else if (n % 2 == 0 && m % 2 == 1)
		        return (n + minFyns(n / 2, m / 2));
		 else if (n % 2 == 1 && m % 2 == 0)
		        return (m + minFyns(n / 2, m / 2)); 
		 else
		        return (n + m - 1 + minFyns(n / 2, m / 2));
	
	}
}

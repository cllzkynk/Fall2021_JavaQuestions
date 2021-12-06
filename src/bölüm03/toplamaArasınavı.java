package bölüm03;
import java.util.Scanner;

public class toplamaArasýnavý {
	public static void main(String[] args) {

		int sayý1 = (int) (Math.random() * 10);
		int sayý2 = (int) (Math.random() * 10);
		// 0 <= Math.random < 1

		System.out.println(sayý1 + " + " + sayý2 + " = ?");

		Scanner klavye = new Scanner(System.in);

		int toplam = klavye.nextInt();

		System.out.println(sayý1 + sayý2 == toplam);// bu iki sayýnýn toplamýnýn bizim girdiðimiz sayýya eþit olup
													// olmadýðýný gösteriyor
		if (sayý1 + sayý2 == toplam) {
			System.out.println("doðru cevap");
		} else {
			System.out.println("yanlýþ cevap");
		}
	}

}

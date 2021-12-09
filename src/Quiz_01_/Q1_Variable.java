package Quiz.Quiz_01;

public class Q1_Variable {

	public static void main(String[] args) {
		/*
		 * isim ve soyisim icin iki variable olusturun ve bunlari 
		 * isminiz : Mehmet
		 * soyisminiz : Memo seklinde yazdirin
		 */

		String isim = "Mehmet";
		String soyisim = "Memo";

		System.out.println("Isminiz : " + isim);
		System.out.println("Soyisminiz : " + soyisim);

		// Iki farkli tamsayi data turunde 2 variable olusturun
		// bunlarin toplamini yazdirin

		int sayi1 = 10;
		byte sayi2 = 20;

		System.out.println(sayi1 + sayi2);

		// Bir tamsayi ve bir ondalikli variable olusturun ve
		// bunlarin toplamini yazdirin

		int sayi3 = 10;
		double sayi4 = 20.3;
		System.out.println(sayi3 + sayi4);

		// char data turunde bir variable olusturun ve yazdirin

		char karakter = '?';
		System.out.println(karakter);

		// Bir tamsayi, bir de char degisken olusturun ve
		// bunlarin toplamini yazdirin.

		int sayi5 = 10;
		char karakter1 = '?';
		System.out.println(sayi5 + karakter1); // 10+? olmasi gerekirken
		// ascii devreye girdi

	}

}

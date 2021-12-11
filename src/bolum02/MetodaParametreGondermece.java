package bolum02 ;

public class MetodaParametreGondermece {
	public static void main(String[] args) {
		int s1 = 5;
		int s2 = 88888;
		System.out.println("Yer de�i�tirmeden �nce s1: " + s1 + " s2: " + s2);
		yerDegistir(s1, s2);
		System.out.println("Yer de�i�tirmeden �nce s1: " + s1 + " s2: " + s2);
		
	}

	private static void yerDegistir(int sayi1, int sayi2) {
		System.out.println("Yer de�i�tirmeden �nce sayi1: " + sayi1 + " sayi2: " + sayi2);
		int gecici = sayi1;
		sayi1 = sayi2;
		sayi2 = gecici;
		
		System.out.println("Yer de�i�tirmeden sonra sayi1: " + sayi1 + " sayi2: " + sayi2);
		
	}

	

}

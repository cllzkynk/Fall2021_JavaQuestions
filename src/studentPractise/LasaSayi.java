package studentPractise;

public class LasaSayi {

	public static void main(String[] args) {
		int lasa_sayac = 0;
		for (int i = 2; i < 10000; i++) {
			if (asal_kontrol(i) && asal_kontrol(ters_yazma(i))) {
				lasa_sayac++;
			}
		}
		System.out.println(lasa_sayac);
	}

	public static boolean asal_kontrol(int sayi) {
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int ters_yazma(int sayi) {
		int ters = 0;
		while (sayi > 0) {
			ters *= 10;
			ters += sayi % 10;
			sayi /= 10;
		}
		return ters;
	}
}
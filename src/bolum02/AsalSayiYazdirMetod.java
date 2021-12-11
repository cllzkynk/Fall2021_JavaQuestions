package bolum02 ;

public class AsalSayiYazdirMetod {
	public static void main(String[] args) {
		int asalSayiSayaci = 0;
		int sayi = 2;
		while (asalSayiSayaci < 1000) {
			if (asalMi(sayi)) {
				System.out.printf("%5d",sayi);//%4d nin manas� say�y� 4 basamak i�inde yazakt�r demek.
				asalSayiSayaci++;
				if (asalSayiSayaci % 10 == 0) {
					System.out.println();
				}
			}
			sayi++;
		}
	}

	private static boolean asalMi(int sayi) {

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				return false;
			}

		}
		return true;
	}
}
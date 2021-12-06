package bölüm06;

public class AsalSayıYazdırMetod {
	public static void main(String[] args) {
		int asalSayıSayacı = 0;
		int sayı = 2;
		while (asalSayıSayacı < 1000) {
			if (asalMı(sayı)) {
				System.out.printf("%5d",sayı);//%4d nin manası sayıyı 4 basamak içinde yazaktır demek.
				asalSayıSayacı++;
				if (asalSayıSayacı % 10 == 0) {
					System.out.println();
				}
			}
			sayı++;
		}
	}

	private static boolean asalMı(int sayı) {

		for (int i = 2; i < sayı; i++) {
			if (sayı % i == 0) {
				return false;
			}

		}
		return true;
	}
}
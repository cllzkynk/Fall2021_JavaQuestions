package bölüm08;

public class ÝkiBoyutluDiziÝþlemleri {

	public static void main(String[] args) {
		int[][] ikiBoyutluDizi = new int[10][10];

		rassalDegerlerdeDoldur(ikiBoyutluDizi);
		diziyiYazdýr(ikiBoyutluDizi);
		dizininElemanlarýnýTopla(ikiBoyutluDizi);
		dizininSütunlarýndakiElemanlarýnToplamý(ikiBoyutluDizi);
		dizininHangiSatýrýnýnToplamýDahaBüyüktür(ikiBoyutluDizi);
		ikiBoyutluDiziyiKar(ikiBoyutluDizi);
		diziyiYazdýr(ikiBoyutluDizi);
	}


	public static void rassalDegerlerdeDoldur(int[][] ikiBoyutluDizi) {
		for (int satýr = 0; satýr < ikiBoyutluDizi.length; satýr++) {
			for (int sütun = 0; sütun < ikiBoyutluDizi[satýr].length; sütun++) {
				ikiBoyutluDizi[satýr][sütun] = (int) (Math.random() * 100);
			}
		}
	}

	public static void diziyiYazdýr(int[][] ikiBoyutluDizi) {
		for (int satýr = 0; satýr < ikiBoyutluDizi.length; satýr++) {
			for (int sütun = 0; sütun < ikiBoyutluDizi[satýr].length; sütun++) {
				System.out.printf("%3d", ikiBoyutluDizi[satýr][sütun]);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");

		for (int[] w : ikiBoyutluDizi) {
			for (int k : w) {
				System.out.printf("%3d", k);
			}
			System.out.println();
		}

	}

	private static void dizininElemanlarýnýTopla(int[][] ikiBoyutluDizi) {
		int toplam = 0;
		for (int satýr = 0; satýr < ikiBoyutluDizi.length; satýr++) {
			for (int sütun = 0; sütun < ikiBoyutluDizi[satýr].length; sütun++) {
				toplam += ikiBoyutluDizi[satýr][sütun];
			}
		}
		System.out.println("Dizideki elemanlarýn toplamý " + toplam);

		int toplamForEach = 0;

		for (int[] w : ikiBoyutluDizi) {
			for (int k : w) {
				toplamForEach += k;
			}

		}
		System.out.println("Dizideki elemanlarýn toplamý for each ile " + toplamForEach);
	}

	private static void dizininSütunlarýndakiElemanlarýnToplamý(int[][] ikiBoyutluDizi) {
		int toplam = 0;
		for (int i = 0; i < ikiBoyutluDizi.length; i++) {
			for (int j = 0; j < ikiBoyutluDizi[i].length; j++) {
				toplam += ikiBoyutluDizi[j][i];

			}
			System.out.println(i + 1 + ". sutunun toplamý = " + toplam);
			toplam = 0;
		}

	}

	private static void dizininHangiSatýrýnýnToplamýDahaBüyüktür(int[][] ikiBoyutluDizi) {
		int enBüyükToplamSatýr = 0;
		int satýrToplamý = 0;
		int kaçýncýSatýr = 0;
		for (int satýr = 0; satýr < ikiBoyutluDizi.length; satýr++) {
			for (int sütun = 0; sütun < ikiBoyutluDizi.length; sütun++) {
				satýrToplamý += ikiBoyutluDizi[satýr][sütun];
			}
			if (enBüyükToplamSatýr < satýrToplamý) {
				enBüyükToplamSatýr = satýrToplamý;
				kaçýncýSatýr = satýr + 1;
			}
			satýrToplamý = 0;

		}
		System.out.println("Satýr toplamlarýnýn en Büyüðü " + kaçýncýSatýr + ". satýrdýr ve toplamý : " + enBüyükToplamSatýr);
	}
	
	private static void ikiBoyutluDiziyiKar(int[][] ikiBoyutluDizi) {
		for (int satýr = 0; satýr < ikiBoyutluDizi.length; satýr++) {
			for (int sütun = 0; sütun < ikiBoyutluDizi[satýr].length; sütun++) {
				int rassalSatýr = (int)(Math.random() * ikiBoyutluDizi.length);
				int rassalSütun = (int)(Math.random() * ikiBoyutluDizi[satýr].length);
				
				int geçici = ikiBoyutluDizi[satýr][sütun];
				ikiBoyutluDizi[satýr][sütun] = ikiBoyutluDizi[rassalSatýr][rassalSütun];
				ikiBoyutluDizi[rassalSatýr][rassalSütun] = geçici;
				
				
			}		
		}
		
	}
}

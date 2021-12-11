package bolum02 ;
import java.util.Arrays;
import java.util.Scanner;

public class DiziislemleriMetot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int dizininUzunlugu = 10;
		int[] dizi = new int[dizininUzunlugu];

			
		
		diziyiRassalSayilarlaDoldur(dizi);
		
		//diziyiYazdir(dizi);	
		System.out.println(Arrays.toString(dizi));
		System.out.println();
		
		dizininToplaminiBul(dizi);

		dizininEnByukElemaniniVeIndeksiniBul(dizi);

		diziyiKaristir(dizi);
		System.out.println();
		
		diziyiYazdir(dizi);
		
		diziyiSolakaydir(dizi);
		System.out.println();
		
		diziyiYazdir(dizi);
	
		
	}

	public static void diziyiSolakaydir(int[] dizi) {
		int ilkEleman = dizi[0];
		for (int i = 0; i < dizi.length - 1; i++) {
			dizi[i] = dizi[i + 1];

		}
		dizi[dizi.length - 1] = ilkEleman;
	}

	public static void diziyiKaristir(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			int rassalindex = (int) (Math.random() * dizi.length);
			int gecici = dizi[i];
			dizi[i] = dizi[rassalindex];
			dizi[rassalindex] = gecici;
		}
	}

	public static void dizininEnByukElemaniniVeIndeksiniBul(int[] dizi) {
		int enBuyukEleman = 0;
		int index = 0;
		for (int i = 0; i < dizi.length; i++) {
			if (enBuyukEleman < dizi[i]) {
				enBuyukEleman = dizi[i];
				index = i;
			}
		}
		System.out.println("Dizinin en b�y�k eleman� : " + enBuyukEleman);
		System.out.println("Dizinin en b�y�k eleman�n indexi : " + index);
	}

	public static void dizininToplaminiBul(int[] dizi) {
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplam += dizi[i];
		}
		System.out.println("Dizideki elemanlar�n toplam� : " + toplam);
	}

	public static void diziyiYazdir(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%3d", dizi[i]);
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
	}

	private static void diziyiRassalSayilarlaDoldur(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 100);
		}
	}

}

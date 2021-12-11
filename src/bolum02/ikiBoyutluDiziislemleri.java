package bolum02;

public class ikiBoyutluDiziislemleri {

	public static void main(String[] args) {
		int[][] ikiBoyutluDizi = new int[10][10];

		rassalDegerlerdeDoldur(ikiBoyutluDizi);
		diziyiYazdir(ikiBoyutluDizi);
		dizininElemanlariniTopla(ikiBoyutluDizi);
		dizininSutunlarindakiElemanlarinToplami(ikiBoyutluDizi);
		dizininHangiSatirininToplamiDahaBuyuktur(ikiBoyutluDizi);
		ikiBoyutluDiziyiKar(ikiBoyutluDizi);
		diziyiYazdir(ikiBoyutluDizi);
	}


	public static void rassalDegerlerdeDoldur(int[][] ikiBoyutluDizi) {
		for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
				ikiBoyutluDizi[satir][sutun] = (int) (Math.random() * 100);
			}
		}
	}

	public static void diziyiYazdir(int[][] ikiBoyutluDizi) {
		for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
				System.out.printf("%3d", ikiBoyutluDizi[satir][sutun]);
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

	private static void dizininElemanlariniTopla(int[][] ikiBoyutluDizi) {
		int toplam = 0;
		for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
				toplam += ikiBoyutluDizi[satir][sutun];
			}
		}
		System.out.println("Dizideki elemanlar�n toplam� " + toplam);

		int toplamForEach = 0;

		for (int[] w : ikiBoyutluDizi) {
			for (int k : w) {
				toplamForEach += k;
			}

		}
		System.out.println("Dizideki elemanlar�n toplam� for each ile " + toplamForEach);
	}

	private static void dizininSutunlarindakiElemanlarinToplami(int[][] ikiBoyutluDizi) {
		int toplam = 0;
		for (int i = 0; i < ikiBoyutluDizi.length; i++) {
			for (int j = 0; j < ikiBoyutluDizi[i].length; j++) {
				toplam += ikiBoyutluDizi[j][i];

			}
			System.out.println(i + 1 + ". sutunun toplam� = " + toplam);
			toplam = 0;
		}

	}

	private static void dizininHangiSatirlarinToplamiDahaBuyuktur(int[][] ikiBoyutluDizi) {
		int enBuyukToplamSatir = 0;
		int satirToplami = 0;
		int kacinciSatir = 0;
		for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutluDizi.length; sutun++) {
				satirToplami += ikiBoyutluDizi[satir][sutun];
			}
			if (enBuyukToplamSatir < satirToplami) {
				enBuyukToplamSatir = satirToplami;
				kacinciSatir= satir + 1;
			}
			satirToplami = 0;

		}
		System.out.println("Sat�r toplamlar�n�n en B�y��� " + kacinciSatir + ". sat�rd�r ve toplam� : " + enBuyukToplamSatir );
	}
	
	private static void ikiBoyutluDiziyiKar(int[][] ikiBoyutluDizi) {
		for (int satir = 0;satir < ikiBoyutluDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
				int rassalSatir = (int)(Math.random() * ikiBoyutluDizi.length);
				int rassalSutun = (int)(Math.random() * ikiBoyutluDizi[satir].length);
				
				int gecici = ikiBoyutluDizi[satir][sutun];
				ikiBoyutluDizi[satir][sutun] = ikiBoyutluDizi[rassalSatir][rassalSutun];
				ikiBoyutluDizi[rassalSatir][rassalSutun] = gecici;
				
				
			}		
		}
		
	}

    private static void dizininHangiSatirininToplamiDahaBuyuktur(int[][] ikiBoyutluDizi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

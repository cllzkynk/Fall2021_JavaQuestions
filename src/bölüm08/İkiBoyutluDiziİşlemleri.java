package b�l�m08;

public class �kiBoyutluDizi��lemleri {

	public static void main(String[] args) {
		int[][] ikiBoyutluDizi = new int[10][10];

		rassalDegerlerdeDoldur(ikiBoyutluDizi);
		diziyiYazd�r(ikiBoyutluDizi);
		dizininElemanlar�n�Topla(ikiBoyutluDizi);
		dizininS�tunlar�ndakiElemanlar�nToplam�(ikiBoyutluDizi);
		dizininHangiSat�r�n�nToplam�DahaB�y�kt�r(ikiBoyutluDizi);
		ikiBoyutluDiziyiKar(ikiBoyutluDizi);
		diziyiYazd�r(ikiBoyutluDizi);
	}


	public static void rassalDegerlerdeDoldur(int[][] ikiBoyutluDizi) {
		for (int sat�r = 0; sat�r < ikiBoyutluDizi.length; sat�r++) {
			for (int s�tun = 0; s�tun < ikiBoyutluDizi[sat�r].length; s�tun++) {
				ikiBoyutluDizi[sat�r][s�tun] = (int) (Math.random() * 100);
			}
		}
	}

	public static void diziyiYazd�r(int[][] ikiBoyutluDizi) {
		for (int sat�r = 0; sat�r < ikiBoyutluDizi.length; sat�r++) {
			for (int s�tun = 0; s�tun < ikiBoyutluDizi[sat�r].length; s�tun++) {
				System.out.printf("%3d", ikiBoyutluDizi[sat�r][s�tun]);
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

	private static void dizininElemanlar�n�Topla(int[][] ikiBoyutluDizi) {
		int toplam = 0;
		for (int sat�r = 0; sat�r < ikiBoyutluDizi.length; sat�r++) {
			for (int s�tun = 0; s�tun < ikiBoyutluDizi[sat�r].length; s�tun++) {
				toplam += ikiBoyutluDizi[sat�r][s�tun];
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

	private static void dizininS�tunlar�ndakiElemanlar�nToplam�(int[][] ikiBoyutluDizi) {
		int toplam = 0;
		for (int i = 0; i < ikiBoyutluDizi.length; i++) {
			for (int j = 0; j < ikiBoyutluDizi[i].length; j++) {
				toplam += ikiBoyutluDizi[j][i];

			}
			System.out.println(i + 1 + ". sutunun toplam� = " + toplam);
			toplam = 0;
		}

	}

	private static void dizininHangiSat�r�n�nToplam�DahaB�y�kt�r(int[][] ikiBoyutluDizi) {
		int enB�y�kToplamSat�r = 0;
		int sat�rToplam� = 0;
		int ka��nc�Sat�r = 0;
		for (int sat�r = 0; sat�r < ikiBoyutluDizi.length; sat�r++) {
			for (int s�tun = 0; s�tun < ikiBoyutluDizi.length; s�tun++) {
				sat�rToplam� += ikiBoyutluDizi[sat�r][s�tun];
			}
			if (enB�y�kToplamSat�r < sat�rToplam�) {
				enB�y�kToplamSat�r = sat�rToplam�;
				ka��nc�Sat�r = sat�r + 1;
			}
			sat�rToplam� = 0;

		}
		System.out.println("Sat�r toplamlar�n�n en B�y��� " + ka��nc�Sat�r + ". sat�rd�r ve toplam� : " + enB�y�kToplamSat�r);
	}
	
	private static void ikiBoyutluDiziyiKar(int[][] ikiBoyutluDizi) {
		for (int sat�r = 0; sat�r < ikiBoyutluDizi.length; sat�r++) {
			for (int s�tun = 0; s�tun < ikiBoyutluDizi[sat�r].length; s�tun++) {
				int rassalSat�r = (int)(Math.random() * ikiBoyutluDizi.length);
				int rassalS�tun = (int)(Math.random() * ikiBoyutluDizi[sat�r].length);
				
				int ge�ici = ikiBoyutluDizi[sat�r][s�tun];
				ikiBoyutluDizi[sat�r][s�tun] = ikiBoyutluDizi[rassalSat�r][rassalS�tun];
				ikiBoyutluDizi[rassalSat�r][rassalS�tun] = ge�ici;
				
				
			}		
		}
		
	}
}

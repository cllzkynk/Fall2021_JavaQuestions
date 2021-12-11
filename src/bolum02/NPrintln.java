package bolum02 ;

public class NPrintln {
	public static void main(String[] args) {
		nPrintln("Merhaba java! ", 33);
	}

	static void nPrintln(String mesaj, int donguSaysu) {
		int kacDefaDondu = 0;
		for (int j = 0; j < donguSaysu; j++) {
			
			System.out.println(mesaj);
			kacDefaDondu ++;
			
		}
		System.out.println("Toplam  " + kacDefaDondu + " adet yazd�");

	}

}

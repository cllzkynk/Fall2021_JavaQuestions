package b�l�m06;

public class NPrintln {
	public static void main(String[] args) {
		nPrintln("Merhaba java! ", 33);
	}

	static void nPrintln(String mesaj, int d�ng�Says�) {
		int ka�DefaD�nd� = 0;
		for (int j = 0; j < d�ng�Says�; j++) {
			
			System.out.println(mesaj);
			ka�DefaD�nd� ++;
			
		}
		System.out.println("Toplam  " + ka�DefaD�nd� + " adet yazd�");

	}

}

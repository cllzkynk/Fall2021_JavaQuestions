package bölüm06;

public class NPrintln {
	public static void main(String[] args) {
		nPrintln("Merhaba java! ", 33);
	}

	static void nPrintln(String mesaj, int döngüSaysı) {
		int kaçDefaDöndü = 0;
		for (int j = 0; j < döngüSaysı; j++) {
			
			System.out.println(mesaj);
			kaçDefaDöndü ++;
			
		}
		System.out.println("Toplam  " + kaçDefaDöndü + " adet yazdı");

	}

}

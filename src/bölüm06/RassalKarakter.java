package b�l�m06;

public class RassalKarakter {

	public static char rassalKarakterBul(char ch1, char ch2) {
		return (char) (Math.random() * (ch2 - ch1 + 1) + ch1);

	}

	public static char b�y�kHarfBul() {
		return rassalKarakterBul('A', 'Z');
	}
	
	public static char k���kHarfBul() {
		return rassalKarakterBul('a', 'z');
	}
	
	public static char rakamBul() {
		return rassalKarakterBul('0', '9');
	}
	
	public static char herhangiBirKarakterBul() {
		return rassalKarakterBul('\u0000', '\uFFFF');
	}
}

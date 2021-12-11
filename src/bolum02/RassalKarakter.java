package bolum02 ;

public class RassalKarakter {

	public static char rassalKarakterBul(char ch1, char ch2) {
		return (char) (Math.random() * (ch2 - ch1 + 1) + ch1);

	}

	public static char buyukHarfBul() {
		return rassalKarakterBul('A', 'Z');
	}
	
	public static char kucukHarfBul() {
		return rassalKarakterBul('a', 'z');
	}
	
	public static char rakamBul() {
		return rassalKarakterBul('0', '9');
	}
	
	public static char herhangiBirKarakterBul() {
		return rassalKarakterBul('\u0000', '\uFFFF');
	}
}

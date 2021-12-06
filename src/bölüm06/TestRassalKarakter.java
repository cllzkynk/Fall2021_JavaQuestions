package bölüm06;

public class TestRassalKarakter {
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) {
			System.out.print(RassalKarakter.büyükHarfBul() + " ");
		}
		System.out.println();
		for(int i = 0; i < 20; i++) {
			System.out.print(RassalKarakter.küçükHarfBul() + " ");
		}
		System.out.println();
		for(int i = 0; i < 20; i++) {
			System.out.print(RassalKarakter.rakamBul() + " ");
		}
		System.out.println();
		for(int i = 0; i < 20; i++) {
			System.out.print(RassalKarakter.herhangiBirKarakterBul() + " ");
		}
	}

}

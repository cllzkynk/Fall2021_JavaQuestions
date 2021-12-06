package b�l�m07;

public class DizidekiHarfleriSay {
	public static void main(String[] args) {
		char[] karakterDizisi = rassalDiziOlu�tur();
		//System.out.println(karakterDizisi);
		karakterDizisiniYazd�r(karakterDizisi);
		
		int[] sayac = harfleriSay(karakterDizisi);
		sayac�Yazd�r(sayac);
	}

	private static void sayac�Yazd�r(int[] sayac) {
		System.out.println("Syac yazd�r�l��yor");
		for (int i = 0; i < sayac.length; i++) {
			System.out.print((char)('a' + i) + ":" + sayac[i] + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		
	}

	private static int[] harfleriSay(char[] karakterDizisi) {
		int[] sayac = new int[26];
		for (int i = 0; i < karakterDizisi.length; i++) {
			sayac[karakterDizisi[i] - 'a'] ++;
		}
		return sayac;
	}

	private static void karakterDizisiniYazd�r(char[] karakterDizisi) {
            for (int i = 0; i < karakterDizisi.length; i++) {
				System.out.print(karakterDizisi[i] + " ");
				if ((i + 1) % 20 == 0) {
					System.out.println();
				}
			}		
	}

	private static char[] rassalDiziOlu�tur() {
		char[] dizi = new char[100];
		
		for (int i = 0; i < dizi.length; i++) {
			
			dizi[i] = rassalKarakterBul();
			
			
		}
		
		return dizi;
	}

	public static char rassalKarakterBul() {
		return (char)((int)(Math.random() * ('z' - 'a' + 1)) + 'a');
	}

}

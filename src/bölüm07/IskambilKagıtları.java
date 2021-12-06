package bölüm07;

public class IskambilKagýtlarý {
	public static void main(String[] args) {
		String[] tipDizisi = {"Karo", "Maça", "Sinek", "Kupa"};
		String[] sayýDizisi = {"As","2","3","4","5","6","7","8","9","10","Vale","Kýz","Papaz"};
		
		int[] iskambilDestesi = new int[52];
		
		for (int i = 0; i < iskambilDestesi.length; i++) {
			iskambilDestesi[i] = i;
		}
		
		for (int i = 0; i < iskambilDestesi.length; i++) {
			int rassalindex = (int)(Math.random() * 52);
			
			int geçici = iskambilDestesi[i];
			iskambilDestesi[i] =iskambilDestesi[rassalindex];
			iskambilDestesi[rassalindex] = geçici;
		}
		
		for (int i = 0; i < 4; i++) {
		//	System.out.println(iskambilDestesi[i]);
			String tip = tipDizisi[iskambilDestesi[i] / 13];
			String sayý = sayýDizisi[iskambilDestesi[i] / 13];
			System.out.println(tip + " - " + sayý);
		}

}
}
package b�l�m07;

public class IskambilKag�tlar� {
	public static void main(String[] args) {
		String[] tipDizisi = {"Karo", "Ma�a", "Sinek", "Kupa"};
		String[] say�Dizisi = {"As","2","3","4","5","6","7","8","9","10","Vale","K�z","Papaz"};
		
		int[] iskambilDestesi = new int[52];
		
		for (int i = 0; i < iskambilDestesi.length; i++) {
			iskambilDestesi[i] = i;
		}
		
		for (int i = 0; i < iskambilDestesi.length; i++) {
			int rassalindex = (int)(Math.random() * 52);
			
			int ge�ici = iskambilDestesi[i];
			iskambilDestesi[i] =iskambilDestesi[rassalindex];
			iskambilDestesi[rassalindex] = ge�ici;
		}
		
		for (int i = 0; i < 4; i++) {
		//	System.out.println(iskambilDestesi[i]);
			String tip = tipDizisi[iskambilDestesi[i] / 13];
			String say� = say�Dizisi[iskambilDestesi[i] / 13];
			System.out.println(tip + " - " + say�);
		}

}
}
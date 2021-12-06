package bölüm06;

public class MetodaParametreGöndermece {
	public static void main(String[] args) {
		int s1 = 5;
		int s2 = 88888;
		System.out.println("Yer deðiþtirmeden önce s1: " + s1 + " s2: " + s2);
		yerDeðiþtir(s1, s2);
		System.out.println("Yer deðiþtirmeden önce s1: " + s1 + " s2: " + s2);
		
	}

	private static void yerDeðiþtir(int sayý1, int sayý2) {
		System.out.println("Yer deðiþtirmeden önce sayý1: " + sayý1 + " sayý2: " + sayý2);
		int geçici = sayý1;
		sayý1 = sayý2;
		sayý2 = geçici;
		
		System.out.println("Yer deðiþtirmeden sonra sayý1: " + sayý1 + " sayý2: " + sayý2);
		
	}

	

}

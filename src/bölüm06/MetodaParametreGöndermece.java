package b�l�m06;

public class MetodaParametreG�ndermece {
	public static void main(String[] args) {
		int s1 = 5;
		int s2 = 88888;
		System.out.println("Yer de�i�tirmeden �nce s1: " + s1 + " s2: " + s2);
		yerDe�i�tir(s1, s2);
		System.out.println("Yer de�i�tirmeden �nce s1: " + s1 + " s2: " + s2);
		
	}

	private static void yerDe�i�tir(int say�1, int say�2) {
		System.out.println("Yer de�i�tirmeden �nce say�1: " + say�1 + " say�2: " + say�2);
		int ge�ici = say�1;
		say�1 = say�2;
		say�2 = ge�ici;
		
		System.out.println("Yer de�i�tirmeden sonra say�1: " + say�1 + " say�2: " + say�2);
		
	}

	

}

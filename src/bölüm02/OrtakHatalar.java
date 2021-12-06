package bölüm02;

public class OrtakHatalar {

	public static void main(String[] args) {
		int value = 2147483647 + 1;// integer taþmasý oldu..
		System.out.println(value);

		long l = 3_000_000_000L;
		value = (int) l;// yine int taþmasý oldu.Ýlk 32 bit i koydu..gerisi sýðmadý
		System.out.println(value);
		
		boolean  b = 3 < 5;
		System.out.println(b);
		

	}

}

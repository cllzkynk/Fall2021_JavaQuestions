package bolum02 ;

public class TurDonustur {
	public static void main(String[] args) {
		int i = 5;

		long l = i;
		// i = l; // hata verir..��nk� long int e d�n��mez.

		i = (int) l; // sorun ortadan kalkt�.long int a daraltt�k.d�n��t�rd�k.
		System.out.println(i);
		System.out.println(l);

		l = 2148000000L;
		i = (int) l;// long' un ilk 32 bitini atar.gerisini atamaz.Sonuc sacma sapan birsey olur
		// long u int a atayacaksak e�er long un i�indeki sayin�n int a s��aca��na emin
		// olmam�z laz�m.

		System.out.println(i);
		System.out.println(l);

		int sayi = 2_147_483_647;
		sayi = sayi + 1;;
		System.out.println(sayi);// int tasmas� oldu.��nk� +1 ile yeni sayi int. daki 32 bit e s��mad�.

		byte b = 127;
		b++;
		System.out.println(b);
		
		sayi = (int)(3 * 5L);
		System.out.println(sayi);
		
		sayi += 4.5;
		System.out.println(sayi);// sayi = (int)(sayi + 4.5)
	}

}

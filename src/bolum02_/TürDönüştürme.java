package bolum02_�l�m02;

public class T�rD�n��t�rme {
	public static void main(String[] args) {
		int i = 5;

		long l = i;
		// i = l; // hata verir..��nk� long int e d�n��mez.

		i = (int) l; // sorun ortadan kalkt�.long int a daraltt�k.d�n��t�rd�k.
		System.out.println(i);
		System.out.println(l);

		l = 2148000000L;
		i = (int) l;// long' un ilk 32 bitini atar.gerisini atamaz.Sonuc sacma sapan birsey olur
		// long u int a atayacaksak e�er long un i�indeki say�n�n int a s��aca��na emin
		// olmam�z laz�m.

		System.out.println(i);
		System.out.println(l);

		int say� = 2_147_483_647;
		say� = say� + 1;;
		System.out.println(say�);// int tasmas� oldu.��nk� +1 ile yeni say� int. daki 32 bit e s��mad�.

		byte b = 127;
		b++;
		System.out.println(b);
		
		say� = (int)(3 * 5L);
		System.out.println(say�);
		
		say� += 4.5;
		System.out.println(say�);// say� = (int)(say� + 4.5)
	}

}

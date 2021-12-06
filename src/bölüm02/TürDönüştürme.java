package bölüm02;

public class TürDönüþtürme {
	public static void main(String[] args) {
		int i = 5;

		long l = i;
		// i = l; // hata verir..çünkü long int e dönüþmez.

		i = (int) l; // sorun ortadan kalktý.long int a daralttýk.dönüþtürdük.
		System.out.println(i);
		System.out.println(l);

		l = 2148000000L;
		i = (int) l;// long' un ilk 32 bitini atar.gerisini atamaz.Sonuc sacma sapan birsey olur
		// long u int a atayacaksak eðer long un içindeki sayýnýn int a sýðacaðýna emin
		// olmamýz lazým.

		System.out.println(i);
		System.out.println(l);

		int sayý = 2_147_483_647;
		sayý = sayý + 1;;
		System.out.println(sayý);// int tasmasý oldu.çünkü +1 ile yeni sayý int. daki 32 bit e sýðmadý.

		byte b = 127;
		b++;
		System.out.println(b);
		
		sayý = (int)(3 * 5L);
		System.out.println(sayý);
		
		sayý += 4.5;
		System.out.println(sayý);// sayý = (int)(sayý + 4.5)
	}

}

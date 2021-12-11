package bolum02 ;

public class KarakterVeriTipiVeKarakterSinifi{
	public static void main(String[] args) {
		char ch = 'A';
		int i = ch;// Kabul etti.��nk� ch 16 bit bir say�d�r(Asci tablosu)
		System.out.println(ch);

		System.out.println((int) ch);// A n�n asc�� tablosundaki kar��l���n� g�r�r

		System.out.println(i);

		ch++;

		System.out.println((int)ch);// binary rakam� 1 artt� ve onun karakter kar��l��� B oldu.

		System.out.println("merhaba \"java\" s�n�f�");// String i�inde "" yapt�k \\ ile
		System.out.println("\\t");

		char ch2 = (char) 65.25;
		System.out.println(ch2);

		char ch3 = '\u0041';
		System.out.println(ch3);

		ch3 = 65;
		System.out.println(ch3);

		byte b = (byte) '\uFF04';
		System.out.println(b);// char �(16 bit) byte(8 bit) daraltt�k.FF leri almad�.04 � ald�.
		// burada veri kayb� oldu..ama sorun ya�amad�k.Ancak sorun ya�anma ihtimali
		// var..
		// dikkat etmek laz�m..

		int c = '2' + '3';
		/*
		 * 2 karekterinin ascideki desimal kar��l���:50 3 kaekterinin ascideki desimal
		 * kar��l���:51 sonu� desimal olarak 101. 101 in karekter kar��l��� asciide e
		 * dir A�a��da sonu� g�z�k�yor..
		 */
		System.out.println(c);
		char d = '2' + '3';
		System.out.println(d);

		int e = 2 + '3';// say� olarak 2 yle 3 karekternin desimal kar��l���n� toplar
		                //3 karekterinin desimal kar��l��� 51 dir.

		System.out.println(e);
		
		System.out.println("merhaba " + 'R');
		System.out.println('r' + " merhaba");

	}

}

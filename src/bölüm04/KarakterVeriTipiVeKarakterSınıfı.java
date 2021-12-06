package bölüm04;

public class KarakterVeriTipiVeKarakterSýnýfý {
	public static void main(String[] args) {
		char ch = 'A';
		int i = ch;// Kabul etti.Çünkü ch 16 bit bir sayýdýr(Asci tablosu)
		System.out.println(ch);

		System.out.println((int) ch);// A nýn ascýý tablosundaki karþýlýðýný görür

		System.out.println(i);

		ch++;

		System.out.println((int)ch);// binary rakamý 1 arttý ve onun karakter karþýlýðý B oldu.

		System.out.println("merhaba \"java\" sýnýfý");// String içinde "" yaptýk \\ ile
		System.out.println("\\t");

		char ch2 = (char) 65.25;
		System.out.println(ch2);

		char ch3 = '\u0041';
		System.out.println(ch3);

		ch3 = 65;
		System.out.println(ch3);

		byte b = (byte) '\uFF04';
		System.out.println(b);// char ý(16 bit) byte(8 bit) daralttýk.FF leri almadý.04 ü aldý.
		// burada veri kaybý oldu..ama sorun yaþamadýk.Ancak sorun yaþanma ihtimali
		// var..
		// dikkat etmek lazým..

		int c = '2' + '3';
		/*
		 * 2 karekterinin ascideki desimal karþýlýðý:50 3 kaekterinin ascideki desimal
		 * karþýlýðý:51 sonuç desimal olarak 101. 101 in karekter karþýlýðý asciide e
		 * dir Aþaðýda sonuç gözüküyor..
		 */
		System.out.println(c);
		char d = '2' + '3';
		System.out.println(d);

		int e = 2 + '3';// sayý olarak 2 yle 3 karekternin desimal karþýlýðýný toplar
		                //3 karekterinin desimal karþýlýðý 51 dir.

		System.out.println(e);
		
		System.out.println("merhaba " + 'R');
		System.out.println('r' + " merhaba");

	}

}

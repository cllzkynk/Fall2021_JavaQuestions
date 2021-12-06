package bölüm02;

public class MatematikselÝfadeyiKodaDönüþtür {
	public static void main(String[] args) {

		double x = 1;
		double y = 1;
		double a = 1;
		double b = 1;
		double c = 1;

		double sonuç = (3 + 4 * x) / 5 - (10 * (y - 5) * (a + b + c)) / x + 9 * (4 / x + (9 + x) / y);
		System.out.println(sonuç);
		
		int i = 3 + 4 * 4 + 5 * (4 + 3) - 1;
		System.out.println(i);
		
		System.out.println(5 / 2 * 2);// sonucu 4 hesapladý.çünkü int olarak algýladý.tamsayý yani
		
		System.out.println(5 * 2 / 2);// sonuc 5 tir.Çünkü iþlemi soldan saða doðru yapýyor
		
		System.out.println(5.0 / 2 * 2);// double olarak algýladýðý için hesabý doðru yaptý
		
		
	}

}

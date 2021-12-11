package bolum02 ;

public class BasitMetot {

	public static void main(String[] args) {
        System.out.println("1 den 10 a kadar olan sayilar�n toplam�: " + toplam(1, 10));
        System.out.println("15 den 44 a kadar olan sayilar�n toplam�: " + toplam(15, 44));
        System.out.println("30 den 33 a kadar olan sayilar�n toplam�: " + toplam(30, 33));
        System.out.println("3 ile 5 in carpim� = " + carpim(3, 5));
        System.out.println(MaxSayiDon.max(15, 20));
	}
	static int toplam(int sayi1, int sayi2){
		int toplam = 0;
		for(int i = sayi1; i <= sayi2; i++) {
			toplam += i;
		}
		return toplam;
	
	}
	public static int carpim(int a, int b) {
		int result;
		result = a * b;
		return result;
	}
}

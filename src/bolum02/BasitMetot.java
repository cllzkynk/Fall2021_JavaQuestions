package bolum02�l�m02;

public class BasitMetot {

	public static void main(String[] args) {
        System.out.println("1 den 10 a kadar olan say�lar�n toplam�: " + toplam(1, 10));
        System.out.println("15 den 44 a kadar olan say�lar�n toplam�: " + toplam(15, 44));
        System.out.println("30 den 33 a kadar olan say�lar�n toplam�: " + toplam(30, 33));
        System.out.println("3 ile 5 in �arp�m� = " + �arp�m(3, 5));
        System.out.println(MaxSay�y�D�n.max(15, 20));
	}
	static int toplam(int say�1, int say�2){
		int toplam = 0;
		for(int i = say�1; i <= say�2; i++) {
			toplam += i;
		}
		return toplam;
	
	}
	public static int �arp�m(int a, int b) {
		int result;
		result = a * b;
		return result;
	}
}

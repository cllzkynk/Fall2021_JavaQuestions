package bölüm06;

public class BasitMetot {

	public static void main(String[] args) {
        System.out.println("1 den 10 a kadar olan sayýlarýn toplamý: " + toplam(1, 10));
        System.out.println("15 den 44 a kadar olan sayýlarýn toplamý: " + toplam(15, 44));
        System.out.println("30 den 33 a kadar olan sayýlarýn toplamý: " + toplam(30, 33));
        System.out.println("3 ile 5 in Çarpýmý = " + çarpým(3, 5));
        System.out.println(MaxSayýyýDön.max(15, 20));
	}
	static int toplam(int sayý1, int sayý2){
		int toplam = 0;
		for(int i = sayý1; i <= sayý2; i++) {
			toplam += i;
		}
		return toplam;
	
	}
	public static int çarpým(int a, int b) {
		int result;
		result = a * b;
		return result;
	}
}

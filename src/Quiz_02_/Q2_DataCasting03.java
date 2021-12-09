package Quiz.Quiz_02;

public class Q2_DataCasting03 {

	public static void main(String[] args) {
		/*
		 * Soru 4 ) double 255.36 sayisini int a
		 * ve sonra da olusturdugunuz int sayiyi byte a cevirip yazdirin
		 */
		
		double sayi1=255.36;
		System.out.println("double degisken ile : " + sayi1); // 255.36
		
		int sayi2=(int) sayi1;
		System.out.println("int degisken ile : " + sayi2); // 255
		
		byte sayi3=(byte) sayi2;
		System.out.println("byte degisken ile : " + sayi3);
		
	}

}

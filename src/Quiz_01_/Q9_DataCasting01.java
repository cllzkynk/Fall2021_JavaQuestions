package Quiz.Quiz_01;

public class Q9_DataCasting01 {

	public static void main(String[] args) {
		/*
		 * Soru 1 ) byte veri tipinde bir degisken olusturun, 
		 * short,int,float ve double data tiplerinde birer degisken olusturup 
		 * adim adim  widening yapin ve yazdirin

		 */

		
		byte sayi1 = 25;		
		System.out.println("byte degisken ile : " + sayi1);
		
		short sayi2 = sayi1; 
		System.out.println("short degisken ile : " + sayi2);
		
		int sayi3 = sayi1; 
		System.out.println("int degisken ile : " + sayi3);
		
		float sayi4 = sayi1; 
		System.out.println("float degisken ile : " + sayi4);
		
		double sayi5 = sayi1;
		System.out.println("double degisken ile : " + sayi5);
	}

}

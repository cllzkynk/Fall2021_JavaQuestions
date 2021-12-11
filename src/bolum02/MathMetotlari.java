package bolum02 ;

public class MathMetotlari {
	public static void main(String[] args) {
		System.out.println("----------CE�L---------");// B�y�k olan say�ya yuvarlad�
		System.out.println(Math.ceil(3.0));
		System.out.println(Math.ceil(3.1));
		System.out.println(Math.ceil(3.5));
		System.out.println(Math.ceil(3.8));
		System.out.println(Math.ceil(3.000001));

		System.out.println("-----------FLOOR--------");// K���k olan say�ya yuvarlad�
		System.out.println(Math.floor(3.0));
		System.out.println(Math.floor(3.1));
		System.out.println(Math.floor(3.5));
		System.out.println(Math.floor(3.8));
		System.out.println(Math.floor(3.00001));

		System.out.println("----------RINT---------");// Yak�n olan tam say�ya yuvarlad�
		System.out.println(Math.rint(3.0));
		System.out.println(Math.rint(3.1));
		System.out.println(Math.rint(3.5000000001));
		System.out.println(Math.rint(3.5));
		System.out.println(Math.rint(3.8));
		System.out.println(Math.rint(3.000001));

		System.out.println("----------ROUND---------");// rint en fark� sonucun integer olmas�..Haricinde ayn�..
		System.out.println(Math.round(3.0));
		System.out.println(Math.round(3.1));
		System.out.println(Math.round(3.5000000001));
		System.out.println(Math.round(3.5));
		System.out.println(Math.round(3.8));
		System.out.println(Math.round(3.000001));

		System.out.println(Math.max(3, Math.max(28, -3)));
		/*
		 * metotlar� i�i�e kullanabiliriz
		 */
		System.out.println(Math.min(3, Math.min(28, -3)));
		
		for(int i = 0; i < 11; i++) { // for d�ng�s�yle yapm�� olduk
	
		System.out.println((int)(Math.random() * 34) + 15);
		/*
		 * 15 iie 48 aras�nda rastgele bir say��rettik
		 * 15 ve 48 dahil
		 * 0 y�zde 48 - 15 + 1 yapt�k
		 */
		}
	}

}

package bölüm04;

public class MathMetotlarý {
	public static void main(String[] args) {
		System.out.println("----------CEÝL---------");// Büyük olan sayýya yuvarladý
		System.out.println(Math.ceil(3.0));
		System.out.println(Math.ceil(3.1));
		System.out.println(Math.ceil(3.5));
		System.out.println(Math.ceil(3.8));
		System.out.println(Math.ceil(3.000001));

		System.out.println("-----------FLOOR--------");// Küçük olan sayýya yuvarladý
		System.out.println(Math.floor(3.0));
		System.out.println(Math.floor(3.1));
		System.out.println(Math.floor(3.5));
		System.out.println(Math.floor(3.8));
		System.out.println(Math.floor(3.00001));

		System.out.println("----------RINT---------");// Yakýn olan tam sayýya yuvarladý
		System.out.println(Math.rint(3.0));
		System.out.println(Math.rint(3.1));
		System.out.println(Math.rint(3.5000000001));
		System.out.println(Math.rint(3.5));
		System.out.println(Math.rint(3.8));
		System.out.println(Math.rint(3.000001));

		System.out.println("----------ROUND---------");// rint en farký sonucun integer olmasý..Haricinde ayný..
		System.out.println(Math.round(3.0));
		System.out.println(Math.round(3.1));
		System.out.println(Math.round(3.5000000001));
		System.out.println(Math.round(3.5));
		System.out.println(Math.round(3.8));
		System.out.println(Math.round(3.000001));

		System.out.println(Math.max(3, Math.max(28, -3)));
		/*
		 * metotlarý içiçe kullanabiliriz
		 */
		System.out.println(Math.min(3, Math.min(28, -3)));
		
		for(int i = 0; i < 11; i++) { // for döngüsüyle yapmýþ olduk
	
		System.out.println((int)(Math.random() * 34) + 15);
		/*
		 * 15 iie 48 arasýnda rastgele bir sayýürettik
		 * 15 ve 48 dahil
		 * 0 yüzde 48 - 15 + 1 yaptýk
		 */
		}
	}

}

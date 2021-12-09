package Quiz.Quiz_02;
public class Q6_DataCasting07 {
	public static void main(String[] args) {

		// Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin
		// ve yazdirin

		int sayi5 = 28;
		System.out.println("int degisken ile : " + sayi5);

		short sayi6 = (short) sayi5;
		System.out.println("short degisken ile : " + sayi6);

		byte sayi7 = (byte) sayi5;
		System.out.println("byte degisken ile : " + sayi7);

		// Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim
		System.out.println(" "); // satir atlamasi icin konulur..

		int sayi1 = 10;
		int sayi2 = 20;

		sayi1 -= 5; // 10-5=5
		sayi2 += 10; // 20+10=30
		System.out.println(sayi2 / sayi1); // 30/5=6

		sayi1 *= 2; // 5*2=10
		sayi2++; // 30+1=31
		System.out.println(sayi2 / sayi1); // 31/10=3.1 fakat int oldugundan 3 olur

		sayi1 /= 2;

		double sayi3 = sayi2 / 10; // 31/10=3.1
		// sayi2 integer oldugundan sayi2/10 isleminin sonucunu java 3 olarak bulur
		// ama atama islemi yapilirken sayi3 double oldugu icin
		// bolme isleminin sonucu olan 3'u casting ile 3.0'a cevirir

		System.out.println(sayi3); // 3.1
		System.out.println(sayi1 * sayi2); // 5*31=155
		System.out.println(sayi1 * sayi3); // 5*3.1=15.0

		sayi3 = (double) sayi2 / 10;

		System.out.println(sayi3); // 3.1
		System.out.println(sayi2); // 31
		System.out.println((double) sayi2); // 31.0
		System.out.println(sayi2); // 31

		sayi2 += 0.2;
		System.out.println(sayi2); // 31+0.2=31.2 fakat in oldugundan 31 olur
	}
}
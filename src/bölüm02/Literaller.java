package bölüm02;

public class Literaller {
	public static void main(String[] args) {
		
		byte b = 127;
		
		short s = 32000;
		
		int i = 2147000000; // sayýsnýn baþýna 0 koymuþ olsak,02147000000 sayýyý 8 lik tabanda anlayacaktýr ve yanlýþlýk olur..DÝKKAT
		
		long l = 9000000000000000000L;
		
		float f = 1.0F;
		
		double d = 1.0;
		
		// cok cok az kullanýlýr
		
		System.out.println(0B1111);// binary olarak yazdý.iklik sistemde
		System.out.println(07777);// sekizlik sistemde yazdý
		System.out.println(0XFFFFF);// 16 lk sistemde yazdý.F 15 demektir.. A 10 demektir
		System.out.println(1.23456E3);
		System.out.println(1.23456E-2);
	}

}

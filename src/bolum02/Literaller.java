package bolum02 ;

public class Literaller {
	public static void main(String[] args) {
		
		byte b = 127;
		
		short s = 32000;
		
		int i = 2147000000; // sayisn�n ba��na 0 koymu� olsak,02147000000 sayiy� 8 lik tabanda anlayacakt�r ve yanl��l�k olur..D�KKAT
		
		long l = 9000000000000000000L;
		
		float f = 1.0F;
		
		double d = 1.0;
		
		// cok cok az kullan�l�r
		
		System.out.println(0B1111);// binary olarak yazd�.iklik sistemde
		System.out.println(07777);// sekizlik sistemde yazd�
		System.out.println(0XFFFFF);// 16 lk sistemde yazd�.F 15 demektir.. A 10 demektir
		System.out.println(1.23456E3);
		System.out.println(1.23456E-2);
	}

}

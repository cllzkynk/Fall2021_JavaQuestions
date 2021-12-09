package Quiz.Quiz_02;

public class Q7_Modulus {

	public static void main(String[] args) {
		// 6893 sayisinin rakamlar toplamini bulalim

		int sayi=6893;
		int rakamlarToplami=0;
		
		int rakam=sayi%10; // 6893%10
		rakamlarToplami +=rakam; // 3
		sayi/=10; // 689
		
		rakam=sayi%10; // 689%10
		rakamlarToplami +=rakam; // 3+6=9
		sayi/=10; // 68
		
		rakam=sayi%10; // 68%10
		rakamlarToplami +=rakam; // 3+6+8=20
		sayi/=10; // 6
		
		rakam=sayi%10; // 6%10
		rakamlarToplami +=rakam; // 3+6+8+6=26
		sayi/=10; // 0
		
		System.out.println("Sayi : " + sayi); // Sayi : 0
		System.out.println("Rakamlar Toplami : " + rakamlarToplami); // Rakamlar Toplami : 26
	}

}

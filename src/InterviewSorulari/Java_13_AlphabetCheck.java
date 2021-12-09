import java.util.Scanner;

public class Java_13_AlphabetCheck {

	public static void main(String[] args) {

		// Karakterin alfabe olup olmadigini kontrol ediniz...

		// 1. yol
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		char harf= scan.next().charAt(0);
		if((harf >= 'a' && harf <='z') ||(harf >= 'A' && harf <= 'Z')) {
			System.out.print(harf + " is in alphabet");
		}else {
			System.out.println(harf + " is in not alphabet");
		}
		scan.close();
		
		// 2. yol
		System.out.println("\nLutfen bir harf giriniz");
		char harf1= scan.next().charAt(0);
		System.out.print(harf1 >= 'a' && harf1 <='z' ||(harf1 >= 'A' && harf1 <= 'Z') ? harf1 + " is in alphabet" : harf1 + " is in not alphabet" );

	/*  // 3. yol
		char c = '$';

		if((c >= 'a' && c <='z') ||(c >= 'A' && c <= 'Z')) {
			System.out.println(c + " is in alphabet");
		}else {
			System.out.println(c + " is in not alphabet");
		}
		*/


	}


}

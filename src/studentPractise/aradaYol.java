package studentPractise;

import java.util.Scanner;

/*
 * Bearland'de 1'den baþlayarak numaralandýrýlmýþ sonsuz sayýda þehir vardýr. Bazý þehir çiftleri çift yönlü yollarla birbirine baðlýdýr:

1-2, 3-4, 5-6, 7-8 vb. yollar vardýr (negatif olmayan her i tamsayýsý için 2*i+1 ve 2*i+2 þehirleri arasýnda bir yol vardýr).
1-3, 3-5, 5-7, 7-9, ... yollarý vardýr (her iki ardýþýk tek sayý arasýnda).
2-4, 4-6, 6-8, 8-10, ... yollarý vardýr (her iki ardýþýk çift sayý arasýnda).
Aralarýndaki ilk birkaç þehir ve yol þöyle görünür:



Size Q sorgusu verilir . Her sorguda, verilen farklý þehirler a ve b için , aralarýnda bir yol olup olmadýðýný kontrol etmelisiniz. Her sorgu için buna göre "EVET" veya "HAYIR" yazdýrýn.
 */

public class aradaYol {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (N-- > 0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (A % 2 != 0) {
				if (A - 2 == B || A + 1 == B || A + 2 == B) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else if (A % 2 == 0) {
				if (A - 1 == B || A + 2 == B || A - 2 == B) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}
package studentPractise;

import java.util.Scanner;

/*
 * Bearland'de 1'den ba�layarak numaraland�r�lm�� sonsuz say�da �ehir vard�r. Baz� �ehir �iftleri �ift y�nl� yollarla birbirine ba�l�d�r:

1-2, 3-4, 5-6, 7-8 vb. yollar vard�r (negatif olmayan her i tamsay�s� i�in 2*i+1 ve 2*i+2 �ehirleri aras�nda bir yol vard�r).
1-3, 3-5, 5-7, 7-9, ... yollar� vard�r (her iki ard���k tek say� aras�nda).
2-4, 4-6, 6-8, 8-10, ... yollar� vard�r (her iki ard���k �ift say� aras�nda).
Aralar�ndaki ilk birka� �ehir ve yol ��yle g�r�n�r:



Size Q sorgusu verilir . Her sorguda, verilen farkl� �ehirler a ve b i�in , aralar�nda bir yol olup olmad���n� kontrol etmelisiniz. Her sorgu i�in buna g�re "EVET" veya "HAYIR" yazd�r�n.
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
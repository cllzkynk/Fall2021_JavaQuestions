package level_3;


import java.util.Scanner;

/*
 * @author CEL�L
 *
 */
public class Armstrong_Number {

	public static void main(String[] args) {
		/*
		 * Bir say�n�n basamaklar�ndaki t�m rakamlar�n ayr� ayr� k�plerinin toplam�
		 * kendisine e�itse bu say�ya Armstrong say� denir.
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("Amstrong sayiya aday bir sayi gir");
		int ady=scan.nextInt();
		int depo=ady;
		
		String aday=Integer.toString(ady);
		int uzunluk=aday.length()-1;
				
		int basamak=0;
		int basamakDepo=1;
		
		int total=0;
		
		while (ady !=0) {
			basamak=ady%10;
			for (int i = uzunluk; i >=0; i--) {
				basamakDepo*=basamak;
			}
			
			total=total+basamakDepo;
			basamakDepo=1;
		
			ady/=10;
			
		}
		
	
		if (total==depo) {
			System.out.println(depo+"  is an Amstrong number");
		} else {
			System.out.println(depo+"  is not an Amstrong number");
		}
		
		
		
		scan.close();
	}

}

package JavaKonusalSorular.ForLoop;

import java.util.Scanner;

public class C06_ForLoop06 {

	public static void main(String[] args) {
		/*
		 Soru 7 ) Interview Question 
		 Kullanicidan bir String isteyin ve Stringi tersten yazdirin. 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir String yaziniz ");
		
		String kelime=scan.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
			System.out.print(kelime.substring(kelime.length()-1-i, kelime.length()-i));
		}


		// su sekilde de yapabiliriz...
		System.out.println("");// ustteki cozumle karismasin diye asagiya eklemek icin ekledik..
		for (int i = kelime.length()-1; i >= 0; i--) {
			System.out.print(kelime.substring(i,i+1));
		}
		scan.close();
	}

}
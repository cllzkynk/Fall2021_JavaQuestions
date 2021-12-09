package Quiz.Quiz_01;

import java.util.Scanner;

public class Q8_Scanner07 {

	public static void main(String[] args) {
		//Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen isminizi giriniz : ");
		char basharf=scan.next().charAt(0);
		System.out.println("Ismin Bas Harfi : " + basharf);

		
		scan.close();
		
	}

}

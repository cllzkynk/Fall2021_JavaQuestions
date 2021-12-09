package JavaKonusalSorular.ForLoop;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		// Girdi olarak bir tamsayi kabul eden
		// ve faktoriyel hesaplayan programi yaziniz.
		// Input : 6
		// Output: 6!=6*5*4*3*2*1=720
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen pzoitif bir sayi giriniz : ");
		
		int sayi=scan.nextInt();
		
		int faktoryel=1;
		String sonuc="";
		
		for (int i = sayi; i>1; i--) {
			faktoryel=faktoryel*i;
			sonuc+=i+"*";
		}
	
		System.out.println(sayi+ "!=" + sonuc + "1=" + faktoryel);
		
		
		
		scan.close();
		
		
		

	}

}

package JavaKonusalSorular.ForLoop;


import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir isim ve bir karakter girmesini isteyin,
		 * ardindan donguleri kullanarak
		 * karakterin isimde kac kez tekrarlandigini kontrol edin.
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name ="John came late"
		 * Expected Output:
		 * Number of a = 2
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen bir isim veya karakter giriniz : ");
		String isim=scan.nextLine();
		System.out.print("Bulmak istediginiz harfi giriniz : ");
		char ch1=scan.next().charAt(0);
		
		int sayac=0;
		
		for (int i = 0; i < isim.length(); i++) {
			if (isim.charAt(i)== ch1) {
				sayac++;
			}
		}
		System.out.println("Girilen cumledeki karakter sayisi : " + ch1+ " = " + sayac);

scan.close();
	}

}

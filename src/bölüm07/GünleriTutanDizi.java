package bölüm07;

import java.util.Scanner;

public class GünleriTutanDizi {
	public static void main(String[] args) {
		String [] günler = {"Pazartesi","Salý","Çarþamba","Perþembe","Cuma","Cumartesi","Pazar"};
		System.out.println("HAftanýn gününü belirlemek için 1 den 7 ye kadar bir sayý girin");
		Scanner scan = new Scanner(System.in);
		int seçim = scan.nextInt();
		
		System.out.println("Seçtiðiniz gün : " + günler[seçim - 1]);
		
		switch (seçim) {
		case 1:
			System.out.println("Seçtiðiniz gün Pazartesi");			
			break;
		case 2:
			System.out.println("Seçtiðiniz gün Salý");			
			break;
		case 3:
			System.out.println("Seçtiðiniz gün Çarþamba");			
			break;
		case 4:
			System.out.println("Seçtiðiniz gün Perþembe");			
			break;
		case 5:
			System.out.println("Seçtiðiniz gün Cuma");			
			break;
		case 6:
			System.out.println("Seçtiðiniz gün C.tesi");			
			break;
		case 7:
			System.out.println("Seçtiðiniz gün Pazar");			
			break;
		default:
			System.out.println("Yanlýþ rakam girdiniz");
			break;
		}
	}

}

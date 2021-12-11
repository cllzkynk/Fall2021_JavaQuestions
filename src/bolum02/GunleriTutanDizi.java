package bolum02 ;

import java.util.Scanner;

public class GunleriTutanDizi {
	public static void main(String[] args) {
		String [] gunler = {"Pazartesi","Sal�","�ar�amba","Per�embe","Cuma","Cumartesi","Pazar"};
		System.out.println("HAftan�n g�n�n� belirlemek i�in 1 den 7 ye kadar bir sayi girin");
		Scanner scan = new Scanner(System.in);
		int secim = scan.nextInt();
		
		System.out.println("Se�ti�iniz g�n : " + gunler[secim - 1]);
		
		switch (secim) {
		case 1:
			System.out.println("Se�ti�iniz g�n Pazartesi");			
			break;
		case 2:
			System.out.println("Se�ti�iniz g�n Sal�");			
			break;
		case 3:
			System.out.println("Se�ti�iniz g�n �ar�amba");			
			break;
		case 4:
			System.out.println("Se�ti�iniz g�n Per�embe");			
			break;
		case 5:
			System.out.println("Se�ti�iniz g�n Cuma");			
			break;
		case 6:
			System.out.println("Se�ti�iniz g�n C.tesi");			
			break;
		case 7:
			System.out.println("Se�ti�iniz g�n Pazar");			
			break;
		default:
			System.out.println("Yanl�� rakam girdiniz");
			break;
		}
	}

}

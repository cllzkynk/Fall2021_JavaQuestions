package b�l�m07;

import java.util.Scanner;

public class G�nleriTutanDizi {
	public static void main(String[] args) {
		String [] g�nler = {"Pazartesi","Sal�","�ar�amba","Per�embe","Cuma","Cumartesi","Pazar"};
		System.out.println("HAftan�n g�n�n� belirlemek i�in 1 den 7 ye kadar bir say� girin");
		Scanner scan = new Scanner(System.in);
		int se�im = scan.nextInt();
		
		System.out.println("Se�ti�iniz g�n : " + g�nler[se�im - 1]);
		
		switch (se�im) {
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

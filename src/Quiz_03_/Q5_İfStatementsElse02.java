package Quiz.Quiz_03;

import java.util.Scanner;

public class Q5_İfStatementsElse02 {

	public static void main(String[] args) {
		/*
		 * Soru 3) Kullaniciya yasini sorun, eger yas 65 den kucuk ise
		 * "emekli olamazsin, calismalisin",
		 * 65 den buyukse "Emekli olabilirsin" yazdirin
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Lutfen yasinizi giriniz : ");
		int yas=scan.nextInt();
		
		if (yas>65) {
			System.out.println("Emekli olabilirsin");
		}else if (yas<65) {
			System.out.println("Emekli olamazsin calismalisin");
			
			scan.close();
			}
		}
		
		
		
		
		
		
		
		
	}



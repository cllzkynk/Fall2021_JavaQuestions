package InterviewSorulari;

import java.time.LocalDate;
import java.util.Scanner;

public class Java_11_LeapYear {

	public static void main(String[] args) {
		
		//Find Leap Year
				/*Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
				Kural 1: 4 ile bolunemeyen yillar artik yil degildir
				Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
				Kural 3: 4 un kati olmasina ragmen
				100 ile bolunebilen yillardan sadece 400 un kati olan yillar artik 	yildir
			*/
				/*
				Scanner scan= new Scanner(System.in);
				System.out.println("Lutfen hesaplamak istediginiz yili giriniz");
				int yil= scan.nextInt();
				*/
				
				/*//1. yol
				if (yil%4==0) {
					if (yil%100==0 && yil%400!=0) {
						System.out.println(yil + " artik yil degildir");
					}
					else System.out.println(yil + " artik yildir");
				} else {
					System.out.println(yil + " artik yil degildir");
				}
				*/
		//================================================================
				/*//2.yol
				if (yil%400==0 || (yil%100!=0 && yil%4==0)) {
				
					System.out.println(yil + " artik yildir");
				
				} else {
					System.out.println(yil + " artik yil degildir");
			*/
				
		//=====================================================================		
				/*//3.yol
			
				System.out.print(yil%400==0 || (yil%100!=0 && yil%4==0 ) ? yil + " artik yildir" : yil + " artik yil degildir");
			
			*/
				
		//=========================================================================
				
				
				/*System.out.println("Girilen yil artik yil midir? " + artikYilMi2(yil));*/
				
		//==========================================================
				
				
				/*
				 new keyword u kullanilmaz..
				 4. yol
				 */

				Scanner sc = new Scanner(System.in);
				System.out.print("Tarih giriniz : ");
				int a=sc.nextInt();
				LocalDate date = LocalDate.of(a, 11,15);
				System.out.println(date.isLeapYear());
				
				sc.close();

			}

			@SuppressWarnings("unused")
			private static boolean artikYilMi2(int yil) {
				
				
				return (yil%400==0 || (yil%100!=0 && yil%4==0 ));
			}
}
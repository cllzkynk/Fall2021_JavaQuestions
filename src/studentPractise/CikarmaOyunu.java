package studentPractise;

import java.util.Random;
import java.util.Scanner;

public class CikarmaOyunu {

	   public static void main(String[] args) {            

           /* Ba�lang�� i�in bilgilendirme metni yazd�ral�m. */

           System.out.println("Matematik Yar��mas�na Ho�geldiniz!");

           System.out.println("A�a��da size sorulan 5 ��kartma sorusunu do�ru �ekilde cevaplaman�z gerekiyor.");

           System.out.println("Yar��ma sonunda yan�tlar�n�z� ekranda g�rebilirsiniz.");

           System.out.println("Ba�ar�lar dileriz.");

           System.out.println("===============================");

           System.out.println("Ba�lamak i�in 1, ��kmak i�in 0 yaz�n ve enter'lay�n.");

          

           Scanner scan = new Scanner(System.in); // Scanner s�n�f� i�in de�i�ken atayal�m.

           Random rand = new Random(); // Random s�n�f� i�in de�i�ken atayal�m.

          

           int basla = scan.nextInt(); // Ba�lamak i�in kullan�c�dan 0 veya 1 say�s� isteyelim.
           if ( basla == 1 ) {

               

               int dogru = 0; // Yar��ma ba�lang�c�nda do�ru ve yanl�� de�erini 0 olarak atayal�m.

               int yanlis = 0;

              

               for ( int i= 0; i < 5; i++ ) { // For d�ng�s� ile ��kartma i�lemlerini d�nd�relim.

                     int birincisayi = rand.nextInt(10)+1; // ��kartma i�lemindeki say�lar� belirleyelim.

                     int ikincisayi = rand.nextInt(10)+1;

                    

                     int soru = birincisayi - ikincisayi; // Soruyu haz�rlayal�m.

                     System.out.println((i + 1) + ". Soru: " + (birincisayi) + " - " + (ikincisayi) ); // Soruyu ekrana yazd�ral�m.

                     int cevap = scan.nextInt(); // Kullan�c�dan cevab� girmesini isteyelim.
                     if ( soru == cevap ) { // If else ile sorunun do�ru ya da yanl�� oldu�unu kontrol edelim.

                         dogru++; // Cevap do�ruysa do�ru say�s�n� artt�ral�m.

                         System.out.println("Tebrikler, do�ru cevap."); // Kullan�c�y� yan�t� hakk�nda bilgilendirelim.

                  } else {yanlis++; // Cevap yanl��sa yanl�� say�s�n� artt�ral�m.

                  System.out.println("Maalesef, yanl�� cevap."); // Kullan�c�y� yan�t� hakk�nda bilgilendirelim.

           }

     }

    

     System.out.println("Skor Tablosu:"); // Sorular bittikten sonra skor tablosunu yazd�ral�m.

     System.out.println("Do�ru:" + dogru);

     System.out.println("Yanl��:" + yanlis);

    

} else {

     System.out.println("Hatal� giri� ya da ��kmay� tercih ettiniz.");

}



}
}
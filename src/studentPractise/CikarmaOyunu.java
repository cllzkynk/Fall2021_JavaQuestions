package studentPractise;

import java.util.Random;
import java.util.Scanner;

public class CikarmaOyunu {

	   public static void main(String[] args) {            

           /* Baþlangýç için bilgilendirme metni yazdýralým. */

           System.out.println("Matematik Yarýþmasýna Hoþgeldiniz!");

           System.out.println("Aþaðýda size sorulan 5 çýkartma sorusunu doðru þekilde cevaplamanýz gerekiyor.");

           System.out.println("Yarýþma sonunda yanýtlarýnýzý ekranda görebilirsiniz.");

           System.out.println("Baþarýlar dileriz.");

           System.out.println("===============================");

           System.out.println("Baþlamak için 1, çýkmak için 0 yazýn ve enter'layýn.");

          

           Scanner scan = new Scanner(System.in); // Scanner sýnýfý için deðiþken atayalým.

           Random rand = new Random(); // Random sýnýfý için deðiþken atayalým.

          

           int basla = scan.nextInt(); // Baþlamak için kullanýcýdan 0 veya 1 sayýsý isteyelim.
           if ( basla == 1 ) {

               

               int dogru = 0; // Yarýþma baþlangýcýnda doðru ve yanlýþ deðerini 0 olarak atayalým.

               int yanlis = 0;

              

               for ( int i= 0; i < 5; i++ ) { // For döngüsü ile çýkartma iþlemlerini döndürelim.

                     int birincisayi = rand.nextInt(10)+1; // Çýkartma iþlemindeki sayýlarý belirleyelim.

                     int ikincisayi = rand.nextInt(10)+1;

                    

                     int soru = birincisayi - ikincisayi; // Soruyu hazýrlayalým.

                     System.out.println((i + 1) + ". Soru: " + (birincisayi) + " - " + (ikincisayi) ); // Soruyu ekrana yazdýralým.

                     int cevap = scan.nextInt(); // Kullanýcýdan cevabý girmesini isteyelim.
                     if ( soru == cevap ) { // If else ile sorunun doðru ya da yanlýþ olduðunu kontrol edelim.

                         dogru++; // Cevap doðruysa doðru sayýsýný arttýralým.

                         System.out.println("Tebrikler, doðru cevap."); // Kullanýcýyý yanýtý hakkýnda bilgilendirelim.

                  } else {yanlis++; // Cevap yanlýþsa yanlýþ sayýsýný arttýralým.

                  System.out.println("Maalesef, yanlýþ cevap."); // Kullanýcýyý yanýtý hakkýnda bilgilendirelim.

           }

     }

    

     System.out.println("Skor Tablosu:"); // Sorular bittikten sonra skor tablosunu yazdýralým.

     System.out.println("Doðru:" + dogru);

     System.out.println("Yanlýþ:" + yanlis);

    

} else {

     System.out.println("Hatalý giriþ ya da çýkmayý tercih ettiniz.");

}



}
}
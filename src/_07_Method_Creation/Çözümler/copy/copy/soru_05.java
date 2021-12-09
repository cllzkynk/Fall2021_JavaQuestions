package _07_Method_Creation.��z�mler.copy.copy�özümler;

import java.util.Scanner;

public class soru_05 {

         /*
            Problem Tanımı :
            Kullanıcıdan alınan  bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
            Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
            ORNEK:
            INPUT     : 6
            OUTPUT : 1,2,3
                          1+2+3 = 6 = 6 (Mükemmel)
            */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();

        System.out.println(checkPerfectNumber(sayi));
        boolean flag;
        flag = checkPerfectNumber(sayi);

        String result = checkPerfectNumber(sayi) ? "Sayi mukemmel sayidir"
                : "Sayi mukemmel sayi degildir";//ternary yaptık
        System.out.println(result);
    }

    public static boolean checkPerfectNumber(int sayi) {
        int toplam = 0;  //ilk değer 0 çünkü toplam işleme girdiğinde etki etmemeli .int default değeri=0 dır.
        boolean flag = false; // durum kontrolü false çünkü işleme etki etmemeli boolean default değeri:false dir.
        for (int i = 1; i < sayi; i++) {//i!=sayi çünkü kendisi hariç bölenleri lazım
            if (sayi % i == 0) {
                toplam +=i; // toplam =toplam+ i;
            }
        }
        if (toplam == sayi) {
            flag = true;
        }

        return flag;
    }
    /*
    mukemmel sayi kontrolu
                          1. kullanicidan sayi alalim
                          2. bir toplam degiskeni olusturuyoruz
                          3. sayinin bolenleri bul
                          4. bolenleri toplamla topla
                          5. sayiyla toplamin esitligini kontrol et
     */
}

package A99_haftaninSorusu_;

import java.util.Random;
import java.util.Scanner;
    /*
     Sayı tahmin etme oyunu....
     Bilgisayardan rastle(random class kullanılarak) 0-100 arasında bir sayı alıp kullanıcının
     tahminini her defasından büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
     */
public class _06_SayiTahminEtmeOyunu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println(" ***   BA�?ARILI Sayı tahmin oyununa hoş geldiniz ***   ");
        System.out.print("Lütfen 1-100 arasında bir sayı giriniz: ");
// Kullanıcıdan sayı alıyoruz
        int tahmin = scan.nextInt();
// Bilgisayardan rastgele sayı alıyoruz
        int sayi = rnd.nextInt(101);
        while (tahmin != sayi) {
            if(tahmin < 0 || tahmin > 100 ) {
                System.out.println("1 ile 100 arasında bir değer giriniz: ");
                tahmin = scan.nextInt(); }
            else if (tahmin < sayi) {
                System.out.println("Daha büyük bir sayı giriniz: ");
                tahmin = scan.nextInt(); }
            else{
                System.out.println("Daha küçük bir sayı giriniz: ");
                tahmin = scan.nextInt();}
        }
// Eğer sayımız ve tahmin birbirine eşitse while döngüsüne girmez
// ve print komutunu yazdırırız
        System.out.println("Gayet BA�?ARILI  bulmanız gereken sayi :"+sayi+" tahmin ettiniz. tebrikler :) "); }
    }


package _07_Method_Creation.�ozumler ;

import java.util.Scanner;

public class Soru_01 {
    /*  Problem Tanımı
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Verilen iki sayının permütasyonunu bulan kodu yazınız.
        Hatırlatma P(n,r) = n! / (n-r)!

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365
        permütasyon: 32760

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10
        permütasyon: 60
      */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Permütasyon ve Kombinasyon hesabı için n değerini giriniz: ");
        long n = scan.nextInt();

        System.out.print("Permütasyon ve Kombinasyon hesabı için r değerini giriniz: ");
        long r = scan.nextInt();

        System.out.println("Kombinasyon değeri = " + kombinasyon(n, r));
        System.out.println("Permütasyon değeri = " + permutasyom(n, r));

    }

    public static long faktoriyel(long number) {
        long fakSonuc = 1;
        for (int i = 1; i <= number; i++) {
            fakSonuc = fakSonuc * i;
        }
        return fakSonuc;
    }

    public static long kombinasyon(long n, long r) {
        if (n > 0 && r > 0 && n >= r) {
            return (faktoriyel(n) / (faktoriyel(n - r) * faktoriyel(r)));
        } else return 0;
    }

    public static long permutasyom(long n, long r) {
        if (n > 0 && r > 0 && n >= r) {
            return (faktoriyel(n) / faktoriyel(n - r));
        } else return 0;
    }
}

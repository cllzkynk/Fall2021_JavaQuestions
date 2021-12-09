package _07_Method_Creation.プzumler ;

import java.util.Scanner;

public class Soru_01 {
    /*  Problem Tan覺m覺
        Verilen iki say覺n覺n kombinasyonunu bulan kodu yaz覺n覺z.
        Hat覺rlatma C(n,r) = n! / (r!(n-r)!)

        Verilen iki say覺n覺n perm羹tasyonunu bulan kodu yaz覺n覺z.
        Hat覺rlatma P(n,r) = n! / (n-r)!

        Ekran ��覺kt覺s覺
        Birinci say覺y覺 giriniz: 15
        Ikinci say覺y覺 giriniz: 4
        Kombinasyon: 1365
        perm羹tasyon: 32760

        Birinci say覺y覺 giriniz: 5
        Ikinci say覺y覺 giriniz: 3
        Kombinasyon: 10
        perm羹tasyon: 60
      */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Perm羹tasyon ve Kombinasyon hesab覺 i癟in n de��erini giriniz: ");
        long n = scan.nextInt();

        System.out.print("Perm羹tasyon ve Kombinasyon hesab覺 i癟in r de��erini giriniz: ");
        long r = scan.nextInt();

        System.out.println("Kombinasyon de��eri = " + kombinasyon(n, r));
        System.out.println("Perm羹tasyon de��eri = " + permutasyom(n, r));

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

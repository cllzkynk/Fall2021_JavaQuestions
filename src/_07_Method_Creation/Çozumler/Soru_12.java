package _07_Method_Creation.�ozumler�özümler;

import java.util.Scanner;

public class Soru_12 {

 /*
        Problem Tanımı :
        powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = scanner.nextInt();

        System.out.println(powerOfThree(num));


    }

    public static boolean powerOfThree(int num) {

        boolean b = false;
        int carpim = 1;

        for (int i = 1; i < num / 3; i++) {
            carpim *= 3;

            if (carpim == num) {
                b = true;
                break;
            }
        }
        return b;
    }
}

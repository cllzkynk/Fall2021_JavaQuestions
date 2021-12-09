package _07_Method_Creation.��z�mler.copy.copy�özümler;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_11 {
        /*
        Problem Tanımı:
        plusOne adında bir method oluşturun.
        Parametre olarak int Array alır.
        Rakamlar pozitif olmalıdır ve ilk basamak 0 olamaz.
        Yazdığınız rakamlar bir bütün olarak ele alınacaktır.
        Orta basamağa 1 ekleyin.

        Örnek 1:
        Girdi:: [1,2,3]
        Çıktı: [1,3,3]
        Açıklama:Bu sayı dizisi 133'ü temsil eder.

        Örnek 2:
        Input: [4,3,5,2,1]
        Çıktı: [4,3,6,2,1]
        Açıklama: Bu sayı dizisi 43621'i temsil eder.
        */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        String str = sc.nextLine();

        String[] arrStr = str.trim().split("");//str nin her"" hiçlikten sonra elemanını virgül ve boşlukla ayırır.
        System.out.println(Arrays.toString(arrStr));
        int[] arrInt = new int[arrStr.length];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }

        System.out.println(Arrays.toString(plusOne(arrInt)));


    }

    public static int[] plusOne(int[] arrInt) {

        for (int i = 0; i < arrInt.length; i++) {
            if (i == ((arrInt.length - 1) / 2)) {
                arrInt[i] += 1;
            }
        }
        return arrInt;
    }

}

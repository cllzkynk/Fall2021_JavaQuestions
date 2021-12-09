package _07_Method_Creation.��z�mler.copy�özümler;

import java.util.Scanner;

public class Soru_10 {
    /*
        Problem Tanımı :
        EvenOddNums isminde bir method oluşturun.
        Bu yöntem String olan bir parametreyi kabul etsin.
        Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        Sayıların her basamağındaki rakam çiftse toplayın, tekse çıkartın.
        toplam sonucu yazdırın.
        İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.

        For example :
        String =  "6678421312"
        6+6-7+8+4+2-1-3-1+2
        sonuç 16 olmalı
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("10 haneli sayı giriniz: ");
        String str = sc.nextLine();

        System.out.println(EvenOddNums(str));

    }

    public static int EvenOddNums(String str) {

        String[] arrStr = str.trim().split("");//parametredeki str elemanlarını String arrays a attık

        int[] arrInt = new int[arrStr.length];//str uzunluğu kadar int arr tanımladık.

        int sum = 0;

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);//arrStr yi integere çevirdik.ve arrInt e assaign ettik.
            if (arrInt[i] % 2 == 0) {//çiftse topla
                sum += arrInt[i];
            } else {
                sum -= arrInt[i];//değilse çıkar
            }
        }
        return sum;
    }
}



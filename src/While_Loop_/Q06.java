package While_Loop_;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {
        // Kullanıcıdan alınan bir metinde  x  girilene kadar ekrana "Gayet BA�?ARILI program çalışıyor :) " yazan
        // ve x girildiğinde ise "Program bitti :( " yazan programı yazınız.

        Scanner scan = new Scanner(System.in);

        String str="" ;

        do {
            System.out.print("başarılı bir metin giriniz : ");
            str = scan.nextLine();
            if (str.equalsIgnoreCase("x")) {
                System.out.println("Program bitti :( ");
                break;
            }
            System.out.println("Gayet BA�?ARILI program çalışıyor :) ");

            break; //kaldırırsak pr devam eder
        } while (!str.equalsIgnoreCase("x"));


    }
}

package Quiz.Quiz_07;

import java.util.Scanner;

public class Cccc {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("100 den kucuk bir sayi giriniz : ");
        String kelime = scan.nextLine();

        for (int i = kelime.length() - 1; i >= 0; i--) {
            System.out.print(kelime.substring(i, i + 1));
        }


    }
}
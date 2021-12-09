import java.util.Scanner;

public class Question10 {
    //  Write a Java Program to find whether a number is prime or not.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        int count = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                count++;
            }
        }
        System.out.println(count == 0 ? "Sayi asal sayidir" : "Sayi asal sayi degildir");

    }
}

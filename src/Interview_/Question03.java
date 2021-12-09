import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question03 {
        /*     kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
        ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
        java programi yazin
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Olusturmak istediginiz array'in uzunlugunu giriniz");
        int lenght = scan.nextInt();
        int arr[] = new int[lenght];

        for(int i = 0; i<lenght; i++){
            System.out.println("Lutfen array'in " + (i+1) + ". elemanini giriniz");
            arr[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(arr)); // Before sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // After sort

        System.out.println("Girdiginiz array'deki en buyuk eleman ile en kucuk eleman arasindaki fark:" + (arr[lenght-1] - arr[0]));


    }
}

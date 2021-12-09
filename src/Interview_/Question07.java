import java.util.Arrays;
import java.util.Scanner;

public class Question07 {
    /*
	  	Kullanicini girdigi sayi kadar sekildeki gibi yarim pramit olusturan java programi yaziniz.
	    Ornek : kullanici 5 sayisini girdiginde yarim piramit olusacak ==>  1 2 3 4 5
																			1 2 3 4
																			1 2 3
																			1 2
																			1
    */


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen satir sayisi giriniz");
            int satir = scan.nextInt();

            // satirlar icin dongu
            for(int i = satir; i>0; i--){

                // karakterler icin dongu
                for(int j = 1; j<=i; j++){
                    System.out.print(j +" ");
                }
               System.out.println();
            }




        }
}

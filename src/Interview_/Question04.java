import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question04 {
    /*
	    Girilen sayinin Amstrong sayi olup olmadigini yazdiran java programi yaziniz
	    Ornek, 153 bir Armstrong sayidir. cunku 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.

	   */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        String s = String.valueOf(sayi);
        // String s = sayi + "";
        int basamakSayisi = s.length();
        int yedekSayi = sayi;
        int toplam = 0;
        int carpim = 1;
        while(yedekSayi!=0){
            int basamak = yedekSayi%10;
            for(int i = 0; i<basamakSayisi; i++){
                carpim *= basamak;
                //Math.pow(basamak,basamakSayisi); us alma methodu(tavsiye edilmiyor)
            }
            toplam += carpim;
            yedekSayi = yedekSayi/10;
            carpim = 1;
        }

        if(sayi == toplam)
            System.out.println("Girilen sayi armstrong sayidir");
        else
            System.out.println("Girilen sayi armstrong sayi degildir");
            System.out.println("123");
        System.out.println(toplam);



    }
}

import java.util.Scanner;

public class Question08 {
    /*
    String a;
    String b;
    public Question08(String a , String b){
        this();
    }
    public Question08(String a){
       this("a", "qqwe");
        this.a = a;

    }
    // Parametresiz cons
    // Not: Bulundugumuz constructor'dan bulundugumuz constructor'i cagiramiyoruz ve ayni zamanda
    // Ornegin Bir class'da 2 constuctor oldugunu varsayalim bu iki constructor'dan birbirlerini ayni anda cagiramiyoruz

    public Question08() {
        this("qe");
    }

    NOT: BU KISMI ANLAMAYAN ARKADASLAR GORUYORUZ KI DERSIN TEKRARINI DINLEMEMISSINIZ
     DERS TEKRARINI DINLEMEK ICIN SIZLERI BURAYA DAVET EDIYORUZ
     https://www.youtube.com/playlist?list=PLeZr8VTNC1oacH86YKWiKlvGH9sQPSUXT


     */






    //  replace() methodu kullanmadan bir String'deki bosluklari kaldiran Java kodunu yaziniz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bosluklardan arindirmak istediginiz bir String giriniz");
        String strWithSpaces = scan.nextLine();
        String strWithoutSpaces = removeSpaces(strWithSpaces);
        System.out.println(strWithoutSpaces);
    }

    public static String removeSpaces(String str){
        String bosStr = "";

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                bosStr += str.charAt(i);
            }
        }
        removeSpaces("asd");
        return bosStr;

    }
}

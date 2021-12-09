import java.util.Scanner;

public class Question01 {
    //Write a Java Program to reverse a string (Stringi tersine ceviren java kodu yaziniz)
    // input techpro
    // output orphcet
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ters cevirmek istediginiz String'i giriniz");
        String kelime = scan.nextLine();
        System.out.println("Girdiginiz kelime: " +  kelime + "\nKelimenin ters cevrilmis hali: " + reverseStr(kelime));


        /*
        String a = "Tech";
        a.concat("pro");
        System.out.println(a);
        StringBuilder sb = new StringBuilder("Tech");       // StringBuilder == mutable && String == unmutable
        sb.append("pro");
        System.out.println(sb);
        */

        System.out.println("Girdiginiz kelime: " +  kelime + "\nKelimenin ters cevrilmis hali: " + reverseStr2(kelime));
    }

    // 1.Yol: StringBuilder ile
    public static String reverseStr(String str){

        StringBuilder sb = new StringBuilder(str);
        String reversedString = sb.reverse().toString();
        return reversedString;
    }

    // 2.Yol: For dongusu ile
    public static String reverseStr2(String str){
        String reversedStr = "";    //Tech       hceT
        for(int i = str.length()-1; i>=0; i--){
            reversedStr = reversedStr + str.charAt(i);

        }

        return reversedStr;
    }
}

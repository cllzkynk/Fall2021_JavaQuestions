import java.util.Scanner;

public class Question09 {
    // Write a Java Program to find whether a string or number is palindrome or not.
    // Palindrome tersi'de kendine esit olan kelime kutuk -> kutuk 12321
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Palindrome kontrolu icin bir String giriniz");
        String str = scan.next();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println(sb + "\n=========================");

        if(sb.toString().equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }

        String tersCevrilmis = reverseStr2(str);
        if(tersCevrilmis.equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }

    public static String reverseStr2(String str){
        String reversedStr = "";    //Tech       hceT
        for(int i = str.length()-1; i>=0; i--){
            reversedStr = reversedStr + str.charAt(i);

        }

        return reversedStr;
    }
}

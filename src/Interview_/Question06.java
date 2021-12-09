import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Question06 {
     /*
	  kullanicidan iiki string aliniz
	  Stringlerim karakterleri ayni ise "Anagram" degil ise anagram degil yazdirin.
	  ornek; "Mary" and "army" and "RAMY" are Anagrams.
	*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki String girinz");
        String first = scan.next().toLowerCase(), second = scan.next().toLowerCase();

        String result = isAnagram(first, second) ? "Anagram" : "Anagram Degil";
        System.out.println(result);

    }

    public static boolean isAnagram(String s1, String s2){
       // boolean flag = false;
        String first[] = s1.split("");
        Arrays.sort(first);

        String second[] = s2.split("");
        Arrays.sort(second);

        /*
        if(Arrays.equals(first, second)){
            flag = true;
        }
        */


        //return flag;
        return Arrays.equals(first, second);

    }
}

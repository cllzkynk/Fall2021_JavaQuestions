package class_15;

import java.util.Arrays;

public class Question2 {
    //how do u reverse words
    public static void main(String[] args) {
        String sentence="you're awesome";
        String s[] = sentence.split(" ");
            String answer = "";

            for (int i = s.length - 1; i >= 0; i--) {
                StringBuilder stringBuilder=new StringBuilder(s[i]);
                System.out.println(stringBuilder);
                s[i]=stringBuilder.reverse().toString();
            }
            System.out.println(Arrays.toString(s));
        }

    }



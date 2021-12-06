package class_15;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String sentence = "What a beautiul day";
        String newString = sentence.replaceAll(" ", "");// for space we can also use \\s
        System.out.println(newString);


        System.out.println("__________TASK2__________");
        String name = "a v r s d g 1678900 2  ";
        System.out.println(name.replaceAll(" [^8-9]", "").length());// length will give us the number of char in the string starting from zero


        System.out.println("==========Task3=========");
        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(a); //original
        System.out.println(a.replaceAll("[A-Z a-z 0-9 \\s]", ""));//after applying the regex
        System.out.println(a.replaceAll("[A-Z a-z 0-9 \\s]", "").length());//after applying the regex and counting length




        }
    }


package class_15;

public class Quastion3 {
    public static void main(String[] args) {
        String original="mom";
        String reverse="";
       for(int i=original.length()-1;i>=0;i--) {
           reverse += original.charAt(i);
           System.out.println(reverse);
       }
          boolean palindrome=true;
          for(int i=0;i<original.length();i++){
             if(original.charAt(i)!=reverse.charAt(i)){
                 palindrome=false;
             }}
             if(palindrome){
                 System.out.println("PALINDROME!");

             }else{
                 System.out.println("NOT A PALINDROME");
             }

 StringBuilder stringBuilder= new StringBuilder("Anna");
        System.out.println(stringBuilder.reverse());

       }




    }


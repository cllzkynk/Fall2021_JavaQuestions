package MY_PRACTICE;

public class Task12 {
   public void isPalindrome (String string){
       int i=0;
       int j=string.length()-1;
       while(i<j){

           if(string.charAt(i)!=string.charAt(j)){
               System.out.println("string is not polindrome");
               return;
           }
           i++;
           j--;
       }
       System.out.println("string is polindrome");


   }
}






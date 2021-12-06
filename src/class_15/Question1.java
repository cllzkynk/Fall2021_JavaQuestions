package class_15;

public class Question1 {
    //how would you reverse a string character by character
    public static void main(String[] args) {
        String day="Sunday";
        int lenth=day.length();

        for(int i =day.length()-1;i>=0;i--){
            System.out.print(day.charAt(i));



        }
        System.out.println("________________________________________");
        System.out.println("-----another way--------");


        StringBuilder str = new StringBuilder("Programming");
        System.out.println(str.reverse().toString());
    }
}

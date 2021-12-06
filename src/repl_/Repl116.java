package repl_;

public class Repl116 {


    public static void main(String[] args) {
        bothEven(3,10);

    }

    static void bothEven(int num1, int num2){
        if(num1%2==0 && num2%2==0){
            System.out.println("true");

        }else{
            System.out.println("false");
        }
    }
}
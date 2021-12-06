package repl_;

public class Repl114 {
    public static void main(String[] args) {
       addition(15,15);
       multiplication(2,15);
       subtraction(30,10);

    }
    static void addition(int num1, int num2){
        num1=15;
        num2=15;
        System.out.print("Addition ");
        System.out.println(+num1+num2);

    }

    static void multiplication(int num1,int num2){
        System.out.print("Multiplication ");
        System.out.println(num1*num2);

    }
    static void subtraction(int num1, int num2){
        System.out.print("Subtraction ");
        System.out.println(num1-num2);
    }

}

package class_22;

public class Task3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with
     specific arguments and observe result.
     */
    static void sum(int a, int b){
        System.out.println(a+b);
    }
    static void sum( double a, double b){
        System.out.println(a+b);
    }
    static void sum (int a, int b, int c){
        System.out.println(a+b+c);

    }

    public static void main(String[] args) {
        Task3.sum(500,200);
        Task3.sum(12.2,12.5);
        Task3.sum(4,6,7);
    }
}

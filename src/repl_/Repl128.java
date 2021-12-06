package repl_;

public class Repl128 {
   public static int number;
   public void printNumber(){
       System.out.println(number);
   }



    public static void main(String[] args) {
       number=200;
       System.out.println(Repl128.number);

        Repl128 main=new Repl128();
        main.printNumber();
    }
}

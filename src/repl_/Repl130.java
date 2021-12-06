package repl_;

public class Repl130 {
    public String message;
    public void printMessage(){
        System.out.println("Programming is amazing.");
    }


    public static String message1;
    public static void printMessage1(){
        System.out.println("Java is awesome.");
    }




    public static void main(String[] args) {
        Repl130 message=new Repl130();
        message.printMessage();

        Repl130.printMessage1();


    }

}


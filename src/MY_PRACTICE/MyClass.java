package MY_PRACTICE;

public class MyClass {
    //non static field am=nd method
    public String message = "Hello World";

    public void displayMessage() {
        System.out.println("Message = " + message);
    }

    //static field and method
    public static String greetings = "Good morning";

    public static void displayGreetings() {
        System.out.println("Greeting = " + greetings);
    }

}
class StaticDemo {
    public static void main(String[] args) {
        MyClass sd=new MyClass(); //to access non static field we need to instantiate an object
        System.out.println(sd.message);
        sd.displayMessage();

        System.out.println(MyClass.greetings);
        MyClass.displayGreetings();


    }

}
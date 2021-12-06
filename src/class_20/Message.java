package class_20;

public class Message {
    Message(){
        System.out.println("hello a");
    }

    Message(int p){
        this();
    System.out.println("p");
    }

}
      class ThisKeyword{
    public static void main(String args[]){
        Message a=new Message(12);
    }
}
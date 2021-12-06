package class_21;

public class Davit extends Parent {
    Davit(){
        System.out.println("From Davit constructor");
    }
    Davit(int money){
        super(money);
        System.out.println("From Davit constructor");
    }

    public static void main(String[] args) {
        Davit davit=new Davit(1000);
        davit.print();


    }
}

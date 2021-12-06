package class_21;

public class GrandParents {
    int money;

    GrandParents(){
        System.out.println("Constructor from GrandParents");
    }

    GrandParents(int money){
        this.money=money;
        System.out.println("Constructor from the parent to initialize money");

    }
    void print(){
        System.out.println("I have this money "+money);
    }
}

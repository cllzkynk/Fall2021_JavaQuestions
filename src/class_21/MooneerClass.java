package class_21;

public class MooneerClass extends ParentClass {
    MooneerClass(){
        System.out.println("From child");
    }

    void marry(){
        super.marry();
        System.out.println("I will marry Kartina");
    }

    public static void main(String[] args) {
        MooneerClass mooneerClass=new MooneerClass();
        mooneerClass.marry();



    }
}

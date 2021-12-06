package class_20;

public class ParentChildTester {
    public static void main(String[] args) {
        Parent parent=new Parent();
        parent.printSomething(); // one ouptut

        Child child=new Child();
        child.printSomething();  //second output
        child.differentPrintMethod();

    }
}

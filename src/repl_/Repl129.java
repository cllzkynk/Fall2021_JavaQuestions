package repl_;

public class Repl129 {
    public String name;
    public int age;
    public String lastName;
    static int numberOfObj=0;

    Repl129(String obj1, int obj2, String obj3){
        this.name =obj1;
        this.age=age;
        this.lastName=obj3;
        numberOfObj++;

    }

    public static void main(String[] args) {
        Repl129 obj1=new Repl129("marta",26,"ostash");
        Repl129 obj2=new Repl129("taras",31,"ostash");
        Repl129 obj3=new Repl129("Maria",18,"liubobi");

        System.out.println(numberOfObj);



    }

}

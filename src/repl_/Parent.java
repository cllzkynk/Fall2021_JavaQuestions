package repl_;

public class Parent {
    Parent(){
        System.out.println("This is parent constructor");
    }

    static class Child extends Parent{
        Child (){
            super();
        }

        public static void main(String[] args) {
            Child child=new Child();

        }
    }
}
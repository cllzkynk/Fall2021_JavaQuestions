package class_22;

public class MethodOverloading {



    public void print() {
        System.out.println("Print with no arguments");
    }

    public void print(String name,int number) {
        System.out.println("Print with String name,int number arguments");
    }

    public void print(int number,String name) {
        System.out.println("int number,String name");

    }
    public void print(int number,String name,String lastName) {
        System.out.println("int number,String name,String lastName");
    }


public static void main(String[] args) {
        MethodOverloading methodOverloading=new MethodOverloading();
        methodOverloading.print();
        methodOverloading.print("name",123);
        methodOverloading.print(123,"name");
        methodOverloading.print(123,"Marta","Ostash");




    }
}
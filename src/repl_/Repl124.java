package repl_;

public class Repl124 {
    int a;
    double d;
    char ch;
    void print(){
        System.out.println(a);
        System.out.println(d);
        System.out.println(ch);
    }


    public static void main(String[] args) {
        Repl124 repl124=new Repl124();
        repl124.a=10;
        repl124.d=10.23;
        repl124.ch='a';
        repl124.print();

       Repl124 main1= new Repl124();
        main1.a=100;
        main1.d=100.23;
        main1.ch='s';
        main1.print();


    }
}


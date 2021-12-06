package repl_;

public class AnotherClass {
    private void method1(){
        System.out.println("This is Private Method");
    }
    void method2(){
        System.out.println("This is Default Method");
    }
    protected void method3(){
        System.out.println("This is Protected Method");
    }
    public void method4(){
        System.out.println("This is Public Method");
    }
    public static void main(String[] args){
       AnotherClass obj=new AnotherClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    } }





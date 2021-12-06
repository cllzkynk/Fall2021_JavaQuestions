package MY_PRACTICE;

public class Variables {

    int instanceNum=45; // this can be accessed within main class cause it's instance

   static  public void varsDemo(){
     int number1=10;// this one is destroyed as soon as we're outside the {}
     if(number1>10){//they're called local variables
         int number2=90;
     }
        System.out.println(number1);

    }
    public void varsDemo1(){
        int number2=-10;
        System.out.println( number2);

    }
}

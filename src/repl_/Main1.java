package repl_;

public class Main1 {
    String Color;
    int Year;
    String Make;



    public static void main(String[] args) {
        Main1 car1=new Main1();
        Main1 car2=new Main1();

        car1.Color= "Black";
        car1.Year=2019;
        car1.Make="BMW";

        car2.Color="White";
        car2.Year=2018;
        car2.Make="Toyota";

        System.out.println("Car color is "+car1.Color+" car year is "+car1.Year+" car model is "+car1.Make);
        System.out.println("Car color is "+car2.Color+" car year is "+car2.Year+" car model is "+car2.Make);
    }


}

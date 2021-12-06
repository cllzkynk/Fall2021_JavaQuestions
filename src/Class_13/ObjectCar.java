package Class_13;

public class ObjectCar {
    public static void main(String[] args) {


        Car car1=new Car();
        car1.numberOfDoors=4;
        car1.color="black";
        car1.size=4;
        car1.make="BMW";
        car1.model="i8";


        Car car2=new Car();
        car2.numberOfDoors=2;
        car2.color="blue";
        car2.size=2;
        car2.make="Lamorgini";
        car2.model="Gallardo";


        System.out.println("car1.make "+car1.make);
        System.out.println("car2.make "+car2.make);



    }
}

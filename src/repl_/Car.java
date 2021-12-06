package repl_;

public class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    Car(String make, String model, int numberOfDoors,int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    Car(String make,String model,int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.topSpeed=topSpeed;
        this.price=price;
        this.numberOfDoors=4;

    }
    Car(int numberOfDoors,int topSpeed,double price){
        this.make="unknown";
        this.model="unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    Car(String make, String model, int numberOfDoors){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=90;
        this.price=0;
    }
    public void display(){
        System.out. println(make + " " + model + " "+ numberOfDoors +" "+ topSpeed + " " + price);
    }

    public static void main(String[] args) {
        Car car1=new Car("Toyota","Prius",4,120,30000.0);
        car1.display();
        Car car2=new Car("Toyota","Prius",120,30000.0);
        car2.display();
        Car car3=new Car(4,120,30000.0);
        car3.display();
        Car car4=new Car("Toyota","Prius",4);
        car4.display();


    }

    }






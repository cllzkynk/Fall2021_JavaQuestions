package class_19;

public class Constructor2 {
    /*
    Write a Student class
    that have instance variables name and address.
     Create a constructor that will initialize those variables.
      Print name & address of given
      student using displayInfo method.
     */

    String name;
    String address;

    Constructor2 (String nameValue, String addressValue){
        this.name=nameValue;
        this.address=addressValue; //initialising a constructor


    }
    void displayInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        Constructor2 student1=new Constructor2("Marta","Brooklyn,NY");
        student1.displayInfo();
    }
}

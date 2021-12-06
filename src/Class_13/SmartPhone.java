package Class_13;

public class SmartPhone {
    String brand;
    String color;
    int model;
    String phoneNumber;


    void dial() {
        System.out.println(brand + " can dial");
    }
    void text() {
        System.out.println(brand + " can text");
    }
    void pics() {
        System.out.println(brand + " can take a picture");
    }
    void call(Long phoneNumber){

        System.out.println("Calling");}


        public static void main(String[] args) {

            SmartPhone phone1=new SmartPhone();
            phone1.brand="iphone";
            phone1.color="space gray";
            phone1.model=8;
            phone1.phoneNumber="34567890";



            System.out.println("My phone's model is "+ phone1.model);
            System.out.println();


        }
    }













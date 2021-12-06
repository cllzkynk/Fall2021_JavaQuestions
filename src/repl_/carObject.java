package repl_;

public class carObject {
    String model;
    double price;
    int quantity;

    carObject(String model,double price,int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;

    }
         void carStockValue(){
         double carStockValue=quantity*price;

            System.out.println(model+" Stock Value "+carStockValue);

    }

    public static void main(String[] args) {
        carObject car1=new carObject("Toyota 2019",2500000.0,1);
        car1.carStockValue();
        carObject car2=new carObject("BMW 2019",326490.0,2);
        car2.carStockValue();
    }

}

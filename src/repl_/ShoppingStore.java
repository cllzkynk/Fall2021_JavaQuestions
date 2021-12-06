package repl_;

public class ShoppingStore {
    String item;
    double price;
    int quantity;
    double totalValue;
    double sum;



    ShoppingStore(String item, double price,int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }
    public void itemTotalPrice(){
        double totalValue=quantity*price;
        System.out.println(item+" Total Value "+totalValue);

    }

    public static void main(String[] args) {
        ShoppingStore obj1=new ShoppingStore("Blanket",49.99,2);
        obj1.totalValue= obj1.price* obj1.quantity;
        obj1.itemTotalPrice();
        ShoppingStore obj2=new ShoppingStore("Mattress",219.59,2);
        obj2.itemTotalPrice();
        obj2.totalValue=obj2.price* obj2.quantity;
        double sum=obj1.totalValue+obj2.totalValue;
        System.out.println("You purchased "+sum+" Today");






    }
}

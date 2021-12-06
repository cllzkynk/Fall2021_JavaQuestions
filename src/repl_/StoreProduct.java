package repl_;

public class StoreProduct {
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    StoreProduct(String label,double price, String category,boolean
            hasExpiration,int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    StoreProduct(String label,double price,int stock){
        this.label=label;
        this.price=price;
        this.category="misc";
        this.hasExpiration=false;
        this.stock=stock;
    }

    StoreProduct(String label,double price){
        this.label=label;
        this.price=price;
        this.stock=0;
    }
    public void displayOut(){
        System.out.println(label+" "+price+" "+category
                +" "+hasExpiration+" "+stock);
    }

    public static void main(String[] args) {
        StoreProduct p1=new StoreProduct("Eggs",3.0,"Produce",true,10);
        p1.displayOut();
        StoreProduct p2=new StoreProduct("Paper Towels",2.0,24);
        p2.displayOut();
        StoreProduct p3=new StoreProduct("Paper Towels",2.0);
        p3.displayOut();
    }

}

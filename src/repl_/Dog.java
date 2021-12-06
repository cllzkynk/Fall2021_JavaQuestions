package repl_;

public class Dog {
    public String dogName;
    public double dogWeight;
    static String dogBreed="Mutt";

    Dog(String dogName,double dogWeight,String dogBreed){
        this.dogName=dogName;
        this.dogWeight=dogWeight;

    }
    public void PrintDetails(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);

    }

    public static void main(String[] args) {
        Dog dog1=new Dog("Tarzan",50.0,"Mutt");
        dog1.PrintDetails();

        Dog dog2=new Dog("Lucy",10.0,"Mutt");
        dog2.PrintDetails();

    }


}

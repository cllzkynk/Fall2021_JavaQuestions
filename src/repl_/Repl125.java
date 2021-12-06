package repl_;

public class Repl125 {
    String nameOfACountry;
    String capital;
    int population;

    void displayInfo(){
        System.out.println("The capital of "+nameOfACountry+" is "+capital+" and population is "+population);
    }

    public static void main(String[] args) {
        Repl125 main=new Repl125();
        main.nameOfACountry="Ukraine";
        main.capital="Kyiv";
        main.population=43000000;
        main.displayInfo();

        Repl125 main1=new Repl125();
        main1.nameOfACountry="the USA";
        main1.capital="Washington DC";
        main1.population=330000000;
        main1.displayInfo();
    }
}

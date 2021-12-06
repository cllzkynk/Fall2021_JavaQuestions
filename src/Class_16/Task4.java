package Class_16;

public class Task4 {

    static void Hello(String country) {
        String hello = "";
        switch (country) {
            case "Spain":
                hello = "Hola";
                break;
            case "Italy":
                hello = "Ciao";
                break;
            case "Russia":
                hello = "Privet";
                break;
            case "China":
                hello = "Ni hao";
                break;
            default:
                hello = "No information";
                break;
        }
        System.out.println("Hello in " + country + " is " + hello);
    }


}
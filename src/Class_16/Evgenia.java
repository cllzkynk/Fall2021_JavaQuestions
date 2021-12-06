package Class_16;

public class Evgenia {
    public static void main(String[] args) {
        LargestNumber(100, 10);
        IsEvenOrOdd(99);
        IsPalindromeOrNot("Anna");
        IsPalindromeOrNot("My gym");
        IsPalindromeOrNot("Was it a cat I saw");
        HelloInDifferentLanguage("Spain");
        HelloInDifferentLanguage("Italy");
        HelloInDifferentLanguage("Russia");
        HelloInDifferentLanguage("China");
        HelloInDifferentLanguage("France");
    }
    //    methods
    public static void LargestNumber(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is larger than " + num1);
        } else {
            System.out.println("Numbers are equal");
        }
    }
    public static void IsEvenOrOdd(int num1) {
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even number");
        } else {
            System.out.println(num1 + " is odd number");
        }
    }
    public static void IsPalindromeOrNot(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        reverse = reverse.replaceAll(" ", "");
        System.out.println("Is " + word + " palindrome? " + reverse.equalsIgnoreCase(word.replaceAll(" ", "")));
    }
    public static void HelloInDifferentLanguage(String country) {
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

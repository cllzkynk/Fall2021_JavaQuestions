package InterviewSorulari;

public class Java_29_ArmstrongNumber {

    static int num = 153;

    public static void main(String[] args) {
        // ArmstrongNumber
        // her bir basamağın o sayının basamak sayısı kadar üssü alınarak toplanmasıdır.
        //3 basamaklilar icin yapalim

        //153 = 1*1*1 5*5*5 3*3*3 = 1 + 125 + 27 = 153

        yol1();

        String num1="153";

        yol2(num1);

        yol3(); // istedigimiz basamak sayisina gore bulma
    }

    private static void yol3() {
        int num2= 9474, orjSayi,kalan,toplam=0 ,i =0;
        orjSayi= num2;
        for (; orjSayi!=0; orjSayi/=10) { // basamak sayisi
            i++; // 3
        }
        System.out.println(orjSayi+" ******************");
        orjSayi= num2; // bold icin sayi 0 olur. O yuzden tekrar atadik
        for (; orjSayi!=0; orjSayi/=10) {
            kalan= orjSayi%10;
            toplam+= Math.pow(kalan, i); // pow us alma. kalan:taban i:us 4^3
        }
        if(toplam == num2)
            System.out.println(num2 + " is an Armstrong number.");
        else
            System.out.println(num2 + " is not an Armstrong number.");

    }



    public static void yol2(String num1) {
        char[] s= num1.toCharArray();
        int bas= s.length;
        int sum=0;

        for (char each : s) {
            int temp=1;
            int i=Integer.parseInt(Character.toString(each));
            for (int j = 0; j <= bas-1; j++) {
                temp*=i;
            }
            sum+=temp;
        }

        if(sum==Integer.parseInt(num1)){
            System.out.println(num1 + " is an Armstrong number");
        }
        else System.out.println(num1 + " is not an Armstrong number");
    }

    private static void yol1() {
        //static int num = 153;
        int number;
        int temp;
        int total = 0;

        number=num;
        while (number!=0) { // 153-15
            temp= number%10; // 3-5
            total= total+temp*temp*temp; // 0+(3*3*3)-27+(5*5*5)...153
            number/=10; // 15-1-0
        }
        if (total==num) {
            System.out.println(num + " is an Armstrong number");
        }
        else
            System.out.println(num + " is not an Armstrong number");
    }

}

import java.util.Scanner;

public class Question02 {
    // kullanicinin girdigi sayi kadar fibonacci sayisi yazdiran kod yaziniz
    // input 5
    // output 0 1 1 2 3
    //             a b c            1. a = 0 b = 1 c = 1
    //             0 1 1 2 3 5      2. a = 1 b = 1 c = 2
    //               a b c          3. a = 1 b = 2 c = 3
    //                 a b c        4. a = 2 b = 3 c = 5
    //                   a b c
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac tane fibonacci dizisi gormek istersiniz?");
        int count = scan.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < count; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}

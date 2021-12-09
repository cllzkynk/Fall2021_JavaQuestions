package _07_Method_Creation.��z�mler.copy�özümler;

public class Soru_16 {

        /*
        Problem Tanımı:
        isUnique adında bir method oluşturun.
        Parametre olarak int array alır.
         ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür.
         (benzerlik yoksa true, var ise false).
        örneğin, list isminde bir array'imiz varsa,
        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        Bu listede tekrarlanan eleman olmadığı için sonuç true dönmelidir.

        int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
        Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.
             */

    public static void main(String[] args) {

        int[] arr = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        //   int[] arr = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};

        System.out.println(isUnique(arr));


    }

    public static boolean isUnique(int[] arr) {

        boolean b = false;  //true yap

        for (int i = 0; i < arr.length; i++) {//kıyas edilecek eleman
            for (int j = 0; j < arr.length; j++) {//kıyas eden eleman

                if (i == j && arr[i] == arr[j]) {//kıyas eden ve edilenin eğer yerleri indexleri farklı iken değerleri aynı ise false olsyn
                    b = true;  //false ve yukarı i!=j
                    break;
                }
            }
        }
        return b;
    }
}

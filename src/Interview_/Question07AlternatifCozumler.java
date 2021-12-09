import java.util.*;

public class Question07AlternatifCozumler {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i = 4; i >= 0; i--) {
            for (int w : list) {
                System.out.print(w + " ");
            }
            System.out.println();
            list.remove(list.get(i));


        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        for (int i = 4; i >= 0; i--) {
            System.out.println(list2);
            list2.remove(list2.get(i));
        }


    }
}
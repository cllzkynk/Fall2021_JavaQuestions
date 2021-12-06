package class_15;

public class splitString {
    public static void main(String[] args) {
        String subject="I love Java and I want to learn more";
        String [] splittedSub = subject.split(" ");
        System.out.println(splittedSub.length);
        for (int i = 0; i< splittedSub.length; i++) {
            System.out.println(splittedSub[i]);
        }
    }
}

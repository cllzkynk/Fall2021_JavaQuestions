package repl_;

public class Repl93 {
    public static void main(String[] args) {
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";

        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf(" "));

        int indexOfSubStr=str.toLowerCase().indexOf(target1.toLowerCase());
        System.out.println(indexOfSubStr);

        int indexodSubStr2=target1.toLowerCase().indexOf(target2);
        System.out.println(indexodSubStr2);




    }
}

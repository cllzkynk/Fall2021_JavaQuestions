package repl_;

public class Repl118 {
    public String spaceOut(String phrase) {
        String spaced = "";
        for (int i = 0; i <= phrase.length()-1; i++) {
            spaced += phrase.charAt(i) + " ";
        }
        return spaced;
    }
    public static void main (String [] args) {
        Repl118 mm = new Repl118();
        System.out.println(mm.spaceOut("hello"));
        System.out.println(mm.spaceOut("technology"));
    }
}



    

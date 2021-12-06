package repl_;

public class MainRepl132 {
    public static String mixString(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        int min = Math.min(s1Length, s2Length);

        final StringBuilder sb = new StringBuilder(s1Length + s2Length);
        for (int i = 0; i < min; i++) {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
        if (s1Length > s2Length) {
            sb.append(s1, s2Length, s1Length);
        } else if (s1Length < s2Length) {
            sb.append(s2, s1Length, s2Length);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String firstValue = mixString("12345", "abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy", "hello");
        System.out.println(secondValue);
    }


}
import java.util.ArrayList;

public class RecursionString {
    static void main(String[] args) {
        String s = "baccad";
        String a = "bdapplefg";
        String b = "bdapplfge";

        String p = "";
        skip(p, s);
        System.out.println(skip2(s));
        System.out.println(skipApple(a));
        System.out.println(skipAppNotApple(b));
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skip2 ( String s ) {
        if (s.isEmpty()) {
            return "";
        }
        char ch  = s. charAt(0);
        if (ch == 'a') {
            return skip2(s.substring(1));
        }
        else {
            return ch + skip2(s.substring(1)) ;
        }
    }

    static String skipApple ( String s ) {
        if ( s.isEmpty() ) {
            return "";
        }

        if ( s.startsWith("apple")) {
            return skipApple(s.substring(5));
        }
        else {
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }

     static String skipAppNotApple ( String s ) {
        if ( s.isEmpty() ) {
            return "";
        }
        if ( s.startsWith("app") && !s.startsWith("apple")) {
            return skipAppNotApple(s.substring(3));
        }
        else {
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
     }
}

public class Palindrome  {
    static void main(String[] args) {
        String str= null;
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str) {
        if ( str == null || str.length()==0) {
            return true;
        }
        str= str.toLowerCase();
        for ( int i=0; i<str.length()/2; i++) {
//            char start=str.charAt(i);
//            char end=str.charAt(str.length()-i-1);
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }

        }
        return true;
    }

}

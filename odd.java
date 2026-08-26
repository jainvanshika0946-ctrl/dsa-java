public class odd {
    public static void main (String [] args) {
        int n= 54;
        System.out.println(isOdd(n));
    }
    private static boolean isOdd(int n) {
        return (n & 1)==1;
    }
}

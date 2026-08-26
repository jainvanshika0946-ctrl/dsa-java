
public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(LCM(2, 10));
        System.out.println(LCM(224, 105));
        System.out.println(gcd(224, 105));
    }
    static int gcd ( int a, int b) {
        if ( a == 0 ) {
            return b;
        }
        return gcd ( b%a, a ) ;
    }
    static int LCM( int a , int b) {
        return (a*b)/ gcd (a,b) ;
    }
}

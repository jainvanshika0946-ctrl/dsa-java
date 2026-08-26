import org.w3c.dom.ls.LSOutput;

public class recursion1st {
    public static void main(String[] args) {
        System.out.println(countZero(1023002));
        System.out.println(palindrome(12343021));
//        System.out.println(sumOfnNatural(6));
        System.out.println(reverse2(2134));
        reverse1(4231);
        System.out.println(sum);
    }
    static void func( int n) {
        if ( n==0) {
            return;
        }
        System.out.println(n);
        func(n-1);
    }
    static void funRev ( int n) {
        if ( n==0) {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
    static void bothFunc ( int n ) {
        if ( n==0 ){
            return;
        }
        System.out.println(n);
        bothFunc(n-1);
        System.out.println(n);
        
    }
    static int factorial ( int n ) {
        if ( n<=1) {
            return 1 ;
        }

        return n*factorial(n-1);
    }
    static int sumOfnNatural ( int n ) {
        if ( n <=1 )  {
            return 1;
        }
        return n + sumOfnNatural(n-1);
    }


    static int sumOfDigits ( int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
    static int productOfDigits ( int n ) {
        if (n%10 == n) {
            return n;
        }
        return n % 10 * productOfDigits(n / 10);
    }
    static int sum = 0;
    static void reverse1 ( int n ) {
        if ( n==0 ) {
            return ;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        reverse1 (n/10);
    }
    static int reverse2(int n) {
        int digits = (int) (Math.log10(n)) + 1 ;
        return helper (n,digits);
    }

    private static int helper(int n , int digits) {
        if ( n%10 == n ) {
            return n ;
        }
        int rem = n % 10;
        return rem *(int)(Math.pow(10,digits-1)) + helper (n/10,digits-1);
    }

    static boolean palindrome ( int n ) {
        return n == reverse2(n);

    }
    static int countZero(int n) {
        return helpCZ( n, 0);

    }
    private static int helpCZ( int n, int c) {
        if (n == 0) {
                return c;
            }
        int rem = n%10;
        if ( rem == 0 ) {
            return helpCZ( n/10 , c+1);
        }
        return helpCZ( n/10, c);
    }
//https://leetcode.com/medal/?showImg=1
}

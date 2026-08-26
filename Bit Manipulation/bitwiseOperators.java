public class bitwiseOperators {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(isOdd(n));
        System.out.println(findithBit(n,2));

        System.out.println(setithBit(n,2));

        System.out.println(resetBit(n,2));
        System.out.println(countSetBits(n));

//finding number of  digits in base b
        int a =10;
        int b= 2;
        int ans = (int) (Math.log(a)/Math.log(b)) +1;
        System.out.println(ans);
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
    static int setbits ( int n ) {
        int count = 0;
        while ( n!=0) {
            count ++;
            n -= (n & -n);
        }
        return count;
    }

    static int findithBit ( int num, int n ) {
        int ans = num & ( 1 << (n-1)) ;
        return ans;
    }

    static int setithBit ( int num , int n) {
        int ans = num | ( 1 <<  ( n-1));
        return ans;
    }
    static int resetBit ( int num, int n ) {
        int ans = num & ~ ( 1 << (n-1));
        return ans;
    }
    static int countSetBits ( int n) {
        int count =0;
        while ( n != 0) {
            if ( (n & 1) == 1 ) {
                count++;

            }
            n >>= 1;

        }
        return count;
    }
}

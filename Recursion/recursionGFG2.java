public class recursionGFG2 {
    public static void main(String[] args) {
        System.out.println(sumOfDigitOfNumber(23405));
        System.out.println(productOftwo(5,20));
    }
    public static int sumOfDigitOfNumber (int n) {
        if ( n== 0) {
            return 0;
        }
        int rem = n%10 ;
        return rem + sumOfDigitOfNumber(n/10);
    }
    public static int productOftwo ( int x, int y) {
        if (y==0 ) {
            return 0;
        }
        if( x < y ) {
            return productOftwo(y,x);
        }

        return x + productOftwo(x , y-1);
    }

//    public static boolean primeNumber (int n, int i) {
//        // If n< 2 not prime, n% cc
//
//    }


}

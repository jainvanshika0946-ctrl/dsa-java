public class bitInspector {
    static void main(String[] args) {
        int num = 16 ;
        int [] array = {2,4,6,4,2} ;

        System.out.println(" Number : " + num );
        System.out.println("Binary : " + Integer.toBinaryString(num));
        System.out.println("Is even : " + isEven(num));
        System.out.println("Bit count: " + BitCount(num));
        System.out.println("Multiply by 2 : " + multipleOf2(num));

        System.out.println(" Divide by 2 : " + divide(num));
        System.out.println("Unique in : " + unique(array ));

    }


    static boolean isEven ( int n ) {
        return (n & 1) == 0 ;
    }

    static int BitCount ( int n) {
        int count = 0;
        while (n!=0) {
            if ( (n&1) == 1) {
                count++ ;
            }
            n >>= 1;
        }
        return count;
    }

    static int multipleOf2 ( int n) {
        return n << 1 ;
    }

    static int divide ( int n ) {
        return n >> 1 ;
    }
    static int unique ( int [] nums ) {
        int unique = 0 ;
        for ( int n : nums ) {
            unique ^= n ;
        }
        return unique ;
    }



}

public class NewtonRsqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt ( double n ) {
        double x = n ;
        double root;
        while ( true ) {
            root = 0.5 * ( x+ (n/x)) ;
            if (Math.abs(root - x) < 1 ) { //replace 1 with 0.5 to get more precised value
                break;
            }
            x= root;
        }
        return root;
    }
}

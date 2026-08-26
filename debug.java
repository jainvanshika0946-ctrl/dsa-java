public class debug {
    public static void main(String[] args) {
        boolean ans = armstrongNumber(371);
        System.out.println(ans);
    }
        static boolean armstrongNumber(int n) {
            // code here
            int sum = 0;
            int length = (int)(Math.log10(n))+1 ;
            for ( int i =0; i < length; i++) {
                int digit = n%10 ;
                sum = sum + digit*digit*digit ;
                n = n/10 ;

            }
            return sum == n;

    }
}

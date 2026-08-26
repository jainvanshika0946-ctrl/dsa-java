public class canSit {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(canSit(n)); ;

    }
    static boolean canSit(int n){
        return bit1(n) && bit2A(n , 3);
        }


    static boolean bit1 ( int n ) {
        n = n >> 1 ;
        return ( n & 1) == 1;

    }
    static boolean bit2A ( int n , int a ) {
        return (n & (1 << a )) != 0 ;
    }
    static boolean bit2B ( int n , int a ) {
        n = n>> 3;
        return (n & 1) == 1 ;
    }
}
//Write a Java method that takes an int eligibility and checks only whether the student has no backlogs (bit 1) AND is registered (bit 3). Return true if both conditions are met.
//static boolean canSit(int eligibility) {
//    // your code here
//}
//
/// / Test cases:
//canSit(15)  // 1111 → true  (both bit1 and bit3 are set)
//canSit(10)  // 1010 → true  (both bit1 and bit3 are set)
//canSit(5)   // 0101 → false (bit1 not set)
//canSit(8)   // 1000 → false (bit1 not set)



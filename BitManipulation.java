import java.lang.Math;

public class BitManipulation {
    static void main(String[] args) {
        int num=5;
        int pos =1;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(nthBitisSet(num,pos));
        System.out.println(countSetBit(num));
        System.out.println(findithBit(num,pos));
        System.out.println(SetithBit(num,pos));
        System.out.println(ResetithBit(num,pos));
        System.out.println(posOfRightmostSetBit(num));
    }

    static boolean  nthBitisSet (int num, int pos) {
        if ( (num & (1<<pos-1)) !=0) {
            return true;
        }
        else {
            return false;
        }

    }
    static int setbits ( int n ) {
        int count = 0;
        while ( n > 0) {
            count ++;
            n -= ( n & -n); // n = n & (n-1);
        }
        return count;
    }

    static int countSetBit (int num) {
        int count=0;
        while ( num != 0) {
            count += ( num & 1);
            num >>= 1;
        }
        return count;
    }
    static int findithBit (int num,int pos) {

        return (num & (1 << pos-1 ));

    }
    static int  SetithBit ( int num, int pos) {
        num = Integer.parseInt(Integer.toBinaryString(num));
        return ( num | (1 << pos-1) );
    }
    static int  ResetithBit ( int num, int pos) {

        return ( num & (~(1 << (pos-1))));
    }
    static int posOfRightmostSetBit (int num) {
        if (num == 0) {
            return 0;
        }
        int result = num & (~num + 1) ;
        return (int) ( Math.log(result) / Math.log(2)) + 1;
    }

}

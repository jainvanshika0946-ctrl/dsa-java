import java.util.Arrays;

public class findUniqueElem {
    static void main(String [] args) {
        int [] arr1= {2,3,4,1,2,1,3,6,4};
        int [] arr2= {-2,3,2,4,-5,5,-4};
        System.out.println(ans1(arr1));
//        System.out.println(ans2(arr2));
    }

    static int ans1 (int [] arr) {
        int unique=0;
        for ( int num: arr) {
            unique^=num;
        }
        return unique;

    }
//    static int ans2 (int [] arr) {
//        int unique=0;
//        for ( int num: arr) {
//            unique^=num;
//        }
//        return unique;
//
//    }
}

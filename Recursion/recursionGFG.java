
import java.util.Arrays;

public class recursionGFG {
    public static void main(String[] args) {
//        int [] A = {1,2,3,4,5};
//        printTriangle(A);
//        Triangle(A);
//        System.out.println(Arrays.toString(A));


        int[] arr = {1, 4, 3, -5, -4, 8, 6};
//        int [] result = minMax(arr);
//        System.out.println(Arrays.toString(result));

//        String str = "geeksforGeeKS";
//        char res = FirstUppercase(str, 1);
//        if (res == 0)
//            System.out.println("No uppercase letter");
//        else
//            System.out.println(res);
//
//        stringLength(str);

    }
//48
//20, 28
//8, 12, 16
//3, 5, 7, 9
//1, 2, 3, 4, 5
    static void printTriangle (int [] A) {
        if ( A.length == 0) {
            return;
        }
        int [] result = new int [A.length -1 ];
        for ( int i = 0; i< A.length-1 ; i++) {
            result [i] = A[i] + A[i+1];

        }
        printTriangle(result);
        System.out.println(Arrays.toString(A));
    }
//Without using For loop inside
    static void Triangle (int [] A) {
        if ( A.length == 1) {
            return;
        }
        int [] result = new int [A.length -1 ];
        helper ( result, A, 0);
        Triangle(result);
        System.out.println(Arrays.toString(result));


    }
    static int [] helper( int [] result, int[] A, int index) {
        if (index == A.length -1) {
            return result;
        }
        result [index] = A[index] + A[index+1];
        return helper(result, A , index+1);
    }





    public static int [] minMax ( int [] a) {
        if (a == null || a.length == 0) {
            return new int[]{};
        }
        int [] result = {a[0],a[0]};
        return helperMinMax ( result, a, a.length -1);

    }

    private static int [] helperMinMax ( int [] result, int [] a, int index) {
            if (index < 0 ) {
                return result;
            }
            if (a[index] > result[1]) {
                result[1] = a[index];
            }
            if ( a[index] < result[0] ) {
                result[0] = a[index];
            }
            return helperMinMax (result, a, index-1);

    }
    // first uppercase letter.

    public static char FirstUppercase  (String str, int i) {
        if (str.charAt(i) == '\0' ) {
            return str.charAt(i);
        }
        if ( Character.isUpperCase(str.charAt(i)) ) {
            return str.charAt(i);
        }
        return FirstUppercase(str,i+1);
    }
    //lengthof string
//    public static int stringLength ( String str ) {
//        if ( str.equals(" ")) {
//            return 0;
//        }
//        return stringLength(str.substring(1)) + 1;
//    }



}

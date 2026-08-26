import java.util.ArrayList;
public class recursion2nd {
    static void main(String[] args) {
        int [] arr = {1, 4, 3, -5, -4, 3, 4, 8, 6};
//        System.out.println(checkSortedArray(arr,0));
//
//        System.out.println(linearSearchme(arr, -4, 2));
//        System.out.println(findLastIndex(arr, 3,4));
//        findAllIndex(arr, 1,0);
//        System.out.println(list);

//        System.out.println(ListOfIndex(arr, 3, 0, new ArrayList<> ()));

        System.out.println(findAllIndex(arr, 3, 0));

        int [] array = {5,6,7,8,9,1,2,3};
        System.out.println(RBinarySearch(array,2 , 0,arr.length-1));

    }
    public static boolean checkSortedArray (int [] a, int i) {
        if ( i == a.length-1) {
            return true;
        }
        return (a[i] < a[i+1]) && checkSortedArray (a, i+1);

    }

    public static boolean linearSearchme ( int []a ,int target, int i) {
        if ( a[i] == target) {
            return true;
        }
        return linearSearchme(a , target, i+1) ;
    }
    public static boolean linearSearchKK ( int []a ,int target, int i) {
        if ( i == a.length) {
            return false;
        }
        return a[i]== target || linearSearchKK(a , target, i+1) ;
    }

    public static int findLastIndex( int [] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findLastIndex(arr, target, index - 1);
        }
    }
//    static ArrayList<Integer> list = new ArrayList<> ();
//    static void findAllIndex ( int[] arr, int target, int index) {
//        if (index == arr.length) {
//            return;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//        }
//        findAllIndex(arr, target, index + 1);
//
//    }
//return an array list of indices of repeated elements
    static ArrayList ListOfIndex( int [] a, int target, int index, ArrayList<Integer> list ) {
        if (index == a.length) {
            return list;
        }
        if (a[index] == target) {
            list.add(index);
        }
        return ListOfIndex(a, target, index + 1, list);
    }
// without using any arguments return the arraylist
    static ArrayList <Integer> findAllIndex ( int [] a, int target, int index ) {
        ArrayList <Integer> list = new ArrayList<>() ;
        if ( index == a.length ) {
            return list;
        }
        if ( target == a[index] ) {
            list.add(index) ;
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(a, target, index + 1 ) ;
        list.addAll(ansFromBelowCalls) ;

        return list;
    }

    static int RBinarySearch ( int [] a, int target , int s, int e) {
        if ( s > e) {
            return -1;
        }
        int mid = s+(e-s)/2 ;
        if ( a[mid] == target ) {
            return mid ;
        }
        if ( a[s] <= a[mid] ) {
            if (target < a[mid] && target > a[s]) {
                return RBinarySearch (a, target, s , mid-1) ;
            }
            return RBinarySearch( a, target, mid+1, e) ;
        }
        if ( target >= a[mid] && target <= a[e] ) {
            return RBinarySearch( a, target, mid+1, e) ;
        }
        else {
            return RBinarySearch (a, target, s , mid-1) ;
        }
    }
}

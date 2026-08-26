public class infiniteArrayBS {
    static void main(String[] args) {
        int [] a = {2,3,4,5,6,7,8,9,12,23,32,34,45,47,55,62,63,65,76,78,89};
        int target = 45;
        int ans = SearchInfiniteArray(a,target);
        System.out.println(ans);
    }
    //by infinite we mean we dont know the array length
    //we dont know start and end
    //optimize how to find start and end
    //take a window and increase its size exponentially
    //just reverse(bottom to up) how you use BS normally, log n steps
    public static int SearchInfiniteArray ( int []a , int target) {
        // first start with a box of size 2
        int s = 0;
        int e = 1;
        while ( target > a[e]) {
            int temp = e+1 ;
            e = e + (e-s+1)*2 ;
            s = temp ;
        }
        return binarySearch(a,target,s,e);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

}

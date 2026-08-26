public class MountainArray {
    static void main(String[] args) {
        int [] a = {0,2,1,0} ;
        System.out.println(peakIndexInMountainArray(a));
    }
    public static int findInMountainArray(int []a, int target ) {
        int peak = peakIndexInMountainArray(a);
        int firstTry = binarySearch(a, target, 0, peak);
        if (firstTry != -1 ) {
            return firstTry;
        }
        return binarySearch( a,target, peak+1, a.length-1 );
    }
    public static int peakIndexInMountainArray(int []a) {
        int s =0;
        int e= a.length -1 ;
        while (s<e){
            int m = s+(e-s)/2 ;

            if ( a[m] > a[m+1] ) { //you are in dec part of array
                e = m ; // not m-1 because this index maybe the largest element
            }
            else {
                s = m+1; // obviously start wouldnt be the largest element
            }
        }
        return e ; // or return end as both are =
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        start = 0;
        end = arr.length - 1;

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

import java.util.Arrays;

public class mergesortRec {
    public static void main(String[] args) {
        int [] a = {3,4,1,2} ;
        mergeSortInPlace(a,0,a.length);
        System.out.println(Arrays.toString(a));

        int [] ans = MergeSort(a);
        System.out.println(Arrays.toString(ans));
    }
    static int [] MergeSort ( int [] a) {
        if ( a.length == 1 ) {
            return a ;
        }
        int mid = a.length/2;
        int [] left= MergeSort(Arrays.copyOfRange(a,0,mid));
        int [] right= MergeSort(Arrays.copyOfRange(a,mid, a.length));

        return merge(left,right);
    }
    static int [] merge ( int [] first, int [] second) {
        int [] mix = new int [first.length + second.length] ;
        int i = 0;
        int j = 0 ;
        int k = 0;
        while ( i < first.length && j < second.length ) {
            if ( first[i] < second[j] ) {
                mix[k] = first[i] ;
                i++ ;
            }
            else {
                mix[k] = second[j];
                j++ ;
            }
            k++ ;
        }
        // it may be possible that one of the arrays is not complete
        //copy remaining elements
        while ( i< first.length ) {
            mix[k]= first[i];
            i++ ;
            k++ ;
        }
        while ( j< second.length ) {
            mix[k]= second[j];
            j++ ;
            k++ ;
        }
        return mix ;
    }
    static void mergeSortInPlace ( int []a , int s, int e ) {
        if ( e-s == 1 ) {
            return ;
        }
        int mid = (s+e)/2 ; // s+(e-s)/2
        mergeSortInPlace( a, s, mid);
        mergeSortInPlace( a,mid, e) ;

        mergeInPlace (a,s,mid,e);
    }
    static void mergeInPlace ( int[]a , int s, int m, int e ) {
        int [] mix = new int [e-s];
        int i = s ;
        int j = m ;
        int k = 0;
        while (i < m && j < e) {
            if ( a[i]< a[j]) {
                mix[k] = a[i];
                i++;
            }
            else {
                mix[k]= a[j];
                j++;
            }
            k++;
        }
        while ( i < m ) {
            mix[k] = a[i];
            i++ ;
            k++ ;
        }
        while (j<e ) {
            mix[k] = a[j];
            j++;
            k++;
        }
        for ( int l =0; l< mix.length; l++ ) {
            a[s+l] =  mix[l];
        }
    }
}



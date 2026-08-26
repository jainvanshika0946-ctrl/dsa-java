import java.util.Arrays;
//swapping and reversing
public class ArrayQues {
    public static void main(String[] args) {
        int[] arr = {23, 34, 43, 31, 44, 54};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        
        //max element in a range
        int [] arr={23,43,22,11,44};
        maxRange(arr,2, 5);
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }
    //max element in a range
    static int maxRange(int []arr, int start,int end){
       if(end > start){
           return -1;
       }
       if(arr==null){
           return -1;
       }
       int maxval=arr[start];
       for(int i=start;i<=end;i++){
           if(arr[i]>maxval){
               maxval=arr[i];
           }
       }
       return maxval;
   }
}



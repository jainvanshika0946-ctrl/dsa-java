import java.util.Arrays;
public class bublesort {
    public static void main (String [] args) {
        int [] arr={23,44,22,34,67,87};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        boolean swapped = true;
        for (int i=0; i<arr.length;i++) {
            swapped=false;
            for(int j=1;j<arr.length-1;j++) {
                if( arr[j]>arr[j-1]) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

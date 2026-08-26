import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class rrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("array of objects");
        System.out.println(" ");
        String[] str = new String[4];
        for (int i = 0; i < 4; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}

////MULTIDIMENSIONAL ARRAYS
//        System.out.println(" ");
//        int[][]marr=new int[3][3];
//        for(int i=0;i<marr.length;i++){
//            for (int j=0; j<marr[i].length;j++){
//                marr[i][j]=sc.nextInt();
//            }
//        }
////OUTPUT1
////        for(int i=0;i<marr.length;i++){
////            for(int j=0;j<marr[i].length;j++){
////                System.out.print(marr[i][j]+" ");
////            }
////            System.out.println();
////        }
////output2
//          for (int row = 0; row < marr.length; row++) {
//            System.out.println(Arrays.toString(marr[row]));
//       }
////output3
//          for(int[] a : marr) {
//              System.out.println(Arrays.toString(a));
//            }
//arraylist
//          ArrayList<Integer> list= new ArrayList<Integer>(5);
//          list.add(943);
//          list.add(432);
//          list.add(422);
//          list.add(4323);
//          list.add(235);
//
//          System.out.println(list.contains(432));
//          System.out.println(list);
//          list.set(0,99);
//          list.add(789);
//          System.out.println(list);
//          list.remove(2);
//          System.out.println(list);
//          System.out.println(list.get(2));
//          System.out.println(list.size());
//
//        // Sort cars
//          Collections.sort(list);
////ArrayList with the for-each loop
//          for(int i: list){
//              System.out.println(i);
//          }
//
//          list.clear();
//swapping elements
//         int[] array={1,4,2,5,6,8,9};
//         reverse(array);
//         System.out.println(Arrays.toString(array));
//          System.out.println(maxRange(array,2,5));
//        System.out.println(swap(array,0,4));
//
//    }
//        static void reverse(int[] array){
//            int start=0;
//            int end=array.length-1;
//            while(start<end){
//                int temp=array[start];
//                array[start]=array[end];
//                array[end]=temp;
//                start++;
//                end--;
//                }
//            }
//        }

//        static void swap(int[] array, int index1, int index2){
//            int temp=array[index1];
//            array[index1]=array[index2];
//            array[index2]=temp;
  //  }
//        static int maxRange(int[]array,int start, int end){
//            int max=array[start];
//            for (int i=start;i<=end;i++){
//                if(array[i]>array[start]){
//                    max=array[i];
//                }
//            }
//            return max;
//
//
//        }

//}
//swapping elements


import java.util.Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] arr = new int[5];
        System.out.println(arr[0]);

        String[] strArr = new String[5];
        System.out.println(strArr[0]);
//        int d=12000;
//        if(d>10000){
//            d=d+2000;
//        }
//        else{
//            d=d-20000;
//        }
//        System.out.println("salary " +d);
        int a = 3;
        int b= 1;
        System.out.println(Arrays.toString(swap(a,b)));
        System.out.println(a);
    }
    static int[] swap ( int a , int b) {
            int temp = a;
            a=b;
            b= temp;
            return new int [] {a,b};

        }
    }




public class LinearSearch {//leetcode1295 & similar 1672
    public static void main ( String [] args) {
        int [] arr= {-2317,443222,11,43,6,89,300};
        System.out.println(evenCount(arr));
    }
    static int evenCount(int[] nums) {
        int count=0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even (int num) {
        int numberOfdigits= digits(num);
        return numberOfdigits % 2 ==0;
//        if ( numberOfdigits % 2 ==0) {
//            return true;
//        }
//        return false;
    }
    static int digits(int num) {
        if (num<0) {
            num=num*-1;
        }
        if (num==0) {
            return 1;
        }
        int count=0;
        while (num>0) {
            count++;
            num=num/10;
        }
        return count;


}
}



//public class LinearSearch {
//    public static void main(String[] args) {  //searching in 2D array
//        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int target = 4;
//        int[] ans = search(arr, target);
//        System.out.println(Arrays.toString(ans));
//        System.out.println(max(arr));
//    }
//
//    static int[] search(int[][] arr, int target) {
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col] == target) {
//                    return new int[]{row, col};
//                }
//            }
//        }
//        return new int[]{-1, -1};
//    }
//
//    static int max(int[][] arr) {
//        int max = Integer.MIN_VALUE;
//        for (int[] ints : arr) {
//            for (int element : ints) {
//                if (element > max) {
//                    max = element;
//                }
//            }
//        }
//        return max;
//    }
//}

//public class LinearSearch {
//    public static void main (String [] args) {
//        int [] arr= {12,32,53,23,65,34,21,78,90,32};
//        int target= 32;
//        System.out.println(linearSearch(arr, target,1,7));
//        System.out.println(minimum(arr));
//    }
//    //linear search
//    static int linearSearch( int []arr, int target, int start, int end) {
//        if ( arr.length==0) {
//            return -1;
//        }
//        for ( int index= start;index< end;index++) {
//            if (arr[index]==target) {
//                return index;
//            }
//
//        }
//        return -1;
//    }
//
//    //minimum
//    static int minimum(int [] arr) {
//        int min= arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min ) {
//                min =arr[i];
//            }
//        }
//        return min;
//    }
//}
//linear search
//    public static void main(String[] args) {
//        int [] arr= {23,42,41,56,78,56};
//        int target=42;
//        int ans= linearSearch(arr,target);
//        System.out.println(ans);
//    }
//    public static int linearSearch(int [] arr, int target){
//        if (arr.length==0) {
//            return -1;
//        }
//        for ( int i=0; i<arr.length; i++) {
//            if (arr[i]==target) {
//                return i;
//            }
//        }
//        return -1;
//    }

//string search
//public static void main( String [] args) {
//    String name= "Vanshika" ;
//    char target= 'a' ;
//    System.out.println(search(name,target));
//}
//static boolean search( String str, char target) {
//    if (str.length()==0) {
//        return false;
//    }
//
//    //or another approach
//    for ( char ch : str.toCharArray()) { //important step
//        if (ch==target) {
//            return true;
//        }
//    }
////        for (int i=0; i< str.length(); i++) {
////            if (str.charAt(i)==target) { //important step
////                return true;
////            }
////        }
//    return false;
//}

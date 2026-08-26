import java.util.Arrays;
public class recursion3rd {
    public static void main(String[] args) {
//        trianglePattern(4,0);
        int[] a = {3, 4, 1, 2};
        BubbleSort(a, a.length-1,0);
        System.out.println(Arrays.toString(a));
        selectionSort(a, a.length,0,0);
        System.out.println(Arrays.toString(a));

    }

    static void trianglePattern(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            System.out.print("* ");
            trianglePattern(r, c + 1);
        } else {
            System.out.println();
            trianglePattern(r - 1, 0);
        }

    }

    //just do the opposite, calling the func first and then printing the star
    static void trianglePattern2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            trianglePattern2(r, c + 1);
            System.out.print("*"); // prints only when previous func is executed and returns
        } else {
            trianglePattern2(r - 1, 0);
            System.out.println();
        }

    }

    //row represents the size of the unsorted portion of the array,
    // which shrinks as the largest elements are "bubbled" to the end.
    //col acts as a pointer, iterates through the current unsorted portion of the array.
    //It performs comparisons between adjacent elements and swaps if they are in the wrong order.
    static void BubbleSort(int[] a, int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            if (a[c] > a[c + 1]) {
                int temp = a[c];
                a[c] = a[c + 1];
                a[c + 1] = temp;
            }
            BubbleSort(a, r, c + 1);

        } else {
            BubbleSort(a, r - 1, 0);
        }

    }

    //int max :To identify the largest element in the unsorted portion
    // of the array so it can be swapped with the last element.
    static void selectionSort(int[] a, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            if (a[c] >= a[max]) {
                selectionSort(a, r, c + 1, c);
            } else {
                selectionSort(a, r, c + 1, max);
            }
        } else {
            int temp = a[max];
            a[max] = a[r - 1];
            a[r - 1] = temp;
        }
        selectionSort(a, r - 1, 0, 0);
    }
}

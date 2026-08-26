public class Patterns {
    public static void main(String[] args) {
        int n=5;
        pattern11(5);
        pattern12(5);

//        pattern7(5);

//        pattern5(n);
//         pattern1(n);
//         pattern2(n);


    }



    static void pattern1 (int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1;j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row=0; row<=n; row++) {
            for (int col=0; col<=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row=0; row<2*n; row++) {
            if (row>n) {
                for (int col=0 ; col<=2*n-row-1; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                for (int col=0; col<row; col++) {
                    System.out.print("*");
                    }
                System.out.println();
            }

        }

    }
    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n) {
        for (int row=0; row<2*n; row++) {
            int colsInRow= row>=n ? row-n+1: n-row;

            int noOfSpaces = n-colsInRow;
            for( int s=0; s< noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < colsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for ( int row=0;row<n;row++) {
            for (int s=0; s<row;s++) {
                System.out.print(" ");
            }
            for (int col=0; col<n-row;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern10 (int n) {
        for (int row=0;row<n;row++) {
            for ( int s=0;s<n-row-1;s++) {
                System.out.print(" ");
            }
            for (int col=0;col<row+1;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9 (int n) {
        for ( int row=0;row<n;row++) {
            for ( int s=0;s<row;s++) {
                System.out.print(" ");
            }
            for ( int col=0; col<2*(n-row)-1; col++) {
                System.out.print("*"); }
            System.out.println();
        }
    }

    static void pattern8 (int n) {
        for (int row=0;row<n; row++) {

            for ( int s=0; s<row; s++) {
                System.out.print(" ");
            }
            for (int col=0; col< 2*row+1;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7 (int n) {
        for (int row=0;row<n;row++) {
            int noOfSpaces =row;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col=0;col<n-row;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6 (int n) {
        for (int row=0; row<n; row++) {
            int noOfSpaces=n-row-1;
            for (int s=0; s<noOfSpaces ; s++) {
                System.out.print(" ");
            }
            for (int col=0;col<row+1;col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


}

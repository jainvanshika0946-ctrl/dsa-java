import java.util.Scanner;

public class Methods{
    public static void main(String [] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number to be checked armstrong or not");
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n){
        int sum=0;
        int original=n;
        while(n>0){
            int rem=n%10;
            int cube= rem*rem*rem;
            sum=sum+cube;
            n=n/10;
        }
        return sum==original;
    }
}


//approach1
//public class Methods{
//    public static void main(String[] args){
//        Scanner in= new Scanner(System.in);
//        System.out.println("Enter the number to be checked prime or not");
//        int n = in.nextInt();
//        System.out.println(isprime(n));
//    }
//    static boolean isprime(int n){
//        if(n<=1){
//        return false;}
//        int c=2;
//        while(c*c<=n){
//            if(n%c==0){
//                return false;
//            }
//            c++;
//        }
//        if(c*c>n){
//            return true;
//        }
//        return false;
//    }
//    static boolean isprime(int n){
//        if(n<=1){
//            return false;
//        }
//        for(int i=2;i<=Math.sqrt(n);i++){
//            if(n%i==0){
//                return false;
//            }
//            else {
//                return true;
//            }
//        }
//        return true;
//    }
//}

//approach2
//public class Methods {
//    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter two numbers: ");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println("swapped numbers are: ");
//        swap(a,b);
//    }
//    static void swap(int a, int b){
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a + " "+ b);
//    }
//}

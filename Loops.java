import java.util.Scanner;
//CALCULATOR
public class Loops {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.print("Enter the operator: ");
            char op= in.next().trim().charAt(0);

            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%') {
                System.out.println("Enter two numbers: ");
                int a = in.nextInt();
                int b = in.nextInt();

                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    ans = a / b;
                }
                if (op == '%') {
                    ans = a % b;
                }
            }
            else if(op=='x' || op=='X'){
                break;
                }
            else{
                System.out.println("Invalid operation");
                }
            System.out.println(ans);
            }

        }


    }

//public static void main(String [] args){
//    for(int i=0;i<=5;i++){
//        System.out.print(i);
//    }
//}
//{
//Scanner sc = new Scanner(System.in);
//int a =sc.nextInt();
//int b= sc.nextInt();
//int max=Math.max(a,b);
//        System.out.println(max);
//    }

//public static void main (String[] args){
//    String word="Hello world";
//    System.out.println(word.charAt(2));
//}

//{
//Scanner in = new Scanner(System.in);
//char ch=in.next().trim().charAt(0);
//        if (ch>='a' && ch<='z'){
//        System.out.print("LOWERCASE");
//        }
//                else{
//                System.out.print("UPPERCASE");
//        }
//                }

//fibonacci
//    Scanner in=new Scanner (System.in);
//    int n=in.nextInt();
//    int a=0;
//    int b=1;
//    int count=2;
//
//        while(count<=n){
//        int temp=b;
//
//        b=b+a;
//        a=temp;
//        count++;
//    }
//        System.out.println(b);
//}
//count occurrence of 3
//int n=23433345;
//int count=0;
//
//        for(int i=0; i<n;i++){
//int rem=n%10;
//            if(rem==3){
//count++;
//        }
//n=n/10;
//
//        }
//        System.out.print("3 appears " + count);

//reverse a number
//{
//int num=28479;
//int ans=0;
//        while(num>0){
//int rem=num%10;
//num=num/10;
//ans=ans*10+ rem;
//        }
//                System.out.println(ans);
//
//    }
public class methods_functions {
//    static int count = 0;
//
//    public static void increment() {
//        count++;
//    }public static int modify( int x) {
//        return x = x+10;
//    }

        static int callCount = 0;

        public static int fib(int n) {
            callCount++;
            if (n <= 1) return n;
            return fib(n - 1) + fib(n - 2);
        }







        public static void main(String[] args) {
//            methods_functions.increment();
//            methods_functions.increment();
//            methods_functions.increment();
//            System.out.println(methods_functions.count);
//            int a = 5;
//            System.out.println(modify(a));
//            System.out.println(a);
            System.out.println(fib(5));
            System.out.println(callCount);}
}

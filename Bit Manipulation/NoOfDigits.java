public class NoOfDigits {
    public static void main(String []args) {
        int n = 10;  //or34567
        int b = 2; //or10       OutPut: 5

        int ans= (int) (Math.log(n)/Math.log(b)) + 1 ;

        System.out.println(ans);

    }
}

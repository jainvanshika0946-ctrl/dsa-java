public class maxsubarraywithKelements {
    static void main(String[] args) {
        int [] arr = {1,4,2,10,23,3,1,0,20};
        long ans = maximumSubarraySum(arr,3);
        System.out.println(ans);
    }
        public static long maximumSubarraySum(int[] nums, int k) {
            int windows_sum = 0;
            for ( int i = 0; i< k; i++ ) {
                windows_sum += nums[i];
            }
            int max_ans = windows_sum;
            for ( int j = k; j<nums.length ; j++ ) {
                windows_sum += nums[k];
                windows_sum -= nums[j-k];
                max_ans = Math.max(max_ans, windows_sum);
            }
            return max_ans;
        }
    }


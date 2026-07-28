package array;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxsum = nums[0];

        for(int i=1; i<nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            maxsum = Math.max(sum, maxsum);
        }
        return maxsum;
    }
    
    public static void main(String[] args) {
        MaximumSubarray s = new MaximumSubarray();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = s.maxSubArray(nums);
        
        System.out.println("Maximum Subarray Sum: " + result);
    }
}

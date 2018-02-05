/**
 * Created by Vishwas on 30-01-2018.
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaxSubArrayProblem {

    public static void main(String[] args) {
        MaxSubArrayProblem maxSubArrayProblem = new MaxSubArrayProblem();
        maxSubArrayProblem.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
    }

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int max = nums[0];
        int sum = nums[0];
        for (int idx = 1; idx < nums.length; idx++) {
            if(sum < 0) sum = nums[idx];
            else sum += nums[idx];
            max = Math.max(sum, max);
        }
        return max;
    }

}

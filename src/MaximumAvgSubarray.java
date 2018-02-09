/**
 * Created by Vishwas on 09-02-2018.
 * https://leetcode.com/problems/maximum-average-subarray-i/description/
 */
public class MaximumAvgSubarray {

    public static void main(String[] args) {
        MaximumAvgSubarray maximumAvgSubarray = new MaximumAvgSubarray();
        maximumAvgSubarray.findMaxAverage(new int[]{5}, 1);
    }

    public double findMaxAverage(int[] nums, int k) {
        double avg = 0, sum = 0;
        for(int i = 0; i < k; i++) sum+=nums[i];
        avg = sum;
        for(int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            avg = Math.max(sum, avg);
        }
        return avg / k;
    }
}

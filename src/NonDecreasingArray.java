/**
 * Created by Vishwas on 10-02-2018.
 * https://leetcode.com/problems/non-decreasing-array/description/
 */
public class NonDecreasingArray {

    public static void main(String[] args) {
        NonDecreasingArray nonDecreasingArray = new NonDecreasingArray();
        boolean kiHoya = nonDecreasingArray.checkPossibility(new int[]{1, 7, 6, 7});
        System.out.print(kiHoya);
    }

    public boolean checkPossibility(int[] nums) {
        if(nums.length < 2)
            return true;
        int minusIdx = Integer.MIN_VALUE;
        int nonIncreasingCount = 0;
        for(int idx = 1; idx < nums.length; idx++) {
            if(nums[idx] < nums[idx - 1]) {
                //atm, idx is culprit
                if(nums[idx] >= minusIdx) {
                    //atm, idx - 1 is culprit
                    nums[idx - 1] = nums[idx];
                } else {
                    nums[idx] = nums [idx - 1];
                }
                nonIncreasingCount++;
                if(nonIncreasingCount > 1)
                    return false;
            }
            minusIdx = nums[idx - 1];
        }
        return true;
    }
}

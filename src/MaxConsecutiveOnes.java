/**
 * Created by Vishwas on 06-02-2018.
 * https://leetcode.com/problems/max-consecutive-ones/description/
 *
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * Note:
 *
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 */
public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1});
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, currCount = 0;
        for (int num : nums) {
            if (num == 1)
                currCount++;
            else
                currCount = 0;
            maxCount = Math.max(maxCount, currCount);
        }
        return maxCount;
    }

}

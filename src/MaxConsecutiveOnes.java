/**
 * Created by Vishwas on 06-02-2018.
 * https://leetcode.com/problems/max-consecutive-ones/description/
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

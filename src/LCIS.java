/**
 * Created by Vishwas on 12-02-2018.
 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
 */
public class LCIS {

    public static void main(String[] args) {
        LCIS lcis = new LCIS();
        lcis.findLengthOfLCIS(new int[]{7, 6, 5, 4, 5});
    }

    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int maxLength = 1, currLength = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i + 1])
                currLength++;
            else
                currLength = 1;
            maxLength = Math.max(currLength, maxLength);
        }
        return maxLength;
    }
}

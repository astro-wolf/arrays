/**
 * Created by Vishwas on 05-03-2018.
 *
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
 */
public class LargestTwiceOfOthers {

    public static void main(String[] args) {
        LargestTwiceOfOthers largestTwiceOfOthers = new LargestTwiceOfOthers();
        int num = largestTwiceOfOthers.dominantIndex(new int[] {0, 0, 0, 0});
        System.out.print(num);
    }

    public int dominantIndex(int[] nums) {
        if(nums.length == 1)
            return 0;
        int max = 0, secondMax = 0;
        int maxIdx = 0;
        for(int idx = 0; idx < nums.length; idx++) {
            if(nums[idx] > max) {
                secondMax = max;
                max = nums[idx];
                maxIdx = idx;
            } else if (nums[idx] > secondMax && nums[idx] < max) {
                secondMax = nums[idx];
            }
        }
        if(max == 0 && secondMax == 0)
            return -1;
        return max >= secondMax *2 ? maxIdx : -1;
    }

}

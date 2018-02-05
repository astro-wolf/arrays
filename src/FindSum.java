import java.util.HashMap;

/**
 * Created by Vishwas on 28-01-2018.
 * https://leetcode.com/problems/two-sum/description/
 */
public class FindSum {

    public static void main(String[] args) {
        FindSum findSum = new FindSum();
        findSum.twoSum(new int[]{3, 2, 4}, 6);
    }

    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        //key will contain element from array
        //value will contain its position
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        for (int idx = 0; idx < nums.length; idx++) {
            sumMap.put(nums[idx], idx);
        }
        for (int idx = 0; idx < nums.length; idx++) {
            int diff = target - nums[idx];
            if (sumMap.containsKey(diff)) {
                int firstIdx = idx;
                int secondIdx = sumMap.get(target - nums[idx]);
                if(firstIdx != secondIdx) {
                    res[0] = idx;
                    res[1] = secondIdx;
                    return res;
                }
            }
        }
        return null;
    }

}

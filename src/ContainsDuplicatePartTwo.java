import java.util.HashMap;

/**
 * Created by Vishwas on 05-02-2018.
 * https://leetcode.com/problems/contains-duplicate-ii/description/
 */
public class ContainsDuplicatePartTwo {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(numMap.containsKey(nums[i]) && i - numMap.get(nums[i]) <= k)
                return true;
            numMap.put(nums[i], i);
        }
        return false;
    }

}

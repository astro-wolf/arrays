import java.util.HashMap;

/**
 * Created by Vishwas on 28-01-2018.
 * https://leetcode.com/problems/search-insert-position/description/
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        //was solved without testing ;) V
    }

    public int searchInsert(int[] nums, int target) {
        for(int idx = 0; idx < nums.length; idx++) {
            if(nums[idx] == target)
                return idx;
            else if (nums[idx] > target)
                return idx;
        }
        return nums.length;
    }

}

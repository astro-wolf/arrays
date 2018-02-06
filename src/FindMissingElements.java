import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vishwas on 06-02-2018.
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 */
public class FindMissingElements {

    public static void main(String[] args) {
        FindMissingElements findMissingElements = new FindMissingElements();
        findMissingElements.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0)
                nums[val] = -nums[val];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                ret.add(i + 1);
        }
        return ret;
    }
}

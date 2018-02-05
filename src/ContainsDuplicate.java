import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Vishwas on 05-02-2018.
 * https://leetcode.com/problems/contains-duplicate/description/
 */
public class ContainsDuplicate {

    //can be done using sorting also

//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; ++i) {
//            if (nums[i] == nums[i + 1]) return true;
//        }
//        return false;
//    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : nums) {
            if(numSet.contains(num))
                return true;
            numSet.add(num);
        }
        return false;
    }

}

/**
 * Created by Vishwas on 28-01-2018.
 */
public class RemoveDupes {

    public static void main(String[] args) {
        RemoveDupes solution = new RemoveDupes();
        solution.removeDuplicates(new int[]{1,1,1});
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public int removeDuplicatesUncool(int[] nums) {
        int numIdx = 0;
        for(int idx = 1; idx < nums.length; idx++) {
            if(nums[idx] == nums[numIdx]) {
                nums[idx] = Integer.MIN_VALUE;
            } else {
                numIdx = idx;
            }
        }
        int idx = 0;
        int resIdx = 0;
        while(idx < nums.length) {
            if(nums[idx] > Integer.MIN_VALUE) {
                resIdx++;
            } else {
                int targetIdx = idx;
                while(targetIdx < nums.length && nums[targetIdx] == Integer.MIN_VALUE) {
                    targetIdx ++;
                }
                if(targetIdx >= nums.length)
                    break;
                nums[resIdx] = nums[targetIdx];
                nums[targetIdx] = Integer.MIN_VALUE;
                resIdx++;
            }
            idx++;
        }
        return resIdx;
    }

    //takes zero values at the end, so length remains same
    //also, this is not in-space
    int removeDuplicatesNotInSpace(int[] nums) {
        int[] res = new int[nums.length];
        int numsIdx = 1;
        int resIdx = 0;
        res[0] = nums[0];
        while (numsIdx < nums.length) {
            if (res[resIdx] != nums[numsIdx]) {
                res[++resIdx] = nums[numsIdx];
            }
            numsIdx++;
        }
        return ++resIdx;
    }

}

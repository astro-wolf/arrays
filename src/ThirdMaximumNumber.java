import java.util.Arrays;

/**
 * Created by Vishwas on 06-02-2018.
 * https://leetcode.com/problems/third-maximum-number/description/
 */
public class ThirdMaximumNumber {

    public static void main(String[] args) {
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int thirdMax = thirdMaximumNumber.thirdMax(new int[]{1, 2, 2, 5, 3, 5});
        System.out.print(thirdMax);
    }

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int ig1 = nums[nums.length - 1],
                ig2 = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (ig2 == 0 && ig1 != nums[i])
                ig2 = nums[i];
            else if (ig2 != 0 && nums[i] != ig2)
                return nums[i];
        }
        return ig1;
    }

}

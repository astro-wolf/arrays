/**
 * Created by Vishwas on 06-02-2018.
 * https://leetcode.com/problems/missing-number/description/
 */
public class FindMissingNumber {

    public int missingNumberBetweenZeroAndMax(int[] nums) {
        int sum = 0;
        int min = 0, max = 0;
        boolean containsZero = false;
        for (int num : nums) {
            if (num == 0)
                containsZero = true;
            if (num > max)
                max = num;
            else if (num < min && num != 0)
                min = num;
            sum += num;
        }
        int supposedSum = ((max - min) + 1) * (max + min) / 2;
        if (supposedSum == sum) {
            if (containsZero)
                return max + 1;
            else
                return 0;
        }
        return supposedSum - sum;
    }

    public int missingNumberBetweenTwoInts(int[] nums) {
        int sum = 0;
        int min = 0, max = 0;
        for (int num : nums) {
            if (num > max)
                max = num;
            else if (num < min && num != 0)
                min = num;
            sum += num;
        }
        int supposedSum = ((max - min) + 1) * (max + min) / 2;
        if (supposedSum == sum)
            return max + 1;
        return supposedSum - sum;
    }

}

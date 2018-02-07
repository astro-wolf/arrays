import java.util.Arrays;

/**
 * Created by Vishwas on 07-02-2018.
 * https://leetcode.com/problems/array-partition-i/description/
 */
public class ArrayPartition1 {

    public static void main(String[] args) {
        ArrayPartition1 arrayPartition1 = new ArrayPartition1();
        arrayPartition1.arrayPairSum(new int[]{1, 1});
    }

    public int arrayPairSum(int[] nums) {
        int output = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            output += nums[i];
        }
        return output;
    }

}

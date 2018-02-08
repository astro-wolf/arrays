/**
 * Created by Vishwas on 07-02-2018.
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray
 */
public class ShortestUnsortedContinousSubArray {

    public static void main(String[] args) {
        ShortestUnsortedContinousSubArray shortestUnsortedContinousSubArray = new ShortestUnsortedContinousSubArray();
        int length = shortestUnsortedContinousSubArray.findUnsortedSubarray(new int[]{1, 3, 2, 3, 3});
        System.out.print(length);
    }

    public int findUnsortedSubarray(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, i = -1, j = 0;
        for(int l = 0, r = nums.length - 1; r >= 0; l++, r--) {
            max = Math.max(max, nums[l]);
            if(nums[l] != max)
                i = l;
            min = Math.min(min, nums[r]);
            if(nums[r] != min)
                j = r;
        }
        return i - j + 1;
    }

//    public int findUnsortedSubarray(int[] nums) {
//        int left = 0, right = nums.length - 1;
//        if(left == right)
//            return 0;
//        while (right > left) {
//            if (nums[left] <= nums[left + 1])
//                left++;
//            else if (nums[right] > nums[right - 1])
//                right--;
//            else
//                break;
//        }
//        if(left == right)
//            return 0;
//        return right + 1 - left;
//    }
}

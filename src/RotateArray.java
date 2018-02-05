/**
 * Created by Vishwas on 05-02-2018.
 * https://leetcode.com/problems/rotate-array/description/
 */
public class RotateArray {

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[]{1,2}, 1);
    }

    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        if(k > nums.length) {
            k = k % nums.length;
        }
        int rotateIdx = nums.length - k;
        for(int i = 0; i < nums.length; i++) {
            if(i < nums.length - k) {
                res[i + k] = nums[i];
            } else {
                res[i - rotateIdx] = nums[i];
            }
        }
        for(int i = 0; i < res.length; i++) {
            nums[i] = res[i];
        }
    }

}

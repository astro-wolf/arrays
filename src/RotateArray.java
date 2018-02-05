/**
 * Created by Vishwas on 05-02-2018.
 * https://leetcode.com/problems/rotate-array/description/
 */
public class RotateArray {

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

//    public void rotate(int[] nums, int k) {
//        int[] res = new int[nums.length];
//        if(k > nums.length) {
//            k = k % nums.length;
//        }
//        int rotateIdx = nums.length - k;
//        for(int i = 0; i < nums.length; i++) {
//            if(i < nums.length - k) {
//                res[i + k] = nums[i];
//            } else {
//                res[i - rotateIdx] = nums[i];
//            }
//        }
//        for(int i = 0; i < res.length; i++) {
//            nums[i] = res[i];
//        }
//    }

}

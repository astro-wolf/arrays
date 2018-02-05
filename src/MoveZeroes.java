/**
 * Created by Vishwas on 06-02-2018.
 * https://leetcode.com/problems/move-zeroes/description/
 */
public class MoveZeroes {

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public void moveZeroes(int[] nums) {
        int zeroIndex = -1;
        int count = 0;
        for(int i = 0; i < nums.length; ) {
            if(nums[i] == 0) {
                zeroIndex = i;
                i++;
            } else if (zeroIndex > -1) {
                nums[count] = nums[i];
                count++;
                nums[i] = 0;
                zeroIndex = -1;
            } else {
                i++;
                count++;
            }
        }
    }
}

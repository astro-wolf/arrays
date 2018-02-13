/**
 * Created by Vishwas on 13-02-2018.
 */
public class PivotIndex {

    public static void main(String[] args) {
        PivotIndex pivotIndex = new PivotIndex();
        int res = pivotIndex.pivotIndex(new int[]{-1,-1,-1,-1,-1,0});
        System.out.print(res);
    }

    public int pivotIndex(int[] nums) {
        int sum = 0, left = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];

        for (int i = 0; i < nums.length; i++) {
            if (i != 0) left += nums[i - 1];
            if (sum - left - nums[i] == left) return i;
        }
        return -1;
    }

//    public int pivotIndex(int[] nums) {
//        if (nums.length < 3)
//            return -1;
//        int i = 0, j = nums.length - 1;
//        while (i < nums.length && nums[i] == 0)
//            i++;
//        while (j >= 0 && nums[j] == 0)
//            j--;
//        if(i > j)
//            return -1;
//        int l = i + 1, r = j - 1;
//        int sumLeft = nums[i], sumRight = nums[j];
//        while (l <= r) {
//            if (sumLeft < sumRight) {
//                sumLeft += nums[l];
//                l++;
//            }
//            if (sumRight < sumLeft) {
//                sumRight += nums[r];
//                r--;
//            }
//            if (sumLeft == sumRight) {
//                if (l == r)
//                    return l;
//                l++;
//                r--;
//            }
//        }
//        return -1;
//    }
}

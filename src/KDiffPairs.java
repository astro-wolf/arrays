import java.util.HashMap;

/**
 * Created by Vishwas on 06-02-2018.
 * https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
 */
public class KDiffPairs {

    public static void main(String[] args) {
        KDiffPairs kDiffPairs = new KDiffPairs();
        kDiffPairs.findPairs(new int[]{1, 2, 3, 4, 5}, -1);
    }

    public int findPairs(int[] nums, int k) {
        int pairCount = 0;
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(numMap.containsKey(num))
                nums[i] = Integer.MIN_VALUE;
            numMap.put(num, i);
        }
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(numMap.containsKey(num + k) && i != numMap.get(num + k))
                pairCount++;
        }
        return pairCount;
    }

}

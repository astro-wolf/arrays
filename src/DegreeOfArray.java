import java.util.HashMap;

/**
 * Created by Vishwas on 12-02-2018.
 * https://leetcode.com/problems/degree-of-an-array/description/
 */
public class DegreeOfArray {

    public int findShortestSubArray(int[] nums) {
        int minSubArray = 865486238;
        int degree = 0;
        //int[0] = degree
        //int[1] = start index
        //int[2] = end index
        HashMap<Integer, int[]> db = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int[] subArray;
            if(db.containsKey(num)) {
                subArray = db.get(num);
            } else {
                subArray = new int[3];
                subArray[1] = i;
            }
            subArray[2] = i;
            subArray[0] += 1;

            db.put(num, subArray);

            if(degree < subArray[0]) {
                degree = subArray[0];
                minSubArray = subArray[2] - subArray[1] + 1;
            } else if (degree == subArray[0]) {
                minSubArray = Math.min(minSubArray, subArray[2] - subArray[1] + 1);
            }
        }
        return minSubArray;
    }
}

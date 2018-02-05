/**
 * Created by Vishwas on 04-02-2018.
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 */
public class TwoSumSorted {

    public static void main(String[] args) {
        TwoSumSorted twoSumSorted = new TwoSumSorted();
        twoSumSorted.twoSum(new int[]{2, 7, 11, 15}, 18);
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int idx = 0; idx < numbers.length; idx++) {
            int remainder = target - numbers[idx];
            int remainderIdx = binarySearch(numbers, idx + 1, numbers.length - 1, remainder);
            if (remainderIdx > Integer.MIN_VALUE) {
                res[0] = idx + 1;
                res[1] = remainderIdx + 1;
                break;
            }
        }
        return res;
    }

    private int binarySearch(int[] numbers, int start, int end, int target) {
        if (end >= start) {
            int mid = start + (end - start) / 2;
            if (numbers[mid] == target)
                return mid;
            else if (start == end)
                return Integer.MIN_VALUE;
            else if (target < numbers[mid])
                return binarySearch(numbers, start, mid - 1, target);
            else if (target > numbers[mid])
                return binarySearch(numbers, mid + 1, end, target);
        }
        return Integer.MIN_VALUE;
    }

}

/**
 * Created by Vishwas on 15-03-2018.
 * <p>
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 */
public class SearchRotatedArray {

    public static void main(String[] args) {
        SearchRotatedArray searchRotatedArray = new SearchRotatedArray();
        searchRotatedArray.search(new int[]{1, 3}, 3);
    }

    public int search(int[] nums, int target) {
        if (nums.length == 0)
            return -1;
        if (nums.length == 1) {
            if (nums[0] == target)
                return 0;
            else
                return -1;
        }
        if (nums[0] < nums[nums.length - 1])
            return binarySearch(nums, 0, nums.length - 1, target);
        for (int idx = 0; idx < nums.length - 1; idx++) {
            if (nums[idx] == target)
                return idx;
            if (nums[idx] > nums[idx + 1])
                return binarySearch(nums, idx + 1, nums.length - 1, target);
        }
        return -1;
    }

    private int binarySearch(int[] nums, int start, int end, int target) {
        if (end >= start) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                return binarySearch(nums, start, mid - 1, target);
            else
                return binarySearch(nums, mid + 1, end, target);
        }
        return -1;
    }

}

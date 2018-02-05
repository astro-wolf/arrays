/**
 * Created by Vishwas on 31-01-2018.
 * https://leetcode.com/problems/merge-sorted-array/description/
 */
public class MergeSortedArrays {

    public static void main(String[] args) {
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();
        int[] arr1 = { 1, 18, 22, 100, 105, 1002, -1, -1, -1, -1, -1 };
        int[] arr2 = { 16, 17, 19, 21, 1001 };
        int m = arr1.length;
        int n = arr2.length;
        mergeSortedArrays.merge(arr1, 6, arr2, n);
    }

    //bigger array(nums1) will have enough space to acomodate all the elements
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[k--] = nums1[m - 1];
                m--;
            } else {
                nums1[k--] = nums2[n - 1];
                n--;
            }
        }
        if(n > 0) {
            while(n > 0) {
                nums1[k--] = nums2[n - 1];
                n--;
            }
        }
        return nums1;
    }

}

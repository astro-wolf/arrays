/**
 * Created by Vishwas on 08-02-2018.
 * https://leetcode.com/problems/maximum-product-of-three-numbers/description/
 */
public class MaximumProductOfThree {

    public static void main(String[] args) {
        MaximumProductOfThree maximumProductOfThree = new MaximumProductOfThree();
        int product = maximumProductOfThree.maximumProduct(new int[]{-4, -3, -2, -1, 60});
        System.out.print(product);
    }

    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE,
                min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num > secondMax && num <= max) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num <= secondMax) {
                thirdMax = num;
            }

            if (min1 > num) {
                min2 = min1;
                min1 = num;
            } else if (min2 > num) {
                min2 = num;
            }
        }
        if (min1 < Integer.MAX_VALUE && min2 < Integer.MAX_VALUE)
            return Math.max(max * secondMax * thirdMax, max * min1 * min2);
        else
            return max * secondMax * thirdMax;
    }

}

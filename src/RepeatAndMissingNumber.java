import java.util.HashSet;

/**
 * https://www.interviewbit.com/problems/repeat-and-missing-number-array/
 *
 * You are given a read only array of n integers from 1 to n.
 *
 * Each integer appears exactly once except A which appears twice and B which is missing.
 *
 * Return A and B.
 *
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Note that in your output A should precede B.
 *
 * Example:
 *
 * Input:[3 1 2 5 3]
 *
 * Output:[3, 4]
 *
 * A = 3, B = 4
 */
public class RepeatAndMissingNumber {

    public static void main(String[] args) {
        RepeatAndMissingNumber repeatAndMissingNumber = new RepeatAndMissingNumber();
        int[] res = repeatAndMissingNumber.repeatedNumber(new int[]{1,2,3,5,5});
        System.out.println(res);
    }

    public int[] repeatedNumber(final int[] A) {
        int[] res = new int[2];
        long length = A.length;
        long expectedSum = (length * (length + 1)) / 2;
        long actualSumWithoutDupe = 0;
        HashSet<Integer> elementSet = new HashSet<>();
        for (int num : A) {
            if (elementSet.contains(num)) {
                res[0] = num;
            } else {
                elementSet.add(num);
                actualSumWithoutDupe += (long)num;
            }
        }
        res[1] = (int)(expectedSum - actualSumWithoutDupe);
        return res;
    }

}

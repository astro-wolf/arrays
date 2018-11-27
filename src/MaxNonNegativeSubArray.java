import java.util.ArrayList;

/**
 * https://www.interviewbit.com/problems/max-non-negative-subarray/
 *
 * Find out the maximum sub-array of non negative numbers from an array.
 * The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and
 * skipping the third element is invalid.
 *
 * Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than
 * sub-array B if sum(A) > sum(B).
 *
 * Example:
 * A : [1, 2, 5, -7, 2, 3]
 * The two sub-arrays are [1, 2, 5] [2, 3].
 * The answer is [1, 2, 5] as its sum is larger than [2, 3]
 *
 * NOTE: If there is a tie, then compare with segment's length and return segment which has maximum length
 * NOTE 2: If there is still a tie, then return the segment with minimum starting index
 */
public class MaxNonNegativeSubArray {

    public static void main(String[] args) {
        MaxNonNegativeSubArray maxNonNegativeSubArray = new MaxNonNegativeSubArray();
        ArrayList<Integer> prob = new ArrayList<>();
        prob.add(7);
        prob.add(21);
        prob.add(3);
        prob.add(41);
//        prob.add(2);
        prob.add(5);
//        prob.add(1);
        ArrayList<Integer> res = maxNonNegativeSubArray.maxset(prob);
        System.out.println(res);
    }

    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        long rSum = 0, iSum = 0;//long, to prevent spaceship crash
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> intermediateRes = new ArrayList<>();
        for (int n : A) {
            if (n >= 0) {
                intermediateRes.add(n);
                iSum += (long) n;
                if (iSum >= rSum) {
                    if (iSum == rSum) {
                        if (res.size() < intermediateRes.size()) {
                            res.clear();
                            res.addAll(intermediateRes);
                        }
                    } else {
                        res.clear();
                        res.addAll(intermediateRes);
                    }
                    rSum = iSum;
                }
            } else {
                iSum = 0;
                intermediateRes.clear();
            }
        }
        return res;
    }

}

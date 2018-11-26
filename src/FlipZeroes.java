import java.util.ArrayList;

/**
 * https://www.interviewbit.com/problems/flip/
 *
 * You are given a binary string(i.e. with characters 0 and 1) S consisting of characters S1, S2, …, SN. In a single operation, you can choose two indices L and R such that 1 ≤ L ≤ R ≤ N and flip the characters SL, SL+1, …, SR. By flipping, we mean change character 0 to 1 and vice-versa.
 *
 * Your aim is to perform ATMOST one operation such that in final string number of 1s is maximised. If you don’t want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.
 *
 * Notes:
 *
 * Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.
 * For example,
 *
 * S = 010
 *
 * Pair of [L, R] | Final string
 * _______________|_____________
 * [1 1]          | 110
 * [1 2]          | 100
 * [1 3]          | 101
 * [2 2]          | 000
 * [2 3]          | 001
 *
 * We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].
 * Another example,
 *
 * If S = 111
 *
 * No operation can give us more than three 1s in final string. So, we return empty array [].
 */
public class FlipZeroes {

    public static void main(String[] args) {
        FlipZeroes flipZeroes = new FlipZeroes();
        ArrayList<Integer> res = flipZeroes.flip("1100110001");
        System.out.println(res);
    }

    public ArrayList<Integer> flip(String A) {
        ArrayList<Integer> res = new ArrayList<>();
        if(!A.contains("0"))
            return res;
        int[] nums = new int[A.length()];
        int yVal = 0, yLeft = 0, xVal = 0, xLeft = 0, xRight = 0;
        for (int idx = 0; idx < A.length(); idx++) {
            nums[idx] = A.charAt(idx) == '0' ? 1 : -1;
        }
        for(int i = 0; i < nums.length; i++) {
            if(yVal + nums[i] >= 0) {
                yVal += nums[i];
            } else {
                yLeft = i + 1;
                yVal = 0;
            }
            if (xVal < yVal) {
                xLeft = yLeft;
                xRight = i;
                xVal = yVal;
            }
        }
        res.add(xLeft + 1);
        res.add(xRight + 1);
        return res;
    }

}

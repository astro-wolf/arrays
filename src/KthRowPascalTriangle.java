import java.math.BigInteger;

/**
 * https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/
 *
 * Given an index k, return the kth row of the Pascal’s triangle.
 *
 * Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
 *
 * Example:
 *
 * Input : k = 3
 *
 * Return : [1,3,3,1]
 * NOTE : k is 0 based. k = 0, corresponds to the row [1].
 * Note:Could you optimize your algorithm to use only O(k) extra space?
 */
public class KthRowPascalTriangle {

    public static void main(String[] args) {
        KthRowPascalTriangle kthRowPascalTriangle = new KthRowPascalTriangle();
        int[] res = kthRowPascalTriangle.getRow(2);
        System.out.println(res);
    }

    public int[] getRow(int row) {
        int[] res = new int[row + 1];
        for (long k = 0; k < res.length; k++) {
            BigInteger nFact = fact((long) row);
            BigInteger kFact = fact(k);
            BigInteger nMinusKFact = fact(row - k);
            res[(int) k] = (nFact.divide(kFact.multiply(nMinusKFact))).intValue();
        }
        return res;
    }

    private BigInteger fact(long n) {
        BigInteger num = new BigInteger(String.valueOf(n));
        if (num.longValue() == 0)
            return BigInteger.ONE;
        BigInteger i = num.subtract(BigInteger.ONE);
        while (i.longValue() > 1) {
            num = num.multiply(i);
            i = i.subtract(BigInteger.ONE);
        }
        return num;
    }

}

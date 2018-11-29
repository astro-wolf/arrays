import java.math.BigInteger;

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

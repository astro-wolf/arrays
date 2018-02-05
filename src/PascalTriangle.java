import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vishwas on 31-01-2018.
 * https://leetcode.com/problems/pascals-triangle/description/
 */
public class PascalTriangle {

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        pascalTriangle.getRow(21);
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        if(rowIndex == 0) {
            row.add(1);
        } else {
            row.add(1);
            for (int column = 1; column < rowIndex; column++) {
                BigInteger numerator = fact(rowIndex);
                BigInteger denominator = fact(column).multiply(fact(rowIndex - column));
                BigInteger result = numerator.divide(denominator);
                row.add(result.intValue());
            }
            row.add(1);
        }
        return row;
    }

    private BigInteger fact(long num) {
        BigInteger result = new BigInteger("1");
        for (long i = 1; i <= num; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    rowList.add(1);
                else if (j == i)
                    rowList.add(1);
                else
                    rowList.add(resultList.get(i - 1).get(j - 1) + resultList.get(i - 1).get(j));
            }
            resultList.add(rowList);
        }
        return resultList;
    }

}

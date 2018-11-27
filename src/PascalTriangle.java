/**
 * https://www.interviewbit.com/problems/pascal-triangle/
 *
 * Given numRows, generate the first numRows of Pascal’s triangle.
 *
 * Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
 *
 * Example:
 *
 * Given numRows = 5,
 *
 * Return
 *
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class PascalTriangle {

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        int[][] res = pascalTriangle.solve(0);
        System.out.println(res);
    }

    public int[][] solve(int numRows) {
        int[][] res = new int[numRows][numRows];
        if (numRows == 0)
            return res;
        res[0] = new int[]{1};
        if (numRows == 1) {
            return res;
        }
        for(int i = 1; i < numRows; i++) {
            int[] prevArr = res[i - 1];
            int[] newArr = new int[prevArr.length + 1];
            for(int j = 0; j < newArr.length; j++) {
                int prevPrevIdxNum = j - 1 >= 0 ? prevArr[j - 1] : 0;
                int prevCurrIdxNum = j < prevArr.length ? prevArr[j] : 0;
                newArr[j] = prevCurrIdxNum + prevPrevIdxNum;
            }
            res[i] = newArr;
        }
        return res;
    }

}

/**
 * Created by Vishwas on 07-02-2018.
 * https://leetcode.com/problems/reshape-the-matrix/description/
 */
public class ReshapeMatrix {

    public static void main(String[] args) {
        ReshapeMatrix reshapeMatrix = new ReshapeMatrix();
        reshapeMatrix.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int currSize = nums.length * nums[0].length;
        if (r * c > currSize)
            return nums;
        int[][] rArr = new int[r][c];
        int[] cArr = new int[c];
        int idxR = 0, idxC = 0;
        for (int ri = 0; ri < nums.length; ri++) {
            for (int ci = 0; ci < nums[ri].length; ci++) {
                cArr[idxC++] = nums[ri][ci];
                if (idxC == c) {
                    rArr[idxR++] = cArr;
                    idxC = 0;
                    cArr = new int[c];
                }
            }
        }
        return rArr;
    }
}

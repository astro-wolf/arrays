/**
 * Created by Vishwas on 09-02-2018.
 * https://leetcode.com/problems/image-smoother/description/
 */
public class ImageSmoother {

    public static void main(String[] args) {
        ImageSmoother imageSmoother = new ImageSmoother();
        imageSmoother.imageSmoother(new int[][]{{1}});
    }

    public int[][] imageSmoother(int[][] M) {
        int[][] res = new int[M.length][M[0].length];
        if (M.length == 0)
            return new int[0][];
        int rows = M.length;
        int columns = M[0].length;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                int count = 0, sum = 0;
                for (int row : new int[]{-1, 0, 1}) {
                    for (int col : new int[]{-1, 0, 1}) {
                        if (isValid(i + row, j + col, rows, columns)) {
                            count++;
                            sum += M[i + row][j + col];
                        }
                    }
                }
                res[i][j] = sum / count;
            }
        }
        return res;
    }

    private boolean isValid(int x, int y, int rows, int columns) {
        return x >= 0 && x < rows && y >= 0 && y < columns;
    }
}

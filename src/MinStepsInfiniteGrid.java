import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.interviewbit.com/problems/min-steps-in-infinite-grid/
 *
 * You are in an infinite 2D grid where you can move in any of the 8 directions :
 * (x,y) to
 * (x+1, y),
 * (x - 1, y),
 * (x, y+1),
 * (x, y-1),
 * (x-1, y-1),
 * (x+1,y+1),
 * (x-1,y+1),
 * (x+1,y-1)
 * You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of
 * steps in which you can achieve it. You start from the first point.
 *
 * Input :
 * Given two integer arrays A and B, where A[i] is x coordinate and B[i] is y coordinate of ith point respectively.
 *
 * Output :
 * Return an Integer, i.e minimum number of steps.
 *
 * Example :
 * Input : [(0, 0), (1, 1), (1, 2)]
 * Output : 2
 * It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).
 */
public class MinStepsInfiniteGrid {

    public static void main(String[] args) {
        MinStepsInfiniteGrid minStepsInfiniteGrid = new MinStepsInfiniteGrid();
        List<Integer> A = Arrays.asList(2, 1);
        List<Integer> B = Arrays.asList(3, 1);
        int steps = minStepsInfiniteGrid.coverPoints(A, B);
        System.out.println(steps);
    }

    public int coverPoints(List<Integer> A, List<Integer> B) {
        if (A.isEmpty() || B.isEmpty() || A.size() == 1 || B.size() == 1
                || A.size() != B.size())
            return 0;
        int stepCount = 0;
        for (int i = 1; i < A.size(); i++) {
            int aPrev = A.get(i - 1);
            int bPrev = B.get(i - 1);
            int a = A.get(i);
            int b = B.get(i);
            stepCount += Math.max(Math.abs(a - aPrev), Math.abs(b - bPrev));
        }
        return stepCount;
    }
}

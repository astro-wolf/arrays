import java.util.ArrayList;

/**
 * https://www.interviewbit.com/problems/anti-diagonals/
 *
 * Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.
 *
 * Example:
 *
 *
 * Input:
 *
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * Return the following :
 *
 * [
 * [1],
 * [2, 4],
 * [3, 5, 7],
 * [6, 8],
 * [9]
 * ]
 *
 *
 * Input :
 * 1 2
 * 3 4
 *
 * Return the following  :
 *
 * [
 * [1],
 * [2, 3],
 * [4]
 * ]
 */
public class AntiDiagnols {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> prob = new ArrayList<>();
        ArrayList<Integer> one = new ArrayList<>();
        one.add(1);one.add(2);/*;one.add(3);*/
        ArrayList<Integer> two = new ArrayList<>();
        two.add(3);two.add(4);two.add(6);
//        ArrayList<Integer> three = new ArrayList<>();
//        three.add(7);three.add(8);three.add(9);
        prob.add(one);
        prob.add(two);
//        prob.add(three);
        AntiDiagnols antiDiagnols = new AntiDiagnols();
        ArrayList<ArrayList<Integer>> res = antiDiagnols.diagonal(prob);
        System.out.println(res);
    }

    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int col = 0; col < A.get(0).size() * 2 - 1; col++) {
            int row = col >= A.get(0).size() ? col - A.get(0).size() + 1 : 0;
            int c = Math.min(col, A.get(0).size() - 1);
            ArrayList<Integer> antiDiag = new ArrayList<>();
            while(c >= 0 && row < A.get(0).size()) {
                antiDiag.add(A.get(row).get(c));
                c--;
                row++;
            }
            res.add(antiDiag);
        }
        return res;
    }

}

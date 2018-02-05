import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Vishwas on 04-02-2018.
 * https://leetcode.com/problems/majority-element/description/
 */
public class MajorityElement {

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        majorityElement.majorityElement(new int[]{-1, 1, 1, 1, 2, 1});
    }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int number : nums) {
            if (countMap.containsKey(number))
                countMap.put(number, countMap.get(number) + 1);
            else
                countMap.put(number, 1);
        }
        Iterator it = countMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if ((int) pair.getValue() > (nums.length / 2))
                return (int) pair.getKey();
        }
        return -1;
    }
}

/**
 * Created by Vishwas on 8-March-2018
 * <p>
 * https://leetcode.com/problems/container-with-most-water/description/
 */

public class MostWaterContainer {

    public static void main(String[] args) {
        MostWaterContainer mostWaterContainer = new MostWaterContainer();
        int maxArea = mostWaterContainer.maxArea(new int[]{2, 1});
        System.out.print(maxArea);
    }

    public int maxArea(int[] height) {
        int area = 0, start = 0, end = height.length - 1;
        while (start < end) {
            area = Math.max(area, (end - start) * Math.min(height[start], height[end]));
            if(height[start] < height[end])
                start++;
            else
                end--;
        }
        return area;
    }
}

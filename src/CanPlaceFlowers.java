/**
 * Created by Vishwas on 08-02-2018.
 * https://leetcode.com/problems/can-place-flowers/description/
 */
public class CanPlaceFlowers {

    public static void main(String[] args) {
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        boolean canPlace = canPlaceFlowers.canPlaceFlowers(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, 0);
        System.out.print(canPlace);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length && count < n; i++) {
            if(flowerbed[i] == 0) {
                //get next and prev flower bed slot values. If i lies at the ends the next and prev are considered as 0.
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                if(next == 0 && prev == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count == n;
    }
}

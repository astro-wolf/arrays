import java.util.ArrayList;

/**
 * Created by Vishwas on 03-02-2018.
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 */
public class BuySellStock {

    public static void main(String[] args) {
        BuySellStock buySellStock = new BuySellStock();
        buySellStock.maxProfitWithOneTransactionAtATime(new int[]{2,1});
    }

    public int maxProfitBetter(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
    public int maxProfitWithOneTransactionAtATime(int[] prices) {
        int total = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1])
                total += prices [i] - prices[i - 1];
        }
        return total;
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0;
        int n = prices.length;
        ArrayList<Interval> intervals = new ArrayList<>();
        //limit is n-2, because min is being checked against n-2, because max has to be last one at-least
        while (i < n - 1) {
            Interval interval = new Interval();
            while (i < n - 1 && prices[i + 1] <= prices[i])
                i++;
            //we at last element, and there's nothing to look further
            //nobody making any profit from this array
            if (i == n - 1)
                break;
            //if we make it this far, put i into min
            //and increment i, so we can check max
            interval.buy = prices[i++];

            while (i < n && prices[i] > prices[i - 1])
                i++;
            interval.sell = prices[i - 1];
            intervals.add(interval);
        }

        if (intervals.isEmpty())
            return 0;
        int min = intervals.get(0).buy, max = intervals.get(0).sell;
        for (Interval interval : intervals) {
            if (interval.buy < min) {
                min = interval.buy;
                max = interval.sell;
            }
            if (interval.sell > max)
                max = interval.sell;
            maxProfit = Math.max(maxProfit, max - min);
        }

        return maxProfit;
    }

    private class Interval {
        int buy, sell;
    }

}

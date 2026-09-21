
// public class buysellstock {
//     public static int buyandsellstock(int prices[]) {
//         int buyprice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for (int i = 0; i < prices.length; i++) {
//             if (buyprice < prices[i]) {//profit
//                 int profit = prices[i] - buyprice;// today's profit
//                 maxProfit = Math.max(maxProfit, profit);
//             } else {
//                 buyprice = prices[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String args[]) {
//         int prices[] = {7, 1, 5, 3, 6, 4};
//         System.out.println("The max profit is: " + buyandsellstock(prices));
//     }
// }
public class buysellstock {

    public int profitFinding(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                System.out.println(" Profit " + profit);
                maxProfit = Math.max(profit, maxProfit);
                System.out.println(" Max profit " + maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String stock[]) {

        buysellstock BS = new buysellstock();

        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(" The maximum profit will be: " + BS.profitFinding(prices));
    }
}

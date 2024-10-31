public class BuyAndSellStockDP {

    public static int MaximumProfit(int prices[]) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // if we find a price lower than minPrice make it new minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;

    }

    public static void main(String[] args) {

        int prices[] = { 10, 22, 5, 75, 65, 80 };

        System.out.print("Given Array : ");
        for (int element : prices) {
            System.out.print(" " + element);
        }

        int result = MaximumProfit(prices);
        System.out.print("\nMaximum Possible Profit : " + result);
    }
}

package day18;

public class day18c {
        public int maxProfit(int[] prices) {
            int res = 0;
            for (int i = 0; i < prices.length; i++) {
                int buy = prices[i];
                for (int j = i + 1; j < prices.length; j++) {
                    int sell = prices[j];
                    res = Math.max(res, sell - buy);
                }
            }
            return res;
        }

        // Main method for testing
        public static void main(String[] args) {
            day18c sol = new day18c();

            int[] prices1 = {7, 1, 5, 3, 6, 4};
            int[] prices2 = {7, 6, 4, 3, 1};

            System.out.println("Max Profit (Test 1): " + sol.maxProfit(prices1)); // Expected 5
            System.out.println("Max Profit (Test 2): " + sol.maxProfit(prices2)); // Expected 0
        }

}

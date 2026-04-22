// BUY & SELL STOCKS 

// Problem:You are given an array where prices[i]is the price of a given stock on day i.
// You want to maximize your profit by choosing a day to buy the stock and a different day to sell it.
// Return the maximum profit you can achieve from this transaction.If no profit can be made,
// return 0.

// RULES:

// You may only buy and sell once.

// You cannot sell before you buy.

// INPUT:

// prices:An array of integers representing the stock price on each day.

// OUTPUT:

// Return an integer representing the maximum profit.

// TEST CASES:

// Input:prices=[7,1,5,3,6,4]Output:5 Explanation:Buy on day 2(price=1)and sell on day 5(price=6).Profit=6-1=5.

// Input:prices=[7,6,4,3,1]Output:0 Explanation:No profit can be made as prices continually decrease.

// Input:prices=[3,8,6,7,2]Output:5 Explanation:Buy on day 1(price=3)and sell on day 2(price=8).Profit=8-3=5.

// Input:prices=[1,2,3,4,5]Output:4 Explanation:Buy on day 1(price=1)and sell on day 5(price=5).Profit=5-1=4.

// Input:prices=[5,4,3,2,10]Output:8 Explanation:Buy on day 4(price=2)and sell on day 5(price=10).Profit=10-2=8.

// The goal of this exercise is to help you understand how to solve optimization problems efficiently 
// by finding the best time to buy and sell stocks in order to maximize profit.
// You'll apply your understanding of arrays and implement an algorithm that 
// tracks both the minimum buy price and maximum potential profit.

package LearningDataStructures.Array;

public class BuySellStocks {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            System.out.println("Input array cannot be null or empty.");
            return 0; // Return 0 for empty array case
        }

        int minPrice = Integer.MAX_VALUE; // Initialize minPrice to the largest possible integer value
        int maxProfit = 0; // Initialize maxProfit to 0

        for (int price : prices) { // Iterate through each price in the array
            if (price < minPrice)// Check if the current price is lower than the current minPrice
                minPrice = price; // Update minPrice if the current price is lower than the current minPrice
            else if (price - minPrice > maxProfit) // Check if the current profit (price - minPrice) is greater than the
                                                   // current maxProfit
                maxProfit = price - minPrice; // Update maxProfit if the current profit is greater than the current
                                              // maxProfit
        }

        return maxProfit; // Return the maximum profit found
    }

    public static void main(String[] args) {
        BuySellStocks bss = new BuySellStocks(); // Create an instance of the BuySellStocks class

        int[] prices1 = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Maximum Profit: " + bss.maxProfit(prices1)); // Expected Output: 5

        int[] prices2 = { 7, 6, 4, 3, 1 };
        System.out.println("Maximum Profit: " + bss.maxProfit(prices2)); // Expected Output: 0

        int[] prices3 = { 3, 8, 6, 7, 2 };
        System.out.println("Maximum Profit: " + bss.maxProfit(prices3)); // Expected Output: 5

        int[] prices4 = { 1, 2, 3, 4, 5 };
        System.out.println("Maximum Profit: " + bss.maxProfit(prices4)); // Expected Output: 4

        int[] prices5 = { 5, 4, 3, 2, 10 };
        System.out.println("Maximum Profit: " + bss.maxProfit(prices5)); // Expected Output: 8
    }

}

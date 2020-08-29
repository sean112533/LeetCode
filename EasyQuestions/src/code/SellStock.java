package code;

/**
 * Q121 Best time to buy and sell stock.
 * 
 * @author sanghunlee
 *
 */
public class SellStock {
  /**
   * method maxProfit to compare the previous array of integer to find the most profit number.
   * 
   * @param prices array of integer with certain numbers.
   * @return maximum profit from the array of integer values.
   */
  public int maxProfit(int[] prices) {
    int maxProf = 0, j = 0;
    for (int i = 1; i < prices.length; i++) {
      int compare = prices[i] - prices[j];
      if (compare > maxProf) {
        maxProf = compare;
      }
      if (prices[i] < prices[j])
        j = i;
    }
    return maxProf;
  }

  /**
   * main method to run the method.
   * 
   * @param args
   */
  public static void main(String[] args) {
    SellStock test = new SellStock();
    int[] prices = {7, 1, 5, 3, 6, 4};
    System.out.println(test.maxProfit(prices));
  }

}


